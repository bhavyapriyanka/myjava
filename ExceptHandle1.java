package priyanka;

public class ExceptHandle1 {

	public static void main(String[] args) {
		try {
			String s = "priyanka";
			s.charAt(9);
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("Exception occured");
		}
		try {
			int a=5/0;
			System.out.println(a);
			}
			catch (ArithmeticException ex) {
				System.out.println("Should avoid dividing by 0 ");
			}
		/*finally {
			System.out.println("hiiHello");
		}*/
		// TODO Auto-generated method stub

	}

}
