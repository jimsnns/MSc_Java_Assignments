/*
 * author: Dimitris Sinanis, RN 150615 
 * Title: THEMA6
 */

package Assignment_6;

public class SupermarketSales {
	public double [][] sales;
	public int katastimata, products;
	
	public SupermarketSales(double sales [][]) {
		int i,j = 0;
		this.katastimata=sales[0].length;//the array is immutable so all the columns have the same length (3 rows).
		this.products=sales.length;
			for(i=0;i<this.products;i++) {
				for (j=0;j<this.katastimata;j++) {
					if(sales[i][j]>=0) 
						this.sales=sales;//assigns the sales of each branch (katastimata) in 2d array, if the value is greater than zero.
					else{
						System.out.println("Invalid input!!!");//message if the value is negative.
						System.exit(1);
					}	
				}		
			}
		this.katastimata=i;//number of rows.
		this.products=j;//number of columns.
	}//end of constructor 	
	
	public void getKatastimataSales() {//this method calculates the total income per branch.
		for(int i=0;i<this.katastimata;i++) {
			double sum = 0;
			for(int j=0;j<this.products;j++) {
				sum+=sales[i][j];
			}
			System.out.println("Katastima No: "+i);
			System.out.println(" Total income is: "+sum+"\n");
		}
	}//end of getKatastimataSales method.
	
	public void getProductSales() {//this method calculates the total sales of each product and the average income per branch for each product.
		for(int i=0;i<this.products;i++) {
			double sum = 0.0, average=0.0;
			for(int j=0;j<this.katastimata;j++) {
				sum+=sales[j][i];
				average++;	
			}
			System.out.println("Proion No: "+i);
			System.out.println(" Total income is: "+sum);
			System.out.println(" Average income ana katastima is: "+sum/average);
		}		
	}// end of getProductSales method.
	
	public void getSupermarketSales() {//this method calculates the total income of all the Supermarket's branches and the average income per branch.
		double sumrow=0;
		double count=0;
		for (int i=0;i<this.katastimata;i++) {
			for(int j=0;j<this.products;j++) {
				sumrow+=sales[i][j];
			}
			count++;
		}
		System.out.println("\n"+"The total income of all the Supermarket's katastimata is: "+sumrow);
		System.out.println("Average income per katastima is: "+sumrow/count);
	}//end of getSupermarketSales method.
}//end of class.
