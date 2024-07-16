/*
 * author: Dimitris Sinanis
 * Title: THEMA4
 */
package Assignment_4;
import java.util.*;
import java.io.*;
public class URLsVisited {
	String urls,removedStr,newText;
	int i;
	private ArrayList<String> myURLs=new ArrayList<String>();
	private ArrayList<String> newURLs=new ArrayList<String>();//the second ArrayList which keeps the new strings of URLs .
	
	public URLsVisited(String filename) throws Exception {//the constructor used for reading the file and saving each line as an array's element.
		
		BufferedReader bufr=new BufferedReader(new FileReader(filename));//the use of BufferedReader class and FileReader, for reading the file line by line.
		while((urls=bufr.readLine())!=null){//reading the file until the line is null.
			myURLs.add(urls);//add method input each one element in the array list.
		}				
				for (int i=0;i<myURLs.size();i++) {
					for (int j=0;j<myURLs.get(i).length();j++) {
						String str=myURLs.get(i);
						if (str.charAt(j)=='/') {
							removedStr=myURLs.get(i).substring(0,j);//keeps the URL address before the '/' character.
						break;}
					}
					newURLs.add(removedStr);//the new URLs after the removal of the characters after the '/'.		
				}	 
		bufr.close();
	}//end of constructor.

	public void removeDuplicates() {//method used for removing the duplicates and sorting.
		int i=0;
		while(i<newURLs.size()) {
			int j=0;
			boolean remove=false;
			while (j<i) {
				if(newURLs.get(i).equals(newURLs.get(j))) {//using get method of the ArrayList in order to return the element of the array, at the specific index.
					newURLs.remove(i);//using remove method of ArrayList in order to remove the element of the specific index.
					remove=true;
					break;}
				else 
					j++;//counter.
			}
			if(!remove)
				i++;//counter.
		}
		Collections.sort(newURLs);//this method is used in order to sort the elements of the array.
	}//end of method.
	
	public void printAll() {//this method prints all the elements of the array.	  
			for (String sorted:newURLs ) {
				System.out.println(sorted);
			} 
			System.out.println("\n"+"========================================================="+"\n");	
	}//end of method.
}//end of class.

	
	
