package priyanka;

public class ExecptHandle {

	public static void main(String[] args) {
		try {
		int a=5/0;
		System.out.println(a);
		System.out.println("hii");
		}
		catch (ArithmeticException ex) {
			System.out.println("Should avoid dividing by 0 ");
		}
		//System.out.println("hii");
		// TODO Auto-generated method stub

	}

}
