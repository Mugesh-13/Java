package assignment2;

import java.util.Scanner;

public class RootsOfQuadraticEquation {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Co-efficient of X**2");
		int a= scan.nextInt();
		System.out.println("Enter Co-efficient of X");
		int b= scan.nextInt();
		System.out.println("Enter Co-efficient of Constant term");
		int c= scan.nextInt();
		int val=(b*b)-(4*a*c);
		if(val >0) {
			double root1=(-b+Math.sqrt(val))/(2*a);
			double root2=(-b-Math.sqrt(val))/(2*a);
			System.out.println("roots are :" + root1 +" , "+root2);
		}
		else if(val==0) {
			double root =-b/(2*a);
			System.out.println("root is :" + root);
		}
		else {
			double real=-b/(2*a);
			double imaginary=val;
			System.out.println("Complex root is:-" + real +"±"+imaginary +"i");
		}
		scan.close();
	}
}
