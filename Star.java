package priyanka;
import java.util.*;

public class Star {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n =read.nextInt();
		
	
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
