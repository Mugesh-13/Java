package assignment2;
import java.util.Scanner;
public class CelciusToFahrenheit {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the temperature value in Celcius");
		double celciusValue=scan.nextDouble();
		double fahrenheitValue=(celciusValue *1.8) +32;
		
		System.out.println("The value of temperature in Farenheit is " + fahrenheitValue);
		scan.close();
	}

}
