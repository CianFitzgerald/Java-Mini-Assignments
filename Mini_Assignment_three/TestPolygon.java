
package Mini_Assignment_3;

public class TestPolygon {
	
	public static void main(String[] args) {
		
		//creating array of 4 polygon objects
		RegularPolygon arr[] = new RegularPolygon[4];
		
		//specifying details for the objects
		arr[0] = new RegularPolygon(3,10.0);
		arr[1] = new RegularPolygon(6, 7.5);
		arr[2] = new RegularPolygon(8, 3.5);
		arr[3] = new RegularPolygon(12, 4.0);
		
		//initializing tracker variables for finding polygons with minimum perimeter and maximum area 
		int min_perimeter = 0;
		int max_area = 0;
		
		
		//for loop iterating through the array of objects and returning their string representation, perimeter and area 
		for(int i = 0; i< arr.length; i++) {
		System.out.println("Polygon " + (i+1) + ": \n" + arr[i].toString() 
							+ "\nPerimter:" + arr[i].getPerimeter() 
								+ "\nArea:" + arr[i].getArea() + "\n");
		
			
			//second for loop used to compare perimeters and areas
			//tracker variables store element index of objects with minimum perimeter and maximum area
			for(int j = i+1; j < arr.length; j++) {
					if(arr[min_perimeter].getPerimeter() < arr[j].getPerimeter()) {
						;
					}else {
						min_perimeter = j;
					}
					
					
					if(arr[max_area].getArea() > arr[j].getArea()) {
							;
					}else {
						max_area = j;
					}
	
			}
					
			
	}
		
		//printing string representation of polygons with minimum perimeter and maximum area.
		System.out.println("string representation of polygon with smallest perimeter: \n" + arr[min_perimeter].toString() + "\n");
		System.out.println("string representation of polygon with largest area: \n" + arr[max_area].toString());



	}
		
		
		
		
}



