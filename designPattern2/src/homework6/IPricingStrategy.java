package homework6;

public interface IPricingStrategy {
	public double getSubTotal(SaleLineItem item);
	public int getbookType();
	public String getId();
	public void setStrategyName(String strategyName);
	public void setStrategyId(String strategyId);
	public double getDiscount();
	public String getStrategyName();
	public String getType();
	public void setBookType(int bookType);
	public void setDiscount(double discount);
}
