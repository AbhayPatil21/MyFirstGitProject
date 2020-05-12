package abhay.practice;
import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
	
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		number = sc.nextInt();
		if((number%2)==0)
		{
			System.out.println("This is even number");
		}
		else
		{
			System.out.println("This is Odd number");
		}	
			
	}

}
