//Java Program to implement Multi-thread application
import java.util.*;

//Class Thread1 subclass of Thread
class Mythread1 extends Thread{
	public void run(){
		int i = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numbere of random numbers to be genereated:");
		int n = s.nextInt();
		try{
			while(i <= n){
				Random random = new Random();
				Prog3b.r = random.nextInt(100);
				System.out.println(i+"--> random integers generated is :"+Prog3b.r);
				new Mythread2().start();
				new Mythread3().start();
				Thread.sleep(1000);
				System.out.println("\n\n");
				i++;
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}

//Class Thread2 subclass of Thread
class Mythread2 extends Thread{
	public void run(){
		System.out.println("Square of "+Prog3b.r +" = "+ (Prog3b.r*Prog3b.r));
	}
}

//Class Thread3 subclass of Thread
class Mythread3 extends Thread{
	public void run(){
		System.out.println("Cube of "+Prog3b.r+" = "+(Prog3b.r*Prog3b.r*Prog3b.r));
	}
}

//Main class
public class Prog3b{
	
	static int r;
	//Driver Program
	public static void main (String args[]){
		Mythread1 t = new Mythread1();
		t.start();
	}
}
		
