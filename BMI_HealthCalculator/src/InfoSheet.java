public class InfoSheet {
	private String name, gender;
	private int age;

	public InfoSheet(String nameE, String genderR, int ageE) {

		this.name = nameE;
		this.age = ageE;
		this.gender = genderR;

	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void display() {
		System.out.println("Your height and weight is proportional ");
	}

}
