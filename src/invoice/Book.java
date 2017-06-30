package invoice;

//storing data for the book.
public class Book{
	
	private String sku;
	private String title;
	private String author;
	private String description;
	public int quantity;
	public double price;
	
	
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if (price < 100) {
			this.price = price;
		}
		
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void printDescription() {
		System.out.printf("%s %s %s %f", getAuthor(), getTitle(), getDescription(), getPrice());
	}
	
	public void printPrice(int quantity) {
	}
	
}
