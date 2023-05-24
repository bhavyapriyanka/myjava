package priyanka;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("enter a num:");
		int n=read.nextInt();
		int temp=n;
		int rem,s=0;
		while(n>0) {
			rem=n%10;
			s=s*10+rem;
			n=n/10;
		}
		if (s==temp) {
			System.out.println("is palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		
		// TODO Auto-generated method stub

	}

}
