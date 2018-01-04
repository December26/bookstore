package homework6;

public class SaleLineItem {
	private int copies;
	private BookSpecification prodSpec;
	private IPricingStrategy strategy;
	
	public SaleLineItem(int copies, BookSpecification prodSpec) {
		this.copies = copies;
		this.prodSpec = prodSpec;
	}
	
	public double getSubTotal() {
		PricingStrategyFactory psf = PricingStrategyFactory.getInstance();
		strategy = psf.getPricingStrategy(prodSpec.getType());
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
