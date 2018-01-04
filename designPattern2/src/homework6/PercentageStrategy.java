package homework6;

public class PercentageStrategy implements IPricingStrategy {
	private int discountPercentage;
	private int strategyType;
	private String strategyName;
	private String strategyId;
	@Override
	public double getSubTotal(SaleLineItem item) {
		double subTotal = item.getCopies()*item.getProdSpec().getPrice()*(double)(100-discountPercentage)/100;
		return subTotal;
	}
	
	public PercentageStrategy(int discountPercentage) {
		this.discountPercentage = discountPercentage;
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
