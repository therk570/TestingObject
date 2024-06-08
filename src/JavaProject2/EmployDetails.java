package JavaProject2;

public class EmployDetails {
	String Emp_name="ramu";
	int Emp_id =101;
	
   void Emp_Details(){
	   System.out.println(Emp_name);
	   System.out.println(Emp_id);
   }
    void add(){
    	int x=1000;
    	int y=2000;
     System.out.println(x+y);
    	
    }
     void sub() {
    	 int x=2000;
    	 int y=1000;
    	 System.out.println(x-y);
     }
	public static void main(String[] args) {
		EmployDetails obj=new EmployDetails();
		obj.Emp_Details();
		obj.add();
		obj.sub();

	}

}
