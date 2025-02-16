//1.solve the bellow problem as taking input from user
package studentdetalis;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		//datatype variable declear
		String studentName;
		int studentID,studentAge;
		float studentFee;
		char studentGrade;
		//taking student data as input
		System.out.print("enter any student Name= ");
		studentName=input.nextLine();
		System.out.print("enter any student ID= ");
		studentID=input.nextInt();
		System.out.print("enter any student age=");
		studentAge=input.nextInt();
		System.out.print("enter any student fee=");
		studentFee=input.nextFloat();
		System.out.print("enter any student grade=");
		studentGrade=input.next().charAt(0);
		//print student detalis
		System.out.println("Student name="+studentName);
		System.out.println("Student ID="+studentID);
		System.out.println("Student age="+studentAge);
		System.out.println("Student Fee="+studentFee);
		System.out.println("Student grade="+studentGrade);
	}
}