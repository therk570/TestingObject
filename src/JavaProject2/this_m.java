package JavaProject2;

public class this_m {
	int a =50;
	void m1() {
	int a=30;
		System.out.println(a);
		System.out.println(this.a);
		
	}

	public static void main(String[] args) {
		this_m obj=new this_m();
		obj.m1();

	}

}
