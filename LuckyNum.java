package priyanka;
import java.util.*;

public class LuckyNum {

	public static void main(String[] args) {
				Scanner read = new Scanner(System.in);
				System.out.println("enter a num:");
				int n=read.nextInt();
				int sum=0;
				int rem;
				int temp;
				int s=0;
				while(n>0) {
					 rem=n%10;
					 n=n/10;
				     sum=sum+rem;
				     if(sum>10) {
				    	 while(sum>0) {
				    		 temp=sum%10;
				    		 sum=sum/10;
				    		 s=s+temp;
				    	 }
				}
				//System.out.println("the lucky num is "+sum);
				     
				     }
				System.out.println("the lucky num"+s);
				
				
			}

		

}
