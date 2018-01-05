package homework6;

public class CompositeBestForCustomer extends CompositeStrategy {

	
	public CompositeBestForCustomer(IPricingStrategy sub1, IPricingStrategy sub2, int strategyType) {
		super(sub1, sub2, strategyType);
	}
}
