package student;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
		
		
		File myFile = new File("C:\\Users\\User\\Desktop\\myDetails.txt");
		
		if(!myFile.exists()) {
			try {
				myFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Could not create the file");
			}
			
			try {
				FileWriter fw = new FileWriter(myFile);
				
				for(int i = 0; i<stud.getStudNumber(); i++) {
					fw.write(studentArr[i].getName());
					fw.write(studentArr[i].getRollNum());
					fw.write(studentArr[i].getAge());
				}
				
				fw.close();
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
