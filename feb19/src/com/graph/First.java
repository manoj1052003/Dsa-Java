package com.graph;

class Adjmat{
	
	int vertices;
	int [][] mat;
	
	Adjmat(int vertices) {
		this.vertices = vertices;
		mat = new int[vertices][vertices];
	}
	
	public void addEdge(int src, int des) {
		mat[src][des] = 1;
		mat[des][src] = 1;
	}
	
	public void print() {
		for(int i=0; i< vertices; i++) {
			for(int j=0; j<vertices; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}

public class First {

	public static void main(String[] args) {
		Adjmat g = new Adjmat(5);
		g.addEdge(0, 1);
		g.addEdge(0, 4);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(1, 4);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		g.print();
	}

}
