// main for rec and circle

import java.util.*;
public class Main {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		mainRec();
		mainCir();
	}

	public static void mainRec() {
	// rectangle 1
			System.out.println("enter length");
			int len = input.nextInt();
			System.out.println("enter width");
			int wid = input.nextInt();
			Rectangle rec1 = new Rectangle(len,wid);
			// rectangle 2
			System.out.println("enter length");
			len = input.nextInt();
			System.out.println("enter width");
			wid = input.nextInt();
			Rectangle rec2 = new Rectangle(len,wid);
			
			// drawing both rectangle
			System.out.println();
			rec1.draw();
			System.out.println();
			rec2.draw();
			
			// rec1 *2
			rec1.scale(2);
			System.out.println();
			rec1.draw();
			
			int sumArea  = rec1.calcArea()+rec2.calcArea();
			int sumPer = rec1.calcPer() + rec2.calcPer();
			System.out.println("the sum area is: " + sumArea + " the sum hikef: "+sumPer);
			
			System.out.println(rec1);
}

	public static void mainCir() {
		Circle cir1 = new Circle(5);
		Circle cir2 = new Circle(8);
		System.out.println("\nthe Area of the first circle is: " + cir1.area());
		System.out.println("the Area of the second circle is: " + cir2.area());
	}
}