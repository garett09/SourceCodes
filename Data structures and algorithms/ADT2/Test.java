
public class Test {

	public static void main(String[] args) {
		Point[] pts = {new Point(3,8,3), new Point(5,3,-2), new Point(4,3,-5)};
		
		System.out.println("Total path length = " + Geometry.getPathLength(pts));

	}

}
