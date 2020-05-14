//Java Program to implement Travelling Sales Person Problem using Dynamic Programming
import java.util.Scanner;

//Main Class
public class Prog10b{
	static int cost[][] = new int [20][20];
	static int visited[] = new int [20];
	static int n,mincost;
	
	//Function to implement Travelling SalesPerson Problem
	static int Tsp_Dynamic(int i,int copy[]){
		int min = 999,val,j;
		int s[] = new int[20];
		boolean flag = false;
		for(j = 1;j <= n;j++)
			s[j] = copy[j];
		s[i] =1;
		if(n == 1)
			return cost[i][1];
		for(j = 1;j <= n;j++){
			if(s[j] == 0){
				flag = true;
				val = cost[i][j]+Tsp_Dynamic(j,s);
				if(val < min)
					min = val;
			}
		}
		if(!flag)
			min = cost[i][1];
		return min;
	}

	//Driver Program
	public static void main (String args[]){
		int i,j;	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of cities:");
		n = s.nextInt();
		System.out.println("Enter the cost adjacency matrix:");
		for(i = 1;i <= n;i++){
			for(j = 1;j <= n;j++)
				cost[i][j] = s.nextInt();
		}		
		mincost = Tsp_Dynamic(1,visited);
		System.out.println("The cost of optimal tour is : "+mincost);
	}
}
