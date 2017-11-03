package array_fun;

import javax.swing.JOptionPane;

public class ArrayFun {

	public void showInstructions() {
		
		/*String msg = "Essential rules for arrays.";
		String msg1 = "1. Arrays have a FIXED length!!! At the time they are created.";
		String msg3 = "2. Two ways to set array size:";
		String msg4 = "-- one way is to set size when constructed";
		String msg5 = "-- other way is to set size from initial data";
		String msg6 = "Dynamic - when program is running";
		String msg7 = "Can NOT NOT NO WAY NO HOW change SIZE of array!!";
		String msg8 = "But OF COURSE you can change values!";
		
		
		msg = (msg + "\n" + msg1 + "\n" + msg3 + "\n" + msg4 + "\n" + msg5);
			*/
		
		String[] msgArray = {
				
				"Essential rules for arrays.",
				"1. Arrays have a FIXED length!!! At the time they are created.",
				 "2. Two ways to set array size:",
				 "-- one way is to set size when constructed",
				 "-- other way is to set size from initial data",
				 "Dynamic - when program is running",
				"Can NOT NOT NO WAY NO HOW change SIZE of array!!",
				"But OF COURSE you can change values!"
				
		};
		
		
		JOptionPane.showMessageDialog(null, msgArray);
		
	}
	
	public void intArrayExample() {
		
		// Why an array? Store TONS of info in a single, easy var!
		
		//int[] intTest = new int(10);
		int[] intTest = new int[10]; // int intTest[] -- this is "math notation"
		int[] intTwoTest = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int i;
		System.out.println("\nStarting test of intTest[]\n");
		for (i = 0; i < 10; i++); {
			
			System.out.println("intTest[" + i + "]: " + intTest[i]);
			
		}
	}
	
}
