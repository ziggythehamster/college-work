///////////////////////////////////////////////////////////////////////////////
// InvoiceTest.java
///////////////////////////////////////////////////////////////////////////////
//
// Tests the Invoice class
// 
///////////////////////////////////////////////////////////////////////////////
//
// $Id: InvoiceTest.java 277 2007-09-14 03:35:17Z ziggythehamster $
//

public class InvoiceTest {
	public static void main(String args[]) {
		Invoice inv1, inv2, inv3, inv4;
		inv1 = new Invoice();
		inv2 = new Invoice();
		inv3 = new Invoice();
		inv4 = new Invoice();

		System.out.printf("Invoice Test\n");
		System.out.printf("====================================\n");
		
		// Test #1: Normal values
		inv1.setPartNumber("000-1111-000");
		inv1.setPartDescription("100ct Rusty Nails");
		inv1.setItemPrice(3.99);
		inv1.setItemQuantity(2);
		inspectInvoice(inv1);
		
		// Test #2: Illegal Values
		inv2.setPartNumber("000-1111-001");
		inv2.setPartDescription("3.8mm Security Bit");
		inv2.setItemPrice(-5.00);
		inv2.setItemQuantity(-5);
		inspectInvoice(inv2);
		
		// Test #3: Portion of a cent
		inv3.setPartNumber("000-1111-002");
		inv3.setPartDescription("Lock Washer");
		inv3.setItemPrice(0.123);
		inv3.setItemQuantity(10);
		inspectInvoice(inv3);
		
		// Test #4: Expensive items
		inv4.setPartNumber("000-1111-003");
		inv4.setPartDescription("Lawn Mower");
		inv4.setItemPrice(949.99);
		inv4.setItemQuantity(53); // A fleet of lawnmowers!
		inspectInvoice(inv4);
	}
	// inspectInvoice: prints values
	public static void inspectInvoice(Invoice inv) {
		System.out.printf("%s\t\t%s\n", inv.getPartNumber(), inv.getPartDescription());
		System.out.printf("  %d @ $%.2f/ea = $%.2f\n", inv.getItemQuantity(), inv.getItemPrice(), inv.getInvoiceAmount());
	}	
}