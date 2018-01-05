package homework6;

public class PricingStrategyFactory {
	private static PricingStrategyFactory instance;
	private PricingStrategyFactory() {}
	
	public static PricingStrategyFactory getInstance() {
		if(instance == null) {
			instance = new PricingStrategyFactory();
		}
		return instance;
	}
	
	IPricingStrategy getPricingStrategy(int bookType, double discount, IPricingStrategy sub1, IPricingStrategy sub2) {
		if(bookType == 1) {
			return new PercentageStrategy((int)discount, bookType);
		}
		
		else if(bookType == 2) {
			
			return new FlatRateStrategy(discount, bookType);
		}
		
		else if(bookType == 3) {
			return new PercentageStrategy((int)discount, bookType);
		}
		
		else if(bookType == 4) {
			return new CompositeBestForCustomer(sub1, sub2, bookType);
		}
		
		else {
			return new NoDiscountStrategy();
		}
	}
}
