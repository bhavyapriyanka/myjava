package priyanka;
import java.util.*;

public class Switch {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int a = read.nextInt();
		int b = read.nextInt();
		System.out.println("please choose from following 1 is for addition 2 is for sub 3 is for multiply and 4 is for division");
		int choice= read.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println(a/b);
			break;
		default:
			System.out.println("bye");
		}
		

	}

}
