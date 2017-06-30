package invoice;

//	populates book with specific values.

public class BookDB {

	public static Book returnBook(String sku) {
		String title = " ";
		String author = " ";
		String description = " ";
		double price = 0.0;
		
		if (sku.equals("Java1001")) {
			title = "Head First Java";
			author = "Kathy Sierra and Bert Bates";
			description = "Easy to read Java workbook";
			price = 47.50;
		}

		else if (sku.equals("Java1002")) {
			title = "Thinking in Java";
			author = "Bruce Eckel";
			description = "Details about Java under the hood";
			price = 20.00;
		}
		else if (sku.equals("Orcl1003")) {
			title = "OCP: Oracle Certified Professional Java SE";
			author = "Jeanne Boyarsky";
			description = "Everything you need to know in one place";
			price = 45.00;
		}
		else if (sku.equals("Python1004")) {
			title = "Automate the Boring Stuff with Python";
			author = "AI Swigart";
			description = "Fun with Python";
			price = 10.50;
		}
		else if (sku.equals("Zombie1005")) {
			title = "The Maker's Guide to the Zombie Apocalypse";
			author = "Simon Monk";
			description = "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi";
			price = 16.50;
		}
		else if (sku.equals("Rasp1006")) {
			title = "Raspberry Pi projects for the Evil Genius";
			author = "Donald Norris";
			description = "A dozen fiendishly fun projects for the Raspberry Pi!";
			price = 14.75;
		}
		
		Book r = new Book();
		r.setSku(sku);
		r.setTitle(title);
		r.setAuthor(author);
		r.setDescription(description);
		r.setPrice(price);
		
		return r;
		
	}
	
	}

