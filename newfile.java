//4.find the factorial program
package labtask3;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num,fact=1;
		System.out.print("enter any number= ");
		//take as input user
		num=input.nextInt();
		for(int i=num;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println("Factorial is"+fact);
		
	}
}