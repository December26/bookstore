package homework6;

import java.util.ArrayList;

public class CompositeStrategy implements IPricingStrategy {
	private ArrayList<IPricingStrategy> strategies;
	private int strategyType;
	private String strategyName;
	private String strategyId;
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

}
