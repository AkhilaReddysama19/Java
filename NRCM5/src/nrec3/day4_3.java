package nrec3;
interface petroleum{
	void bunk();
}
class Sample{
	public void name() {
		System.out.println("indian oil");
			}
}
class test extends Sample implements petroleum{
	public void near() {
		System.out.println("diesel");
	}
	public void kompally() {
		System.out.println("LPG ");
	}
	@Override
	public void bunk() {
		// TODO Auto-generated method stub
		
	}
}
class practice1 extends test{
	public void gas() {
		System.out.println("CNG");
	}
	
}

public class day4_3 {

	public static void main(String[] args) {
		test t1=new test();
		practice1 p2=new practice1();
		t1.name();
		t1.near();
		t1.kompally();
		p2.gas();
		

	}

}


