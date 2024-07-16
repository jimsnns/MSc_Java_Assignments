/*
 * author: Dimitris Sinanis, RN 150615 
 * Title: THEMA6
 */
package Assignment_7;

public class MainProgram4 {
	public static void main(String [] args) {
		SupermarketSalesToFile.setSupermarketName("Sklavenitis");//the call of setSupermarketName method, instantly from the class and without object creation.
		double [][] athina={{1000.58,4587.62,4587.55,8787.87},{8784.56,4587.48,787.56,7889.87},{8799.87,7879.45,789.45,9897.55}};//the initialization of the first 2d array.
		SupermarketSalesToFile kat1=new SupermarketSalesToFile(athina);//the object creation.
		kat1.setPoli("Athina");//the use of method setPoli, in order to set city's name.
		kat1.getKatastimataSales();//the use of method getKatastimataSales, in order to get the total income per branch in this city.
		double [][] patra= {{1000.58,4587.62,4587.55,8787.87},{8784.56,4587.48,787.56,7889.87}};//the initialization of the second 2d array.
		SupermarketSalesToFile kat2=new SupermarketSalesToFile(patra);//the object creation.
		kat2.setPoli("Patra");//the use of method setPoli, in order to set city's name.
		kat2.getKatastimataSales();//the use of method getKatastimataSales, in order to get the total income per branch in this city.
	}//end of main.
}//end of class.