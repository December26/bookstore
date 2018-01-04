package homework6;

import java.util.ArrayList;

public class Sale implements Subject {

	private ArrayList<SaleLineItem> items = new ArrayList<>();
	private Observer observer;
	
	@Override
	public void registerObserver(Observer o) {
		observer = o;
		
	}

	@Override
	public void removeObserver(Observer o) {
		
		
	}

	@Override
	public void notifyObserver() {
		observer.update(this);
		
	}
	
	public double getTotal() {
		double total = 0;
		for(int i=0;i<items.size();i++) {
			total = total + items.get(i).getSubTotal();
		}
		return total;
	}
	
	public void buyBook(SaleLineItem item) {
		items.add(item);
	}

	public ArrayList<SaleLineItem> getItems() {
		return items;
	}
	
}
