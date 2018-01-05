package homework6;

public interface IPricingStrategy {
	public double getSubTotal(SaleLineItem item);
	public int getType();
	public String getId();
	public void setStrategyName(String strategyName);
	public void setStrategyId(String strategyId);
	public double getDiscount();
}
