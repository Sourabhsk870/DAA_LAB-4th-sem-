//Java Program to implement Basic Operations on Stack
import java.util.Scanner;

//Stack class 
class Stack{
	int stack[];
	int size,top = -1;
	Scanner s = new Scanner(System.in);
	Stack(int size){
		this.size = size;
		stack = new  int[size];
	}
	
	//Function to perform Push Operation
	void push(){
		if(top == size-1){
			System.out.println("Stack Overflow");
			return;
		}
		System.out.println("Enter element to be inserted:");
		stack[++top] = s.nextInt();
	}
	
	//Function to perform Pop Operation
	void pop(){
		if(top == -1){
			System.out.println("Stack Underflow");
			return;
		}
		System.out.println("Popped Element:"+stack[top--]);
	}
	
	//Function to display contents of stack
	void display(){
		if(top == -1){
			System.out.println("Stack is Empty");
			return;
		}
		int i;
		System.out.println("Stack Consists Of:");
		for(i = top;i >= 0;i--)
			System.out.println(stack[i]);
	}
}

//Main class
public class Prog1b{
	
	//Driver Program
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of stack:");
		int n = s.nextInt();
		Stack st = new Stack(n);
		for(;;){
			System.out.println("\n!!Stack Operation!!");
			System.out.println("Menu\n1.Push\t2.Pop\t3.Display\t4.Exit");
			System.out.println("Enter your choice:");
			n = s.nextInt();
			switch(n){
				case 1 : st.push();
					 break;
				case 2 : st.pop();
					 break;
				case 3 : st.display();
					 break;
				case 4 : System.out.println("The program has been Terminated!!");
					 System.exit(0);
				default : System.out.println("!!Invalid choice!!");
			}
		}
	}
}
