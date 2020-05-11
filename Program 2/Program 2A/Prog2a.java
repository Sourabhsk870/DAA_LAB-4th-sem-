//Java Program to Store and Print the details of Staff
import java.util.Scanner;

//Staff class to Store details of Staff
class Staff{
	String sid,name,ph;
	double sal;
	Scanner s = new Scanner(System.in);
	Scanner s1 = new Scanner(System.in);
	
	//Function to read the details from user
	void read(){
		System.out.print("Staff Id : ");
		sid = s.next();
		System.out.print("Name : ");
		name = s1.nextLine();
		System.out.print("Phone : ");
		ph = s.next();
		System.out.print("Salary : ");
		sal = s.nextDouble();
	}
	
	//Functin to display the details to the user
	void display(){
		System.out.println("Staff Id:"+sid);
		System.out.println("Name:"+name);
		System.out.println("Phone Number:"+ph);
		System.out.println("Salary:"+sal);
	}
}
class Teaching extends Staff{
	String Domain;
	int publication;
	
	//Function to read the details from user
	void read(){
		super.read();
		System.out.print("Domain : ");
		Domain = s1.nextLine();
		System.out.print("Publication : ");
		publication = s.nextInt();
	}
	
	//Functin to display the details to the user
	void display(){
		super.display();
		System.out.println("Domain:"+Domain);
		System.out.println("Publication:"+publication);
	}
}
class Technical extends Staff{
	String skills;
	
	//Function to read the details from user
	void read(){
		super.read();
		System.out.print("Skills : ");
		skills = s1.nextLine();
	}
	
	//Functin to display the details to the user
	void display(){
		super.display();
		System.out.println("Skills:"+skills);
	}
}
class Contract extends Staff{
	int period;
	
	//Function to read the details from user
	void read(){
		super.read();
		System.out.print("Period : ");
		period = s.nextInt();
	}

	//Functin to display the details to the user
	void display(){
		super.display();
		System.out.println("Period:"+period);
	}
}

//Main class
public class Prog2a{
	
	//Driver Program
	public static void main(String args[]){
		Teaching teach = new Teaching();
		Technical tech = new Technical();
		Contract con = new Contract();
		System.out.println("\nEnter the details of Teaching Staff:");
		teach.read();
		System.out.println("\nEnter the details of Teachnical Staff:");
		tech.read();
		System.out.println("\nEnter the details of Contract Staff:");
		con.read();
		System.out.println("\n\nHere are the details of Teaching Staff:");
		System.out.println("--------------------------------------------------------");
		teach.display();
		System.out.println("\nHere are the details of Technical Staff:");
		System.out.println("--------------------------------------------------------");
		tech.display();
		System.out.println("\nHere are the details of Contract Staff:");
		System.out.println("--------------------------------------------------------");
		con.display();
	}
}
