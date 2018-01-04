package homework6;

public class BookSpecification {
	private String  isbn;
	private double price;
	private String title;
	private int type;
	
	public BookSpecification() {}
	
	public BookSpecification(String isbn, double price, String title, int type) {
		this.isbn = isbn;
		this.price = price;
		this.title = title;
		this.type = type;
	}

	public double getPrice() {
		return price;
	}
	
	public int getType() {
		return type;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}
	
	
}
