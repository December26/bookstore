package homework6;

import java.util.ArrayList;

public class CompositeStrategy implements IPricingStrategy {
	private ArrayList<IPricingStrategy> strategies = new ArrayList<>();
	private int strategyType;
	private String strategyName;
	private String strategyId;
	private String type = "×éºÏ²ßÂÔ";
	
	public CompositeStrategy(IPricingStrategy sub1, IPricingStrategy sub2, int strategyType) {
		add(sub1);
		add(sub2);
		this.strategyType = strategyType;
	}
	
	@Override
	public double getSubTotal(SaleLineItem item) {
		double total1 = strategies.get(0).getSubTotal(item);
		double total2 = strategies.get(1).getSubTotal(item);
		if(total1<total2) return total1;
		else return total2;
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

	@Override
	public void setBookType(int bookType) {
		strategyType = bookType;
		
	}

	@Override
	public void setDiscount(double discount) {
		// TODO Auto-generated method stub
		
	}

	
}
