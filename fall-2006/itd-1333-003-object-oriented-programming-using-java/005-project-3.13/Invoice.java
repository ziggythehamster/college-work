///////////////////////////////////////////////////////////////////////////////
// Invoice.java
///////////////////////////////////////////////////////////////////////////////
//
// An invoice class for a hardware store
// 
///////////////////////////////////////////////////////////////////////////////
//
// $Id: Invoice.java 277 2007-09-14 03:35:17Z ziggythehamster $
//

public class Invoice {
	// Instance Variables
	String p_partNumber;
	String p_partDescription;
	int p_itemQuantity;
	double p_itemPrice;
	
	// Constructor
	public Invoice() {
		p_partNumber = new String();
		p_partDescription = new String();
		p_itemQuantity = 0;
		p_itemPrice = 0.0;
	}
	
	// partNumber
	public String getPartNumber() {
		return p_partNumber;
	}
	public void setPartNumber(String s) {
		p_partNumber = s;
	}
	
	// partDescription
	public String getPartDescription() {
		return p_partDescription;
	}
	public void setPartDescription(String s) {
		p_partDescription = s;
	}
	
	// itemQuantity
	public int getItemQuantity() {
		return p_itemQuantity;
	}
	public void setItemQuantity(int i) {
		if (i > 0) {
			p_itemQuantity = i;
		} else {
			p_itemQuantity = 0;
		}
	}
	
	// itemPrice
	public double getItemPrice() {
		return p_itemPrice;
	}
	public void setItemPrice(double d) {
		if (d > 0.0) {
			p_itemPrice = d;
		} else {
			p_itemPrice = 0.0;
		}
	}
	
	// getInvoiceAmount
	public double getInvoiceAmount() {
		return p_itemPrice * p_itemQuantity;
	}
}