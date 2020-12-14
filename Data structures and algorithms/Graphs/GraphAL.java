import java.util.Iterator;
import java.util.LinkedList;
public class GraphAL {
	int n;
	LinkedList<Integer>[]al;
	char letters[] = {'A', 'B', 'C', 'D', 'E', 'F'};
	public GraphAL(int n) {
		this.n = n;
		al = new LinkedList[n];
		for (int i = 0; i < al.length; i++) {
			al[i] = new LinkedList<Integer>();	
		}
	}
	public void addEdge(int start, int end) {
		al[start].add(end);
	}
	public void displayGraph() {
		for (int i = 0; i < al.length; i++) {
			System.out.print(letters[i] + ": ");
			for (int j = 0; j < al[i].size(); j++) {
				System.out.print(letters[al[i].get(j)] + " ");
			}
			System.out.println();
		}
	}
	void BFS(int start) {
		boolean visted[] = new boolean[n];
		
		LinkedList<Integer>queue = new LinkedList<Integer>();
		visted[start] = true;
		queue.add(start);
		System.out.print("BFS: ");
		while (queue.size() !=0) {
			start = queue.poll();
			System.out.print(letters[start] + " ");
			Iterator<Integer> i = al[start].listIterator();
			while(i.hasNext()) {
				int n = i.next();
				if (!visted[n]) {
					visted[n]= true;
					queue.add(n);
					}
				}
			}
		System.out.println();
	}
		private void DFSUtil(int v, boolean visted[]) {
			visted[v] = true;
			System.out.print(letters[v] + " ");
			Iterator<Integer> i = al[v].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if(!visted[n])
					DFSUtil(n,visted);
			}
		}
		
		void DFS(int v) {
			System.out.print("DFS: ");
			boolean visted[] = new boolean[n];
			DFSUtil(v, visted);
		}
		
		
			
	}


