package homework6;

public class Controller {
	
	private BookCatalog bookCatalog = new BookCatalog();
	

	private StrategyCatalog strategyCatalog = new StrategyCatalog();
	
	public void addBook(String isbn, double price, String title, int type) {
		BookSpecification newBook = new BookSpecification(isbn, price, title, type);
		bookCatalog.addBook(newBook);
	}
	
	public void addCompositeStrategy() {
		
	}
	
	public void addSimpleStrategy(String id, String name, int bookType, double discount) {
		PricingStrategyFactory psf = PricingStrategyFactory.getInstance();
		IPricingStrategy strategy = psf.getPricingStrategy(bookType,discount);
		strategy.setStrategyId(id);
		strategy.setStrategyName(name);
		strategyCatalog.addStrategy(strategy);
	}
	
	public void deleteStrategy() {
		
	}
	
	public void updateStrategy() {
		
	}
	
	public SaleLineItem buyBook(String isbn, double price, String title, int type) {
		BookSpecification book = new BookSpecification(isbn, price, title, type);
		double discount = strategyCatalog.getDiscountByBook(type);
		SaleLineItem item = new SaleLineItem(1, book, discount); 
		return item;
	}
	
	public BookCatalog getBookCatalog() {
		return bookCatalog;
	}
	
}
