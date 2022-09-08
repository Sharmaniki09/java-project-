package mypack ;

public class Student {

	@Override
	public String toString() {
		return "Student [roll_No=" + roll_No + ", name=" + name + ", age=" + age + ", getRoll_No()=" + getRoll_No()
				+ ", getName()=" + getName() + ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public int getRoll_No() {
		return roll_No;
	}
	public void setRoll_No(int roll_No) {
		this.roll_No = roll_No;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static String getInstituteName() {
		return institute_name;
	}
	static final String institute_name = " Anudip Foundation";
	int roll_No;
	String name;
	int age;
	public void setinstitute_name(String string) {
		// TODO Auto-generated method stub

		

	}

}
