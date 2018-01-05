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
	@Override
	public void setStrategyName(String strategyName) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setStrategyId(String strategyId) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double getDiscount() {
		// TODO Auto-generated method stub
		return 0;
	}
}
