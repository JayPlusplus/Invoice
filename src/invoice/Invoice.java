package invoice;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Invoice {

	public static void printInvoice() {
		
		String sku; int quan;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please input the sku number for your book");
		sku = keyboard.next();
		Book db = BookDB.returnBook(sku);
		System.out.println("How many do you need?");
		quan = keyboard.nextInt();
		db.setQuantity(quan);
		System.out.println("-------receipt----------"
				+ "\nSku: " + db.getSku() 
				+ "\nTitle:" + db.getTitle() + "\nQuantity: " 
				+ db.getQuantity() + "\nDescription:" + db.getDescription() + "\nPrice: " 
				+ db.getPrice());
		double total = db.getQuantity() * db.getPrice();
		
		System.out.println("Your subtotal is " + total);
		System.out.println("Tax: " + (testCurrency(total*0.0675)));
		double grandTotal = total*0.0675;
		System.out.println("Your grand total is " +(testCurrency(grandTotal)));
		System.out.println( );
	}		
		
		public static String testCurrency(double total) {

			// use Locale format to pass currentLocale variable to NumberFormat.getCurrencyInstance
			Locale currentLocale = Locale.getDefault();
			NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(currentLocale);
			//set maximum fraction digits to 2
			currencyFormatter.setMaximumFractionDigits(2);
			String currencyOut = currencyFormatter.format(total);
		
			
			return currencyOut;
	}

}
