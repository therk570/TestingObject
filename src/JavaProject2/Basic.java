package JavaProject2;

public class Basic {
	String Emp_name= "kumar";
	int Emp_ID=101;
	
	void add() {
		int x=100;
		int y=100;
		System.out.println(x+y);
	}
	void sub() {
		int x=100;
		int y=200;
		System.out.println(x-y);
	}

	public static void main(String[] args) {
		Basic obj =new Basic();
		obj.add();
		obj.sub();
		

	}

}
