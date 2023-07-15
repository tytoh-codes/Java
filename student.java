package student;

public class student {

	public static void main(String[] args) {
		stud s1 = new stud("Mark", 200300, 23);
		stud s2 = new stud("John", 211300, 19);
		stud s3 = new stud("Luke", 222300, 25);
		stud s4 = new stud("Brian", 222333, 27);
		
		stud studentArr[] = new stud[stud.getStudNumber()];	
		
		studentArr[0] = s1;
		studentArr[1] = s2;
		studentArr[2] = s3;
		studentArr[3] = s4;
		
		
		for(int indexCount = 0; indexCount <= stud.getStudNumber(); indexCount++) {
			System.out.println(studentArr[indexCount].getName());
			System.out.println(studentArr[indexCount].getRollNum());
			System.out.println(studentArr[indexCount].getAge());
		}
		
	}

}
