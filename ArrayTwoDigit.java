package priyanka;

import java.util.Scanner;

public class ArrayTwoDigit {

	public static void main(String[] args) {
		int a[]=new int[100];
		Scanner read =new Scanner(System.in);
		System.out.println("enter no of elements in array:");
		int n=read.nextInt();
		for(int i=0;i<n;i++) {
			a[i]=read.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(a[i]>9 && a[i]<100) {
				System.out.print("the two digit num are:");
				System.out.println(a[i]);
			}
		}
		// TODO Auto-generated method stub

	}

}
