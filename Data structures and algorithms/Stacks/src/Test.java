
public class Test {

	public static void main(String[] args) {
		StackGeneric <Student> students = new StackGeneric<>(10);
		
		Student s1 = new Student ("Juan", "Dela Cruz", 50);
		Student s2 = new Student ("Adrian", "Sian", 20);
		Student s3 = new Student ("Abby", "Chua", 22);
		Student s4 = new Student ("Ed", "Nacion", 19);
		
		students.push(s1);
		students.push(s2);
		students.push(s3);
		students.push(s4);
		
		System.out.println(students.pop().fname);
		System.out.println(students.pop().fname);
		System.out.println(students.pop().fname);
		System.out.println(students.pop().fname);

	}

}
