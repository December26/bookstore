package homework6;

import java.util.ArrayList;

public class BookCatalog {
	private ArrayList<BookSpecification> books = new ArrayList<>();
	private Object[][] information = new Object[20][4];
	
	public BookSpecification getBookSpecification(String book) {
		for(int i=0;i<books.size();i++) {
			if(books.get(i).getIsbn().equals(book)) {
				return books.get(i);
			}
		}
		return null;
	}
	
	public void addBook(BookSpecification book) {
		books.add(book);
	}
	
	public Object[][] info(){
		for(int i=0;i<books.size();i++) {
			information[i][0] = books.get(i).getIsbn();
			information[i][1] = books.get(i).getTitle();
			information[i][2] = books.get(i).getPrice();
			information[i][3] = books.get(i).getType();
		}
		return information;
	}
}
