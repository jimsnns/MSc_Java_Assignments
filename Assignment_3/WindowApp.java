package Assignment_3;
/*
 * author: Dimitris Sinanis
 * Title: THEMA3
 */
public class WindowApp{
	
    public static void main(String[] args){
    	
      Window w1=new Window("w1"); //this creates the object "w1" with the initial values.
      
      Window w2=new Window("w2",15,10,"blue",2,2);//this creates the object "w2" using the constructor, and changes the values.
      
      System.out.println(w1.printWindow()+"\n");//this prints the current state of the object "w1".
      
      System.out.println(w2.printWindow()+"\n");//this prints the current state of the object "w2".
      
      w1.move(2,2);//this changes the coordinates of the object w1, using the move() method from the class Window. 
      
      System.out.println(w1.printWindow()+"\n");//this prints the new state of the object "w1".
      
      w2.getHeight((15.0/2.0));//this changes the height of the object "w2".
      
      w2.getWidth(10*2);//this changes the width of the object "w2".
      
      System.out.println(w2.printWindow());//this prints the final state of the object "w2". 
    }//end of main
}//end of class