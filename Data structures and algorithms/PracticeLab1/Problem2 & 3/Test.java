import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d1 = new Date(9, 23, 2002);
		Date d2 = new Date(6, 29, 1920);
		Date d3 = new Date(9, 2, 2000);
		Date d4 = new Date(8, 23, 2030);

		/*if (d1.compareTo(d2) == 1) {
			System.out.println(d1 + " is later than " + d2);
		} else if (d1.compareTo(d2) == -1) {
			System.out.println(d1 + " is later than " + d2);
		} else {
			System.out.println(d1 + "and " + d2 + " are the same dates");
		}
	}
*/
		TreeMap<Date, String> syllabus = new TreeMap();
		syllabus.put(d1, "Java");
		syllabus.put(d2, "C++");
		syllabus.put(d3, "Python");
		syllabus.put(d4, "JavaScript");
		
	
	for(Map.Entry<Date, String> topic:syllabus.entrySet()) {
		if(topic.getKey().month==9 && topic.getKey().year == 2002) {
			System.out.println(topic.getValue());
		}else {
			System.out.println(topic.getValue()+ " does not fall in September, 2002");
		}
		//	System.out.println(topic.getKey()+ ", " + topic.getValue());
	}
	
	}
}
