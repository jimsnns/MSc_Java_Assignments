/*
 * author: Dimitris Sinanis
 * Title: THEMA7
 */
package Assignment_7;

import java.io.*;
import Assignment_6.SupermarketSales;

public class SupermarketSalesToFile extends SupermarketSales {//this class is a subclass of SupermarketSales from thema3.
	static String supermarketname;
	private String poli;
	SupermarketSalesToFile(double s[][]){
		super (s);//the keyword super used for the initialization of the 2d array as defined in the constructor of the superclass SupermarketSales thema3.
	}
	public static void setSupermarketName(String supermarket) {//this method sets the name of the supermarket.
		supermarketname=supermarket;
	}
	public void setPoli(String poli) {//this method sets the name of the city (poli)
		this.poli=poli;
	}
	public String getPoli(String poli) {//this method returns the name of the city (poli) was set before.
		return "Poli: "+poli;
	}
	@Override//overriding the method getKatastimataSales from the superclass SupermarketSales.
	public void getKatastimataSales() {
		try {
				Writer f=new FileWriter(poli+".txt");//creating the new file with the city's name as a title and .txt as a file type.
				BufferedWriter bufw=new BufferedWriter(f);
				PrintWriter file=new PrintWriter(bufw);
				file.println(supermarketname);//the use of println method of the PrintWriter class. this one writes the supermarketname in the file.
				file.println(getPoli(poli));//the use of println method of the PrintWriter class. this one writes the city's name (poli) in the file.
				for(int i=0;i<this.katastimata;i++) {//the loops are used for reading and summarize the values of 2d array.
					double sum = 0;
					for(int j=0;j<this.products;j++) {
						sum+=sales[i][j];
					}
					file.println(("Katastima No: "+i));
					file.println(" Total income is: "+sum+"\n");
				}
				file.close();//this closes PrintWriter.
		}//end of try
		catch(Exception e) {//exception handling.
			System.out.println("Error: "+e.getMessage());
			System.exit(1);
		}//end of exception handling.
		finally {//finally block is used in order to give a result to the user, after the execution of the program. It's not  necessary.
			System.out.println("The values are written successfully to the files!!!");
		}		
	}//end of method		
}//end of class

