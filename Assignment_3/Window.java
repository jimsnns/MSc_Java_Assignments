package Assignment_3;
/*
 * author: Dimitris Sinanis
 * Title: THEMA3
 */
 
public class Window{//class start.
	
	String name; //initializing the values of the variables.
	double height=0;
	double width=0;
	String color=" ";
	int x,y=0;
	
	public Window(String n){//constructor for subquestion 1. 
	name=n;
	}
   public Window(String name,double height, double width, String color, int x, int y){//constructor for subquestion 2. 
      this.name=name;
      this.height=height;
      this.width=width;
      this.color=color;
      this.x=x;
      this.y=y;   
   }
   public String getName(String n){//method for subquestion 3.
	  name=n;
      return name;
   }
   public double getHeight(double height){//method for subquestion 4, using this keyword.
	  this.height=height;
	  return height;
   }
   public double getWidth(double width){//method for subquestion 5, using this keyword.
	  this.width=width;
      return width;
   }
   public String getColor(String c){//method for subquestion 6.
       String color=c;
       return color;
   }
   public void resize(double h, double w){//method for subquestion 7. this method gives new values at height and width.
       height=h;
       width=w;        
   }
   public void move(int x, int y){//method for subquestion 8, using this keyword.
       this.x=x;
       this.y=y;       
   }
   public double isSquare(double h, double w){//method for subquestion 9. this method calculates the diagonal if the window is a square.
       double diagonal;
       if (w==h){
       diagonal=Math.sqrt(2)*w;
       return diagonal;}
       else
       return -1;
   }
   public String printWindow(){//method for subquestion 10. this method prints the current state of each window.
     return "The name is: "+name+"\n"+
             "The height is: "+height+"\n"+
             "The width is: "+width+"\n"+
             "The color is: "+color+"\n"+
             "The coords are: "+x+","+y;
   }
}//end of class