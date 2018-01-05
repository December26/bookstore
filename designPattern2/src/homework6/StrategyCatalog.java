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
	
	public IPricingStrategy subStrategy(int a) {
		String  sub = "Discount00"+a;
		Iterator it = strategies.keySet().iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			if(strategies.get(key).getId().equals(sub)) {
				return strategies.get(key);
			}
		}
		return null;
	}
	
	public void deleteStrategy(String id) {
		Iterator it = strategies.keySet().iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			if(strategies.get(key).getId().equals(id)) {
				strategies.remove(key);
			}
		}
	}
	
	public void updateStrategy(String id, String name, int bookType, double discount) {
		Iterator it = strategies.keySet().iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			if(strategies.get(key).getId().equals(id)) {
				strategies.get(key).setStrategyId(id);
				strategies.get(key).setStrategyName(name);
				strategies.get(key).setBookType(bookType);
				strategies.get(key).setDiscount(discount);
			}
		}
	}
}
