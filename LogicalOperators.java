package assignment2;
import java.util.*;
public class LogicalOperators {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First Operand- a");
		int operand1=scan.nextInt();
		System.out.println("Enter Second Operand -b");
		int operand2=scan.nextInt();
		System.out.println("a & b : " + (operand1 & operand2));
		System.out.println("a | b : " + (operand1 | operand2));
		System.out.println("a ^ b : " + (operand1 ^ operand2));
		System.out.println("a << b: " + (operand1 << operand2));
		System.out.println("a >> b: " + (operand1 >> operand2));
		System.out.println("a >>>b: " + (operand1 >>> operand2));
		scan.close();

	}

}
