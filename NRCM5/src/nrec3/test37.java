package nrec3;
class Sample45 {
	public Sample45() {
	System.out.println("good evening");
	}
	int x=99;
	void print() {
		System.out.println("hello");
	}
}
public class test37 extends Sample45 {
	public test37() {
		super();
	}
	void show() {
		int y=45;
		super.print();
		System.out.println(super.x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		test37 t1=new test37();
		t1.show();
	}
}