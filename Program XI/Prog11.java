//Java Program to find the subset of a given set
import java.util.Scanner;

//Main Class
public class Prog11{
	static int d,flag = 0;
	static int S[] = new int [10];
	static int x[] = new int [10];
	
	//Function to find the sum of subset
	static void sumofsub(int s,int k,int r){
		int i;
		x[k] = 1;
		if((s+S[k]) == d){
			flag = 1;
			for(i = 1;i <= k;i++){
				if(x[i] == 1)
					System.out.print(S[i]+"\t");
			}
			System.out.println();
		}
		else{
			if((s+S[k]+S[k+1]) <= d)
				sumofsub(s+S[k],k+1,r-S[k]);
			if(((s+r-S[k]) >= d) && (s+S[k+1] <= d)){
				x[k] = 0;
				sumofsub(s,k+1,r-S[k]);
			} 
		}
	}
	
	//Driver Program
	public static void main(String args[]){
		int i,n, sum = 0;
		Scanner s = new Scanner (System.in);
		System.out.println("Enter no. of elements in the set: ");
		n = s.nextInt();
		System.out.println("Enter the set in increasing order : ");
		for( i = 1;i <= n;i++)
			S[i] = s.nextInt();
		System.out.println("The max subset value: ");
		d = s.nextInt();
		for(i = 1;i <= n;i++)
			sum += S[i];
		if((sum < d) || (S[i] > d))
			System.out.println(" NO SUBSET POSSIBLE!!");
		else{
			System.out.println("The possible subset are : ");
			sumofsub(0,1,sum);
			if(flag == 0)
				System.out.println(" NO SUBSET POSSIBLE!!");
		}
	}
}
