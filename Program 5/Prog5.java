//Java Program to perform Merge Sort
import java.util.*;
import java.io.*;

//Main class
public class Prog5{
	static int a[];
	static int n;
	static boolean flag = true;
	
	//Function to perform divide and conquer approach
	static void mergesort(int a[],int low,int high){
		int mid;
		if (low < high){
			mid = (low+high)/2;
			mergesort(a,low,mid);
			mergesort(a,mid+1,high);
			merge(a,low,mid,high);
		}
	}

	//Function to perform merge sort
	static void merge(int a[],int low,int mid,int high){
		int i1,i2,j,k;
		int b[] = new int [n];
		i1 = j = low;
		i2 = mid+1;
		if(flag){
			while((i1 <= mid)&&(i2 <= high)){
				if(a[i1] <= a[i2]){
					b[j] = a[i1];
					i1++;
				}
				else{
					b[j] = a[i2];
					i2++;
				}
				j++;
			}
			if(i1 > mid)
				for(k = i2;k <= high;j++,k++)
					b[j] = a[k];
			else
				for(k = i1;k <= mid;j++,k++)
					b[j] = a[k];
			for(k = low;k <= high;k++)
				a[k] = b[k];
		}
		else{
			while((i1 <= mid)&&(i2 <= high)){
				if(a[i1] >= a[i2]){
					b[j] = a[i1];
					i1++;
				}
				else{
					b[j] = a[i2];
					i2++;
				}
				j++;
			}
			if(i1 > mid)
				for(k = i2;k <= high;j++,k++)
					b[j] = a[k];
			else
				for(k = i1;k <= mid;j++,k++)
					b[j] = a[k];
			for(k = low;k <= high;k++)
				a[k] = b[k];
		}
	}

	//Driver Program
	public static void main(String args[])throws IOException{
		int i;
		long st,et;
		Scanner s = new Scanner(System.in);
		Random random = new Random();
		PrintWriter out = new PrintWriter(new File("Random.txt"));
		System.out.println("Enter no. of Elements(>5000)");
		n = s.nextInt();
		a = new int[n];
		for(i = 0;i < n;i++){
			a[i] = random.nextInt(n)+1;
			out.print(a[i]+"\t");
		}
		System.out.println("Total numbers generated are : "+i);
		out.close();
		st = System.nanoTime();
		mergesort(a,0,n-1);
		et = System.nanoTime() - st;
		PrintWriter outA = new PrintWriter(new File("Ascending.txt"));
		for(i = 0;i < n;i++)
			outA.print(a[i]+"\t");
		outA.close();
		System.out.println("The time complexity of worst case is ..."+(et/1000000000000.0)+"secs");
		st = System.nanoTime();
		mergesort(a,0,n-1);
		et = System.nanoTime() - st;
		System.out.println("The time complexity of best case is ..."+(et/100000000000.0)+"secs");
		flag = false;
		st = System.nanoTime();
		mergesort(a,0,n-1);
		et = System.nanoTime() - st;
		PrintWriter outD = new PrintWriter(new File("Descending.txt"));
		for(i = 0;i < n;i++)
			outD.print(a[i]+"\t");
		outD.close();
		System.out.println("The time complexity of average case is ..."+(et/1000000000.0)+"secs");
	}
}
