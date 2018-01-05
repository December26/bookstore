package homework6;

public class Controller {
	
	private BookCatalog bookCatalog = new BookCatalog();
	

	private StrategyCatalog strategyCatalog = new StrategyCatalog();
	
	private IPricingStrategy sub1, sub2;
	
	public void addBook(String isbn, double price, String title, int type) {
		BookSpecification newBook = new BookSpecification(isbn, price, title, type);
		bookCatalog.addBook(newBook);
	}
	
	public void addCompositeStrategy(String id, String name, int bookType, int subs) {
		PricingStrategyFactory psf = PricingStrategyFactory.getInstance();
		
		int a = subs/10;
		int b = subs%10;
		
		sub1 = strategyCatalog.subStrategy(a);
		sub2 = strategyCatalog.subStrategy(b);
		//System.out.println(a+"     "+b);
		
		CompositeBestForCustomer strategy = (CompositeBestForCustomer) psf.getPricingStrategy(bookType, 0, strategyCatalog.subStrategy(a), strategyCatalog.subStrategy(b));
		strategy.setStrategyId(id);
		strategy.setStrategyName(name);
		strategy.setDiscount(subs);
		strategyCatalog.addStrategy(strategy);
		
		//System.out.println("组合策略添加成功");
	}
	
	public void addSimpleStrategy(String id, String name, int bookType, double discount) {
		PricingStrategyFactory psf = PricingStrategyFactory.getInstance();
		IPricingStrategy strategy = psf.getPricingStrategy(bookType,discount, null, null);
		System.out.println(id);
		System.out.println(name);
		strategy.setStrategyId(id);
		//System.out.println(strategy.getId());
		strategy.setStrategyName(name);
		//System.out.println(strategy.getStrategyName());
		strategyCatalog.addStrategy(strategy);
		
	}
	
	public void deleteStrategy(String id) {
		strategyCatalog.deleteStrategy(id);
	}
	
	public void updateStrategy(String id, String name, int bookType, double discount) {
		strategyCatalog.updateStrategy(id, name, bookType, discount);
	}
	
	public SaleLineItem buyBook(String isbn, double price, String title, int type, int copies) {
		BookSpecification book = new BookSpecification(isbn, price, title, type);
		double discount = strategyCatalog.getDiscountByBook(type);
		SaleLineItem item = new SaleLineItem(copies, book, discount, sub1, sub2); 
		return item;
	}
	
	public BookCatalog getBookCatalog() {
		return bookCatalog;
	}
	
	public StrategyCatalog getStrategyCatalog() {
		return strategyCatalog;
	}
	
}
