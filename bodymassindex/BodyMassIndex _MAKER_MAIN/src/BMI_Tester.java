import com.eduardo.BMI_Computation;
import com.eduardo.BMI_InfoSheet;

public class BMI_Tester {

	public static void main(String[] args) {
		BMI_InfoSheet p1 = new BMI_InfoSheet();
		BMI_Computation p2 = new BMI_Computation();
		System.out.println("Name--- Age --- Height ---- Weight ------- BMI");
		System.out.print(p1.getName());
		System.out.print("\t" + p1.getAge());
		System.out.print("\t" + p1.getHeight());
		System.out.print("\t   " + p1.getWeight());
		p2.computation();

	}

}
