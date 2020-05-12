//Program to Scan two integers a and b, compute and print the result of a/b by  keeping all the exeptions in mind
import java.util.*;

//Main Class
public class Prog3a{

	//Driver Program
	public static void main(String args[]){
		int a,b;
		float res;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the values of a and b:");
		a = s.nextInt();
		b = s.nextInt();
		try{
			if(b == 0)
				throw new ArithmeticException("Divide by zero error");
			res = (float)a/b;
			System.out.println("Result : "+res);
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
} 



