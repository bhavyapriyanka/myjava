package priyanka;

public class Teater extends Employee{
	int bonous = 1000;
	public static void main(String[] args) {
		Teater obj = new Teater();
		if (obj.sal>50000){
			obj.sal=obj.sal+obj.bonous;
			
			
			}
		System.out.println(obj.sal);
		
		
		
		// TODO Auto-generated method stub

	}

}
