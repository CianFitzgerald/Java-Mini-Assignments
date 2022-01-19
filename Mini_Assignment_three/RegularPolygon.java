package Mini_Assignment_3;
import java.lang.Math;
public class RegularPolygon{
	
	// data fields with default values 
	private int n = 3; 
	private double length = 1;
	
	// no argument constructor that takes the default values 
	public RegularPolygon() {
	}
	
	
	//constructor that takes specified n and length 
	public RegularPolygon(int new_n, double new_length) {
		n = new_n;
		length = new_length;
	}
	
	//getter method for n
	public int getn() {
		return n;
	}

	// Setter method for n, with argument validation 
	public void setn(int n) {
		if(n<=0) {
			System.out.println("please provide a non negative number for the number of sides");
		}else {
			this.n = n;
		}
	}
	
	//getter method for length 
	public double getlength() {
		return length;
	}

	// Setter method for length, with argument validation 
	public void setlength(double length) {
		if(length<=0) {
			System.out.println("please provide a non negative number for the length of the sides");
		}else {
			this.length = length;
		}
	}

	// method for computing perimeter
	public double getPerimeter() {
		return n*length;
	}
	
	// method for computing Area
	public double getArea() {
		return (n*Math.pow(length, 2))/(4*Math.tan(Math.PI/n));
	}
	
	//method to return a string representation of the polygon.
	public String toString() {
		 return "number of sides: " + n + "\n" + "length of sides: " + length;
	}


}
