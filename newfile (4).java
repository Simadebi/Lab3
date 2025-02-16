//cheak if a number is even or odd
package labtask3;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//data type variable declear
		int num;
		System.out.print("enter any number= ");
		num=input.nextInt();
		if(num%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		
	}
}