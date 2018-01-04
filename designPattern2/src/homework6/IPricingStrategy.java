package homework6;

public interface IPricingStrategy {
	public double getSubTotal(SaleLineItem item);
	public int getType();
	public String getId();
}
