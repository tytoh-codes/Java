package student;

public class student {

	public static void main(String[] args) {
		stud s1 = new stud("Mark", 200300, 23);
		stud s2 = new stud("John", 211300, 19);
		stud s3 = new stud("Luke", 222300, 25);
		
		stud studentArr[] = new stud[stud.getStudNumber()];	
		
		System.out.println(studentArr[0]);
		
		
		for(int indexCount = 0; indexCount <= stud.getStudNumber(); indexCount++) {
			System.out.println(studentArr[indexCount].getName());
			System.out.println(studentArr[indexCount].getRollNum());
			System.out.println(studentArr[indexCount].getAge());
		}
		
	}

}
