package priyanka;
import java.util.*;

public class Array {

	public static void main(String[] args) {
		int a[]=new int[100];
		int sum=0;
		Scanner read =new Scanner(System.in);
		System.out.println("enter no of elements in array:");
		int n=read.nextInt();
		for(int i=0;i<n;i++) {
			a[i]=read.nextInt();
		}
		
		
		for(int i=0;i<n;i=i+2) {
			sum=sum+a[i];
		}
		System.out.println("the sum is:");
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
