package homework6;

public class NoDiscountStrategy implements IPricingStrategy {
	private int strategyType;
	private String strategyName;
	private String strategyId;
	@Override
	public double getSubTotal(SaleLineItem item) {
		double subTotal = item.getCopies()*item.getProdSpec().getPrice();
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
