/*
 * author: Dimitris Sinanis 
 * Title: THEMA1
 */
import java.util.Scanner; //for typing values from the keyboard
public class Holiday{
   public static void main(String[]args){
       int choice, i;
       int ch1=0, ch2=0, ch3=0, sum1=0, sum2=0, sum3=0;
       double vote1=0,vote2=0,vote3=0;
       for (i=0;i<20;i++){
       Scanner kb = new Scanner(System.in);
       System.out.println("------------------------------------------------------------");
       System.out.println("Please type 1 for Mykonos, 2 for Santorini and 3 for Rhodes: ");
       choice=kb.nextInt();//takes the number of the keyboard input       
       if(choice==1){
       ch1++;
       System.out.println("Your favorite destination is Mykonos");}
       else if (choice==2){
       ch2++;
       System.out.println("Your favorite destination is Santorini");}
       else if (choice==3){
       ch3++;
       System.out.println("Your favorite destination is Rhodes");}
       else{
       System.out.println("Invalid input! Please type again 1, 2 or 3: ");
      choice=kb.nextInt();
       i--;//in case that voter types a different number, this counter undo the i++
    }
    }
    double rate1, rate2, rate3;
    rate1 = ((ch1*100)/20);
    rate2 = ((ch2*100)/20);
    rate3 = ((ch3*100)/20);
    System.out.println("----------Results----------");
    System.out.println("Mykonos rate: " +rate1+" % " + "Santorini rate: "+rate2 +" % "+"Rhodes rate: " +rate3+ " %");
    if (ch1>ch2 && ch1>ch3)//checking and printing which one is the best destination, according with the votes
    System.out.println("Mykonos is the best destination with "+ch1+" votes");
    else if (ch2>ch1 && ch2>ch3)
    System.out.println("Santorini is the best destination with "+ch2+" votes");
    else if (ch3>ch2 && ch3>ch1)
    System.out.println("Rhodes is the best destination with "+ch3+" votes");
    if (ch1<ch2 && ch1<ch3)//checking and printing the destination with the fewer votes
    System.out.println("Mykonos has the fewer votes: "+ch1+" votes");
    else if (ch2<ch1 && ch2<ch3)
    System.out.println("Santorini has the fewer votes: "+ch2+" votes");
    else if (ch3<ch2 && ch3<ch1)
    System.out.println("Rhodes has the fewer votes: "+ch3+" votes");
  }//end of main method
}//end of class