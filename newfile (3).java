//2.sum of two numbers
package labtask3;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//data type variable declear
		int sum=0,num,temp,r;
		System.out.print("enter any two numbers= ");
		//take as user iput
		num=input.nextInt();
		temp=num;
		while(temp!=0) {
			r=temp%10;
			sum=sum+r;
			temp=temp/10;
		}
		//print variabls
		System.out.println("Sum of digits= "+sum);
		
	}
}