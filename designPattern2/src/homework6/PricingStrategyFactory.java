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
	
	IPricingStrategy getPricingStrategy(int bookType, double discount) {
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
			return new CompositeBestForCustomer();
		}
		
		else {
			return new NoDiscountStrategy();
		}
	}
}
