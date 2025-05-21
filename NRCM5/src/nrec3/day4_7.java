package nrec3;
interface Police{
	void police();
}
 class Test10 implements Police{
	void test10() {
		System.out.println("different positions in");
	}
	void test11() {
		System.out.println("police deparments are:");
	}
	@Override
	public void police() {
		// TODO Auto-generated method stub
		
	}
	
	
}
interface I2{
	void i2();
}
class Officer implements I2{
	public void higherofficer() {
		System.out.println("DIG");
	}
	public void normalofficer() {
		System.out.println("SI");
	}
	@Override
	public void i2() {
		// TODO Auto-generated method stub
		
	}	
}
interface I3{
	void i3();
}
class  Publicservers implements I3{
	public void server() {
		System.out.println("army");
	}
	public void nation() {
		System.out.println("soldiers");
	}
	@Override
	public void i3() {
		// TODO Auto-generated method stub
		
	}
}


public class day4_7{

	public static void main(String[] args) {
		Test10 t1=new Test10();
		Officer o1=new Officer();
		Publicservers p1=new Publicservers();
		t1.test10();
		t1.test11();
		o1.higherofficer();
		o1.normalofficer();
		p1.server();
		p1.nation();
		

	}

}


