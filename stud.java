package student;

public class stud {
	
	private static int studNumber =0;
	
	private String name;
	private int rollNum;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static int getStudNumber() {
		return studNumber;
	}
	public static void setStudNumber(int studNumber) {
		stud.studNumber = studNumber;
	}
	
	stud(String sName, int sNum, int sAge){
		this.name = sName;
		this.rollNum = sNum;
		this.age = sAge;
		studNumber++;
	}
	

}
