package priyanka;
import java.util.*;

public class Factors {

	public static void main(String[] args) {
		Scanner read =new Scanner(System.in);
		int n =read.nextInt();
		int count =0;
		System.out.println("the factors are");
		for(int i=1;i<=n;i++) {
			if (n%i==0){
			
				System.out.println(i);
				count++;
			}
			
		}
		System.out.println("the count is"+count);
		// TODO Auto-generated method stub

	}
     
}
