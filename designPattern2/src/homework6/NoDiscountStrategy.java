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
	@Override
	public void setBookType(int bookType) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setDiscount(double discount) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getbookType() {
		// TODO Auto-generated method stub
		return strategyType;
	}
	@Override
	public String getStrategyName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}
}
