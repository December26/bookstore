package homework6;

public class FlatRateStrategy implements IPricingStrategy {
	private double discountPerBook;
	private int strategyType;
	private String strategyName;
	private String strategyId;
	private String type = "绝对值优惠策略";
	
	public FlatRateStrategy(double discount, int strategyType) {
		discountPerBook = discount;
		this.strategyType = strategyType;
	}
	
	@Override
	public double getSubTotal(SaleLineItem item) {
		double subTotal = item.getCopies()*(item.getProdSpec().getPrice()-discountPerBook);
		return subTotal;
	}
	@Override
	public int getType() {
		return strategyType;
	}
	
	@Override
	public String getId() {
		return strategyId;
	}

	public double getDiscountPerBook() {
		return discountPerBook;
	}

	public String getStrategyName() {
		return strategyName;
	}


	public void setStrategyName(String strategyName) {
		this.strategyName = strategyName;
	}

	public void setStrategyId(String strategyId) {
		this.strategyId = strategyId;
	}

	@Override
	public double getDiscount() {
		return discountPerBook;
	}

	@Override
	public void setBookType(int bookType) {
		strategyType = bookType;
		
	}

	@Override
	public void setDiscount(double discount) {
		this.discountPerBook = discount;
		
	}
	
	
	
}
