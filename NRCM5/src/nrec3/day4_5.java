package nrec3;
interface Fruits{
	void fruits();
}
interface Names{
	void sample();
	
}
class Test1{
	void names() {
		System.out.println("apple,banana");
	}
}
class Test2 extends Test1 implements Fruits,Names{
	public void color() {
		System.out.println("red,yellow");
	}
	public void taste() {
		System.out.println("sweet,more sweet");
	}
	public void smell() {
		System.out.println("good,bad");
	}
	@Override
	public void sample() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fruits() {
		// TODO Auto-generated method stub
		
	}
}
class Test3 extends Test2{
	public void benefits() {
		System.out.println("healthy");
	}
}

public class day4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1=new Test1();
		Test2 t2=new Test2();
		Test3 t3=new Test3();
		t3.benefits();
		t2.color();
		t2.taste();
		t2.smell();
		t1.names();

	}

}


