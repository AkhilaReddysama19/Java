package nrec3;
interface Streetfood {
	void streetfood();
}
interface Spicyfood {
	void spicyfood();
}
interface Outside extends Streetfood,Spicyfood {
	void outside();
}
class Sample23{
	void sample23() {
		System.out.println("fast food");
	}
}
class Sample24 extends Sample23 implements Streetfood,Spicyfood{
	public void healthy() {
		System.out.println("nothing is healthy");
	}
	public void good() {
		System.out.println("fruits");
	}
	public void junk() {
		System.out.println("burger,pizza");
	}
	public void verybad() {
		System.out.println("manchuria,noodles");
	}
	@Override
	public void spicyfood() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void streetfood() {
		// TODO Auto-generated method stub
		
	}
	
}

public class day4_6{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample24 s1=new Sample24();
		Sample23 s2=new Sample23();
		s2.sample23();
		s1.healthy();
		s1.good();
		s1.junk();
		s1.verybad();
		
		
		
	}

}


