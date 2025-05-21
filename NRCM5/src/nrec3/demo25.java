package nrec3;
class test1 {
	void add() {
		System.out.println("hi");
	}
}
public class demo25 extends test1 {
	void add() {
		System.out.println("hello");
	}


	public static void main(String[] args) {
		demo25 d1=new demo25();
		d1.add();

	}

}

