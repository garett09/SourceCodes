
public class Search {
	
	static int linearSearch (int [] space, int key) {
		for(int i=0; i<space.length;i++) {
			if(space [i]==key) {
				return i;
			}
		}
		return -1;
	}


}
