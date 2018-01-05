package homework6;

import java.util.HashMap;
import java.util.Iterator;

public class StrategyCatalog {
	private HashMap<String, IPricingStrategy> strategies= new HashMap<>(10);
	private Object[][] information = new Object[10][5];
	
	public void addStrategy(IPricingStrategy strategy) {
		strategies.put(strategy.getId(), strategy);
	}

	public double getDiscountByBook(int bookType) {
		Iterator it = strategies.keySet().iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			if(strategies.get(key).getbookType() == bookType) {
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
				System.out.println(id);
				strategies.remove(id);
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
	
	public Object[][] info(){
		Iterator it = strategies.keySet().iterator();
		int i = 0;
		while(it.hasNext()) {
			String key = (String)it.next();
			information[i][0] = strategies.get(key).getId();
			information[i][1] = strategies.get(key).getStrategyName();
			information[i][2] = strategies.get(key).getType();
			information[i][3] = strategies.get(key).getbookType();
			information[i][4] = strategies.get(key).getDiscount();
			i++;
		}
		return information;
	}
}
