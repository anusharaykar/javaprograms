
import shapes.*;
import java.util.Scanner;

public class mainprogram {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float r,b,h;
		int ch;
		float a;
		for(;;) {
		System.out.println("1. find area of square");
		System.out.println("2. find area of circle");
		System.out.println("3. find area of triangle");
		System.out.println("4.exit");
		System.out.println("Enter your choice: ");
		ch=sc.nextInt();
		switch(ch){
		
		case 1:
			System.out.print("Enter side of square: ");
		a=sc.nextFloat();
		square sq=new square();
		sq.area_square(a);
		sq.display();
		break;
		
		case 2:
		System.out.print("Enter radius of circle: ");
		r=sc.nextFloat();
		circle c=new circle();
		c.area_circle(r);
		c.display();
		break;
		case 3:
		System.out.print("Enter height of triangle: ");
		h=sc.nextFloat();
		System.out.print("Enter base of triangle: ");
		b=sc.nextFloat();
		triangle tr=new triangle();
		tr.area_triangle(b,h);
		tr.display();
		
		break;
		case 4: System.exit(0);
		
		default:System.out.println("invalid choice");
		}
	}
	}

}
