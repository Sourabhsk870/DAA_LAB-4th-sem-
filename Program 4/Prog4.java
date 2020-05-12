//Java Program to Perform Quick Sort
import java.util.*;
import java.io.*;

//Main class
public class Prog4{
	static int a[];
	static int n;
	static boolean flag = true;

	//Function to perform Quick sort
	public static void quicksort(int a[],int low,int high){
		int i = low,j = high;
		int temp;
		int pivot = a[(low+high)/2];
		if(flag){
			while(i <= j){
				while(a[i] < pivot)
					i++;
				while(a[j] > pivot)
					j--;
				if(i <=j){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					i++;
					j--;
				}
			}
			if(low <j)
				quicksort(a,low,j);
			if(i < high)		
				quicksort(a,i,high);	
		}
		else{
			while(i <=j){
				while(a[i] > pivot)
					i++;
				while(a[j] < pivot)
					j--;
				if( i <= j){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					i++;
					j--;
				}
			}
			if(low < j)
				quicksort(a,low,j);
			if (i < high)
				quicksort(a,i,high);
		}
	}

	//Driver Program
	public static void main(String args[])throws IOException{
		int i;
		long st,et;
		Scanner s = new Scanner(System.in);
		Random random = new Random();
		PrintWriter out = new PrintWriter(new File("Random.txt"));
		System.out.println("Enter the no. of elements(>5000)");
		n = s.nextInt();
		a = new int[n];
		for(i = 0;i < n;i++){
			a[i] = random.nextInt(n)+1;
			out.print(a[i]+"\t");
		}
		System.out.println("\nThe total numbers generated: "+i);
		out.close();
		st = System.nanoTime();
		quicksort(a,0,n-1);
		et = System.nanoTime() - st;
		PrintWriter outA = new PrintWriter(new File("Ascending.txt"));
		for(i = 0;i < n;i++)
			outA.print(a[i]+"\t");
		outA.close();
		System.out.println("The time complexity for worst case is ... "+(et/1000000000.0)+"secs");
		st = System.nanoTime();
		quicksort(a,0,n-1);
		et = System.nanoTime() - st;
		System.out.println("The time complexity for best case is ..."+(et/1000000000.0)+"secs");
		flag = false;
		st = System.nanoTime();
		quicksort(a,0,n-1);
		et = System.nanoTime() - st;
		PrintWriter outD = new PrintWriter(new File("Descending.txt"));
		for(i = 0;i < n;i++)
			outD.print(a[i]+"\t");
		outD.close();
		System.out.println("The time complexity for average case is ..."+(et/1000000000.0)+"secs");
	}
}

