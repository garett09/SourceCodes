public class GraphAM {
	int n;
	int [][]am;
	char letters[] = {'A', 'B', 'C', 'D', 'E', 'F'};
	
	public GraphAM(int n){
		this.n = n;
		am = new int[n][n];
	}
	public void addEdge (int start, int end) {
		am[start][end] = 1;
	}
	public void displayGraph() {
		System.out.println("ADJACENCY MATRIX: ");
		System.out.print("   ");
		for (int i = 0; i < am.length; i++) {
			System.out.print(letters[i] + " ");
		}
		System.out.println("   ");
		for (int i = 0; i < am.length; i++) {
			System.out.print(letters[i] + ": ");
			for (int j = 0; j < am[i].length; j++) {
				System.out.print(am[i][j] + " ");
			}
			System.out.println();
		}
	}
}