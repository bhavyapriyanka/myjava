package priyanka;
import java.util.*;
public class evenNum {

	public static void main(String[] args) {
		System.out.println("enter a num :");
		Scanner read = new Scanner(System.in);
		int a = read.nextInt();
		if (a%2==0) {
			System.out.println("a is even");
		}
		else {
			System.out.println("a is odd");
		}

	}

}
