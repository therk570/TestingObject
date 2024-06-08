package linkhandling;

public class InsertDatainExelSheet {

	public static void main(String[] args) {
		xssfworkbook wo =new xssfworkbook();
		xssfsheet sh = wo.creatsheet("TestDataForLogin");
		xssfrow r =sh.createrow(0);
		r.creatcell(0).setcellvalue("username");
		r.createcell(1).setcellvalue("password");
		
		xssfrow r1 =sh.createrow(1);
		r1.createcell(0).setcellvalue("kumar");
		r1.createcell(1).setcellvalue("kumar1234");
		
		xssfrow r2 =sh.createrow(2);
		r2.createcell(0).setcellvalue("sai");
		r2.createcell(1).setcellvalue("sai1234");
		
		Fileoutputstream fo =new Fileoutputstream("D\logininfo.xsls");
		wo.write(fo);

	}

}
