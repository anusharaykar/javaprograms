package shapes;

public class circle {
	float pi=3.14f;
	float area;
	
	 
	 public float area_circle(float r){
		 area=this.pi*r*r;
		 return(area);
	 }
	 public void display(){
			System.out.println("Area of Circle is: "+area);
		}

}
