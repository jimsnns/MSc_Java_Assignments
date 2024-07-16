/*
 * author: Dimitris Sinanis, RN 150615 
 * Title: THEMA4
 */
package Assignment_4;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class URLsVisitedApp {
	static String fpath = null;
	
	public static void main(String[] args) throws Exception {
			fileAnalyzer(fpath);
	}//end of main
			
	static void fileAnalyzer(String fpath) throws Exception {
		boolean input=false;//the use of boolean as a flag.
		char n;
		do {
			Scanner kb=new Scanner(System.in);//using scanner for input from the keyboard.
			do {
				input=true;
				try {
					System.out.println("Which filename would you like to analyze? Please type the path below: "+"\n");
					fpath=kb.nextLine();//input of the path of the user.
					System.out.println(fpath+"\n");
					System.out.println("The file analyzed is:"+"\n");//the name and the path are shown here.
					System.out.println(fpath+"\n");
					System.out.println("========================================================="+"\n");
					URLsVisited obj=new URLsVisited(fpath);//creating the object of the URLsVisited class.
					System.out.println("The Web sites visited are: "+"\n");
					obj.printAll();//calling printAll method from the URLsVisited class.
					obj.removeDuplicates();//calling removeDuplicates method from the URLsVisited class.
					System.out.println("The Web sites after removing duplicates and sorting are: "+"\n");
					obj.printAll();//calling the method from the URLsVisited class after sorting and removing duplicates.
				}catch (FileNotFoundException e) {//exception handling.
					System.out.println("Error: "+e.getMessage()+"\n"+"Could not find the file "+fpath+"."+" Please insert a valid path and filename"+"\n");
					input=false;
				}//the end of exception handling	
			}while(input==false);
			System.out.println("Would you like to insert a new file? Yes or No? "+"\n");
			n=kb.next().charAt(0);
		}while(Character.toUpperCase(n)!='N');//if the first character is 'N' then the program stops. In this way whatever the user types, the character is converted to upper case.
	}//end of fileAnalyzer method.
}//end of class.

