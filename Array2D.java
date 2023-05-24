package priyanka;
import java.util.Scanner;
public class Array2D {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n;
		int a[][]=new int[2][];
		System.out.println("enter size of first array");
		n=read.nextInt();
		a[0]=new int[n];
		System.out.println("enter size of second array");
		n=read.nextInt();
		a[1]=new int[n];
		for (int i=0;i<2;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=read.nextInt();
				
			}
		}
		for (int b[]:a) {
			for (int k:b) {
				System.out.println(k);
					
				}
			}
		// TODO Auto-generated method stub

	}

}
