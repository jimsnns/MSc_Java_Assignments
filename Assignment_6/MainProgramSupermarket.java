/*
 * author: Dimitris Sinanis
 * Title: THEMA6
 */
package Assignment_6;

public class MainProgramSupermarket {
	public static void main(String[]args) {
		double  input [][] = {{1000.58,4587.62,4587.55,8787.87},{8784.56,4587.48,787.56,7889.87},{8799.87,7879.45,789.45,9897.55}};//initializing the 2d array.
		SupermarketSales obj=new SupermarketSales(input);//the object created from the SupermarketSales class.
		obj.getKatastimataSales();//the call of getKatastimataSales method from SupermarketSales class.
		System.out.println("==========================================================");
		obj.getProductSales();//the call of getProductSales method from SupermarketSales class.
		System.out.println("==========================================================");
		obj.getSupermarketSales();//the call of getSupermarketSales method from SupermarketSales class.
	}//end of main.
}//end of class.
