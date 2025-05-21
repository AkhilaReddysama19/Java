package nrec3;
interface carname{
	void name();
}
interface price extends carname{
	void price();
}
class Sample1 implements price{
	public void color() {
		System.out.println("black");
	}
	public void name() {
		System.out.println("audi");
	}
	public void price() {
		System.out.println("70 lakhs");
	}
}
class Sample2 implements price{
	public void model() {
		System.out.println("q5");
	}
	public void name() {
		System.out.println("audi");
	}
	public void price() {
		System.out.println("70 lakhs");
	}
}

public class day4_2  {
	
	public static void main(String[] args) {
		Sample1 s1=new Sample1();
		Sample2 s2=new Sample2();
		s1.color();
		s1.name();
		s1.price();
		s2.model();
		//s2.name();
		//s2.price();
        

	}

}

