package homework6;

public class PercentageStrategy implements IPricingStrategy {
	private int discountPercentage;
	private int strategyType;
	private String strategyName;
	private String strategyId;
	private String type = "百分比折扣策略";
	@Override
	public double getSubTotal(SaleLineItem item) {
		double subTotal = item.getCopies()*item.getProdSpec().getPrice()*(double)(100-discountPercentage)/100;
		return subTotal;
	}
	
	public PercentageStrategy(int discountPercentage, int strategyType) {
		this.discountPercentage = discountPercentage;
		this.strategyType = strategyType;
	}

	@Override
	public int getType() {
		return strategyType;
	}
	
	@Override
	public String getId() {
		return strategyId;
	}

	public int getDiscountPercentage() {
		return discountPercentage;
	}


	public String getStrategyName() {
		return strategyName;
	}

	public void setDiscountPercentage(int discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public void setStrategyType(int strategyType) {
		this.strategyType = strategyType;
	}

	public void setStrategyName(String strategyName) {
		this.strategyName = strategyName;
	}

	public void setStrategyId(String strategyId) {
		this.strategyId = strategyId;
	}

	@Override
	public double getDiscount() {
		return discountPercentage;
	}
	
	
}
