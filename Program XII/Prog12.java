//Java Program to implement Hamiltonian Cycles using Backtracking principle
import java.util.Scanner;

//Main Class
public class Prog12{
	static int x[] = new int [25];
	static void Next_Vertex(int G[][],int n,int k){
		int j;
		while(true){
			x[k] = (x[k]+1)%(n+1);
			if(x[k] == 0)
				return;
			if(G[x[k-1]][x[k]] != 0){
				for(j = 1;j <= k-1;j++){
					if(x[j] == x[k])
						break;
				}
				if (j == k){
					if((k <n)||((k == n) && (G[x[n]][x[1]] != 0)))
						return;
				}

			}
		}
	}
	static void H_Cycle(int G[][],int n,int k){
		int i;
		while(true){
			Next_Vertex(G,n,k);
			if(x[k] == 0)
				return;
			if(k == n){
				System.out.println();
				for(i = 1;i <= n;i++)
					System.out.print(x[i]+"-->");
				System.out.print(x[i]);
				System.out.println();
			}
			else
				H_Cycle(G,n,k+1);
		}
	}
	public static void main(String args[]){
		int i,j,n;
		int G[][] = new int[25][25];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of vertices of the graph:");
		n = s.nextInt();
		System.out.println("Enter the Path adjacency matrix ");
		for(i = 1;i <= n;i++){
			for(j = 1;j <= n;j++){
				G[i][j] = s.nextInt();
				x[i] = 0;
			}
		} 
		x[1] = 1;
		System.out.println("\nHamiltonian Cycles are :");
		H_Cycle(G,n,2);
	}
}
