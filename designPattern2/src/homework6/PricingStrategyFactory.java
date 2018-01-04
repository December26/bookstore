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
	
	IPricingStrategy getPricingStrategy(int bookType) {
		if(bookType == 1) {
			return new PercentageStrategy(3);
		}
		
		else if(bookType == 2) {
			
			return new FlatRateStrategy();
		}
		
		else if(bookType == 3) {
			return new PercentageStrategy(7);
		}
		
		else if(bookType == 4) {
			return new CompositeBestForCustomer();
		}
		
		else {
			return new NoDiscountStrategy();
		}
	}
}
