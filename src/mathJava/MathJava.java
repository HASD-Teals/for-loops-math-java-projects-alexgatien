
package mathJava;

import java.util.*;

public class MathJava {

	public static void main(String[] args) {
		int choice = 0;
		double first = 0;
		double second = 0;
		double third = 0;

		Scanner input1 = new Scanner(System.in);
		Scanner input2= new Scanner(System.in);
		System.out.print("1- Cuboid");
		System.out.println(" -Enter height, width and length");
		System.out.print("2- Cube");
		System.out.println(" -Enter side length, 0 and 0");
		System.out.print("3- Right Prism");
		System.out.println(" -Enter perimeter, height and lateral surface area");
		System.out.print("4- Right Circular Cylinder");
		System.out.println(" -Enter radius, height and 0");
		System.out.print("5- Right Pyramid");
		System.out.println(" -Enter perimeter, height and lateral surface area");
		System.out.print("6- Right Circular Cone");
		System.out.println(" -Enter radius, length and 0");
		System.out.print("7- Sphere");
		System.out.println(" -Enter radius, 0 and 0");
		System.out.print("8- Hemishpere");
		System.out.println(" -Enter radius, 0 and 0");
		System.out.print("Input Number for Shape Choice and Then Input Corresponding Data:");
		choice = input1.nextInt();
		first = input2.nextInt();
		second = input2.nextInt();
		third = input2.nextInt();
		input1.close();
		if (choice == 1) {
			System.out.println("Cuboid");
		
		
		
			cuboid(first, second, third);

		
					}

		if (choice == 2) {
			System.out.println("Cube");
			
			
			cube(first);
		}

		if (choice == 3) {
			System.out.println("Right Prism");
			
			
			rightprism(first, second, third);
		}

		if (choice == 4) {
			System.out.println("Right Circular Cylinder");
			
			
			rightcircularcylinder(first,second);
			
		}

		if (choice == 5) {
			System.out.println("Right Pyramid");
			
			
			rightpyramid(first,second,third);
		}

		if (choice == 6) {
			System.out.println("Right Circular Cone");
			
			
			rightcircularcone(first,second);
		}

		if (choice == 7) {
			
			System.out.println("Sphere");
			
			
			sphere(first);
		}

		if (choice == 8) {
			
			System.out.println("Hemisphere");
			
		
			hemisphere(first);
		}
		

	input2.close();	
	}

	public static void cuboid(double h, double w, double l) {
		System.out.print("Lateral Surface Area: ");
		System.out.println(2 * h * (w + l));
		System.out.print("Total Surface Area: ");
		System.out.println(2 * (h * w + w * l + h * l));

	}

	public static void cube(double a) {

		System.out.print("Lateral Surface Area: ");
		System.out.println(Math.pow(a, 2) * 4);
		System.out.print("Total Surface Area: ");
		System.out.println(Math.pow(a, 2) * 6);

	}

	public static void rightprism(double p, double h, double ab) {

		System.out.print("Lateral Surface Area: ");
		System.out.println(p * h);
		System.out.print("Total Surface Area: ");
		System.out.println((p * h) + (2 * ab));

	}

	public static void rightcircularcylinder(double r, double h) {

		System.out.print("Lateral Surface Area: ");
		System.out.println(2 * Math.PI * r * h);
		System.out.print("Total Surface Area: ");
		System.out.println(2 * Math.PI * r * (r + h));

	}

	public static void rightpyramid(double p, double h, double a) {
		
		System.out.print("Lateral Surface Area: ");
		System.out.print(0.5 * p * h);
		System.out.print("Total Surface Area: ");
		System.out.print((0.5 * p * h) + a);

	}

	public static void rightcircularcone(double r, double l) {
		
		System.out.print("Lateral Surface Area: ");
		System.out.println(Math.PI * r * l);
		System.out.print("Total Surface Area: ");
		System.out.println(Math.PI * r * (l + r));

	}

	public static void sphere(double r) {

		System.out.print("Lateral Surface Area: ");
		System.out.println(Math.PI * Math.pow(r, 2) * 4);
		System.out.print("Total Surface Area: ");
		System.out.println(Math.PI * Math.pow(r, 2) * 4);
	}

	public static void hemisphere(double r) {

		System.out.print("Lateral Surface Area: ");
		System.out.println(Math.PI * Math.pow(r, 2) * 2);
		System.out.print("Total Surface Area: ");
		System.out.println(Math.PI * Math.pow(r, 2) * 3);
		

		
	
}}