package homework6;

import java.util.HashMap;
import java.util.Iterator;

public class StrategyCatalog {
	private HashMap<String, IPricingStrategy> strategies= new HashMap<>();
	
	public void addStrategy(IPricingStrategy strategy) {
		strategies.put(strategy.getId(), strategy);
	}

	public double getDiscountByBook(int bookType) {
		Iterator it = strategies.keySet().iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			if(strategies.get(key).getType() == bookType) {
				return strategies.get(key).getDiscount();
			}
				
		}
		return 2;
	}
}
