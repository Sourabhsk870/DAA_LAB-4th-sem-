//Java Program to find Minimum Cost Spanning Tree using Kruskal Algorith
import java.util.Scanner;

//Main class
public class Prog8{
	static int parent[] = new int[50];
	static int cost[][] = new int[50][50];
	static int a,b,i,j,u,v,n,min,noe = 1,mincost = 0;
	
	//Function to find root node
	static int find(int w){
		while(parent[w] != 0)
			w = parent[w];
	return w;
	}
	static void union(){
		if(u != v){
			noe++;
			System.out.println(noe-1+"Edge("+a+","+b+") = "+min);
			mincost += min;
			parent[v] = u;
		}
		cost[a][b] = cost[b][a] = 9999;
	}

	//Driver Program
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of vertices:");
		n = s.nextInt();
		System.out.println("Enter the cost of adjacency matrix,'9999' for no direct path");
		for (i = 1;i <= n;i++){
			for(j = 1;j <= n;j++)
				cost[i][j] = s.nextInt();
		}
		while(noe < n){
			min = 9999;
			for (i = 1;i <= n;i++){
				for(j = 1;j <= n;j++){
					if(cost[i][j] < min){
						min = cost[i][j];
						a = u = i;
						b = v = j;
					}
				}
			}
			u = find(u);
			v = find(v);
			union();
		}
		System.out.println("Minimum cost : "+mincost);
	}
}
	

