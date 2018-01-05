package homework6;

import java.util.ArrayList;

public class CompositeStrategy implements IPricingStrategy {
	private ArrayList<IPricingStrategy> strategies;
	private int strategyType;
	private String strategyName;
	private String strategyId;
	private String type = "×éºÏ²ßÂÔ";
	@Override
	public double getSubTotal(SaleLineItem item) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void add(IPricingStrategy s) {
		strategies.add(s);
	}

	@Override
	public int getType() {
		return strategyType;
	}

	@Override
	public String getId() {
		return strategyId;
	}

	public ArrayList<IPricingStrategy> getStrategies() {
		return strategies;
	}

	public String getStrategyName() {
		return strategyName;
	}

	public void setStrategies(ArrayList<IPricingStrategy> strategies) {
		this.strategies = strategies;
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
		// TODO Auto-generated method stub
		return 0;
	}

	
}
