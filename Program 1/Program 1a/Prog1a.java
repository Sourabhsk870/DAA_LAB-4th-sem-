//Java Program to Scan and Print Student details Like Name,USN,Branch and Phone Number
import java.util.Scanner;

//Class to store student information
class Student{
	String Name,USN,Branch,Phone;
	//Paramaterized Constructer
	Student(String Name,String USN,String Branch,String Phone){
		this.Name = Name;
		this.USN = USN;
		this.Branch = Branch;
		this.Phone = Phone;
	}
	//Display function
	void display(){
		System.out.println(Name+"\t\t"+USN+"\t\t"+Branch+"\t\t"+Phone);
	}
}

//Main class
public class Prog1a{
	//Driver Program
	public static void main(String args[]){
		int i,n;
		String Name,USN,Branch,Phone;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		n = s.nextInt();
		Student st[] = new Student[n];
		for(i = 0;i < n;i++){
			System.out.println("Enter details of Student-"+(i+1));
			System.out.println("USN:");
			USN = s.next();
			System.out.println("Name:");
			Name = s.next();
			System.out.println("Branch:");
			Branch = s.next();
			System.out.println("Phone:");
			Phone = s.next();
			st[i] = new Student(Name,USN,Branch,Phone);
		}
		System.out.println("The Entered Details are:");
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("NAME\t\tUSN\t\t\tBranch\t\tPhone");
		for(i = 0;i < n;i++){
			st[i].display();
		}
	}
}

