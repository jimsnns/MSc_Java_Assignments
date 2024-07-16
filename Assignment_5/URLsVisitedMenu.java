/*
 * author: Dimitris Sinanis, RN 150615 
 * Title: THEMA5
 */
package Assignment_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import Assignment_4.URLsVisited;
	
public class URLsVisitedMenu {
	static String filename=null;	
	
	public static int menu() throws InputMismatchException  {//the start of menu method. 
		int option=0;//initialization of the variable.
		do {
			Scanner kb=new Scanner(System.in);//for input from the keyboard.
			System.out.println("1. Input the name of the file containing URLs you want to analyze");
			System.out.println("2. Input the path of the directory containing the files you to want to analyze for URLs");
			System.out.println("3. Exit");
			System.out.println("Which is your choice?");
			
			try {//exception handling.
				option=kb.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Invalid input! Please choose between 1,2,3."+"\n");
			}//end of try.
		}while (option>3||option<1);//the loop is repeated until the option is 1,2,3.
		return option;	
	}
	public static void main(String[] args) throws Exception {//the start of main
		Scanner kb=new Scanner(System.in);
		int option;
		boolean input=false;//the use of boolean as a flag in order to stop or repeat the loop.
		do {
			option=menu();//the variable takes the value given by the user in the menu method.
			switch(option) {
			
				case 1 :
					do {
						input=false;
						try {
							System.out.println("Which is the path and the file name?"+"\n");
							filename=kb.next();//the user types the path and the name of the file.
							URLsVisited urls=new URLsVisited(filename);//creating the object of the URLsVisited class from thema1. this used here for reading the text line by line.
							fileAnalyzer(filename);//using the fileAnalyzer in order to analyze the file given.
							urls.removeDuplicates();//using the object of the class from thema1, we call the method removeDuplicates in order to remove the duplicate URLs and sort them.
						}catch(FileNotFoundException e) {//exception handling.
							System.out.println("Error: "+e.getMessage()+"\n"+"Please give an existed path. "+"\n");
							System.out.println("------------------------------------------"+"\n");
							input=true;
						}//the end of exception handling.
					}while(input==true);
				break;
			
				case 2 :
					try {
						File[] filenames;//using File[] in order to list the filenames in the path of directory.
						System.out.println("Which directory's files do you want to analyze?"+"\n");
						String dirpath=kb.next();//this variable keeps the path of directory.
						System.out.println(dirpath);
						File folder=new File(dirpath);
						filenames=folder.listFiles();//the list of the files inside the path's directory.
						for(int i=0;i<filenames.length;i++) {
							if(filenames[i].isFile()) {
								filename=filenames[i].getName();//with the use of getName method, we keep the name of the file at the specific index of the list. 
								fileAnalyzer(filenames[i].getPath());//as fileAnalyzer method requires a String we have to keep the String at the specific index of the list, using getPath method of class File.
							}
						}
					}catch(FileNotFoundException e) {//exception handling.
						System.out.println("Error: "+e.getMessage()+"\n"+"Could not find the file "+filename+"."+" Please insert a valid path and filename"+"\n");
					}//the end of exception handling.
				break;
				
				case 3 :
					System.out.println("----------------------------------------");
					System.out.println("Thank you for using our services!!! :-)");
					System.out.println("----------------------------------------");
				break;
			}//end of switch
		}while(option!=3);//
	}//end of main	
	
	static void fileAnalyzer(String fpath) throws Exception {
		boolean input=false;		
			Scanner kb=new Scanner(System.in);//using scanner for input from the keyboard.
			do {
				input=true;
				try {
					System.out.println("\n"+"The filename under analysis is: "+filename);	
					System.out.println("========================================================="+"\n");
					URLsVisited obj=new URLsVisited(fpath);//creating the object of the URLsVisited class from thema1.
					System.out.println("The Web sites visited are: "+"\n");
					obj.printAll();//calling printAll method from the URLsVisited class thema1.
					obj.removeDuplicates();//calling removeDuplicates method from the URLsVisited class.
					System.out.println("The Web sites after removing duplicates and sorting are: "+"\n");
					obj.printAll();//calling printAll method from the URLsVisited class (thema1) after sorting and removing duplicates.
				}catch (FileNotFoundException e) {//exception handling.
					System.out.println("Error: "+e.getMessage()+"\n"+"Could not find the file "+fpath+"."+" Please insert a valid path and filename"+"\n");
					input=false;	
				}//the end of exception handling	
			}while(input==false);		
	}//end of fileAnalyzer method
}//end of class