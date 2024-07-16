package Assignment_2;

/*
 * author: Dimitris Sinanis 
 * Title: THEMA2
 */
import java.util.Scanner;
public class AMKA{
  public static void main(String[]args){
    char option;
    do{//to check if user wants to insert other values. proceeds if the input is yes, stops the program if the input is no 
     Scanner kb = new Scanner(System.in);
     String input, vars, val;
     char var1;
     int i=0;
     int [] num = new int[11];//the table we use to save the values of AMKA
     do{//checks the length of the numbers(String) that users type
      System.out.println("=============================");
      System.out.println("Please give AMKA number: ");
      System.out.println("=============================");
      input=kb.next();
      if(input.length()>11 || input.length()<11)//checks the number and informs the user to type again if it's not false  
      System.out.println("Please check the number again");
     }while (input.length()<11 || input.length()>11);
       System.out.println("\n");
       System.out.println("The AMKA is: "+input);//it shows the AMKA number of the user
     while (i<11){//this iteration inserts the number in a single-dimension table
        int x=input.charAt(i); 
        int a=Character.getNumericValue(x);
        if (Character.isDigit(x)){
        num[i] =a; 
        i++;}
        else
        do{
        System.out.println("===============================");
        System.out.println("Please type again only digits: ");
        input=kb.next();
       }while (Character.isDigit(i));//checks if the number consists of digits, if true proceeds, if false asks the number again
     }
       int year;
       System.out.println("=================================");
       System.out.println("Please insert the current year");
       System.out.println("=================================");
       year =kb.nextInt();//the user inserts the current year
       if(num[4]>=2){//according with the exercise all users are born after 1920, so the fifth number of the table must be greater or equal to 2
       int dob= 1900+num[4]*10+num[5];//calculates the date of birth
       int age=year-dob;//calculates the age of the user
       System.out.println("The age is: "+age);}
       else{//in case that user has born after 2000 
       int dob= 2000+num[4]*10+num[5];
       int age=year-dob;
       System.out.println("The age is: "+age);}
       int number2=num[9];//calculates the second part of the number.  
       if(number2%2==0)//is used to check if the number is even or odd
        System.out.println("The gender is female");
       else
       System.out.println("The gender is male");
      System.out.println("=====================================");
      System.out.println("Would you like to give other values?");
      System.out.println("=====================================");
      System.out.println("Yes or No?");  
      option = kb.next().charAt(0);
    }while(Character.toUpperCase(option)!='N');//end of do. if false the program stops  
    System.out.println("********************************");
    System.out.println("Thank you for using our services!!!");
    System.out.println(":-)");
    }//end of main
   }//end of class

