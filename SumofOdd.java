package priyanka;
import java.util.*;

public class SumofOdd {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("enter a num:");
		int n=read.nextInt();
		int sum=0;
		int rem;
		while(n>0) {
			 rem=n%10;
			 n=n/10;
		       if (rem%2!=0){
				sum=sum+rem;
			}
		}
		System.out.println("the sum is "+sum);
		
		
	}

}
