//Java Program to print the details of customer such as name and Date of  birth using String Tokenizer
import java.util.*;

//Customer class to store Customer details
class Customer{
	String data,name,dob;
	
	//Function to read the data
	void read(){
		Scanner read = new Scanner(System.in);
		System.out.println("Enter data in the form of <Name,dd/mm/yyyy>");
		data = read.nextLine();
	}

	//Function to display the data
	void display(){
		String s[] = data.split(",");
		name = s[0];
		dob = s[1];
		
		//String Tokenizer declaration
		StringTokenizer str = new StringTokenizer(dob,"/");
		System.out.println("Name :"+name+"\nDOB:"+str.nextToken()+"-"+str.nextToken()+"-"+str.nextToken());
	}
}

//Main class
public class Prog2b{

	//Driver Program
	public static void main(String args[]){
		Customer obj = new Customer();
		obj.read();
		obj.display();
	}
}
