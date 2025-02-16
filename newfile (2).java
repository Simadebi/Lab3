//7.fibonacci series
package labtask3;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num;
		int first=0,second=1,fibo;
		System.out.print("enter number= ");
		num=input.nextInt();
		System.out.print(first+" "+second);
		for(int i=3;i<=num;i++) {
			fibo=first+second;
			System.out.print(" "+fibo);
			first=second;
			second=fibo;
		}
		System.out.println();
		
	}
}