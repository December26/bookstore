package homework6;

import java.util.HashMap;

public class StrategyCatalog {
	private HashMap<String, IPricingStrategy> strategies= new HashMap<>();
	
	public void addStrategy(IPricingStrategy strategy) {
		strategies.put(strategy.getId(), strategy);
	}
}
