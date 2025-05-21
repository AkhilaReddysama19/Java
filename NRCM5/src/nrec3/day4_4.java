package nrec3;
interface tcs {
	void employee1();
}
interface wipro{
	void employee2();
}
class tv{
	void best() {
		System.out.println("best employees");
	}
}
class practice extends tv implements tcs,wipro{
	public void name() {
		System.out.println("Anvitha,Mandhira");
	}
	public void id() {
		System.out.println("23,45 ");
	}
	public void salary () {
		System.out.println("50000,55000");
	}
	@Override
	public void employee2() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void employee1() {
		// TODO Auto-generated method stub
		
	}
}

public class day4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice p1=new practice();
		tv t1=new tv();
		t1.best();
		p1.name();
		p1.id();
		p1.salary();

	}

}

