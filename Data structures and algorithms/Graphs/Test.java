public class Test {
	public static void main(String[] args) {
		GraphAL g = new GraphAL(6);
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(0,3);
		g.addEdge(1,0);
		g.addEdge(1,2);
		g.addEdge(1,4);
		g.addEdge(2,0);
		g.addEdge(2,1);
		g.addEdge(3,0);
		g.addEdge(3,4);
		g.addEdge(3,5);
		g.addEdge(4,1);
		g.addEdge(4,3);
		g.addEdge(5,3);
		g.displayGraph();
		g.BFS(2);
		g.DFS(2);
	}
}
