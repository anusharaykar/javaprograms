package shapes;

public class triangle {
	
	float area;
		
		public float area_triangle(float b,float h){
			area=0.5f*b*h;
			return(area);
		}
		public void display(){
			System.out.println("Area of triangle is: "+area);
		}


}
