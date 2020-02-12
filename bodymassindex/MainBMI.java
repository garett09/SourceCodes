package BMI;

public class MainBMI {

    public static void main(String[] args) {

        BMI p1 = new BMI();
        System.out.println("Name--- Age --- Height ---- Weight ------- BMI");
        System.out.print(p1.getName());
        System.out.print("\t" + p1.getAge());
        System.out.print("\t" +p1.getHeight());
        System.out.print("\t    " +p1.getWeight());
        p1.display();
        
    }
}
