package homework6;

public class FlatRateStrategy implements IPricingStrategy {
	private double discountPerBook = 1;
	private int strategyType;
	private String strategyName;
	private String strategyId;
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

	
}
