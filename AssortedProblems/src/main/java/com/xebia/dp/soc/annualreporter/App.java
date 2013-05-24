package com.xebia.dp.soc.annualreporter;

/**
 * Separation Of concern Pattern to be used to implement the solution
 * This class parses a CSV file and reports the annual sales
 * CSV Format
 * Month,Sales,Salesman
 * January,100,Vinod
 * January,300, Akash
 * February,50,Vijay
 * January,250,Vikas
 * February,180.5,Vinod
 * March,200, Akash
 * ...
 *
 * My output should be -
 * Month,Total Sales,Best Salesman(His Sales)
 * January, 650, Akash(300)
 *
 * The output should be printed on the screen
 */
public class App 
{
    public static void main(String[] args){
        String fileName = args[0];
		App myApp = new App();
		Data[] data = myApp.readFile(fileName);
		generateAndPrintReport(data);
    }

	private static void generateAndPrintReport(Data[] data) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	private Data[] readFile(String fileName) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	
}
