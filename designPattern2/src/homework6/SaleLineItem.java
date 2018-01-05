package homework6;

public class SaleLineItem {
	private int copies;
	private BookSpecification prodSpec;
	private IPricingStrategy strategy, sub1, sub2;
	private double discount;
	
	public SaleLineItem(int copies, BookSpecification prodSpec, double discount, IPricingStrategy sub1, IPricingStrategy sub2) {
		this.copies = copies;
		this.prodSpec = prodSpec;
		this.discount = discount;
		this.sub1 = sub1;
		this.sub2 = sub2;
	}
	
	public double getSubTotal() {
		PricingStrategyFactory psf = PricingStrategyFactory.getInstance();
		strategy = psf.getPricingStrategy(prodSpec.getType(),discount, sub1, sub2);
		return strategy.getSubTotal(this);
	}
	
	public int getCopies() {
		return copies;
	}

	public BookSpecification getProdSpec() {
		return prodSpec;
	}

	public IPricingStrategy getStrategy() {
		return strategy;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}

	public void setProdSpec(BookSpecification prodSpec) {
		this.prodSpec = prodSpec;
	}

	public void setStrategy(IPricingStrategy strategy) {
		this.strategy = strategy;
	}
}
