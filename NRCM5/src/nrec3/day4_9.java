package nrec3;
interface Shapes{
	void shapes();
}
interface Includes{
	void includes();
}
interface Geometry{
	void geometry();
}
interface Subject extends Shapes,Includes,Geometry{
	void subject();
}
class Maths implements Subject{
	public void one() {
		System.out.println("circle,rectangle,rhombus");
	}
	public void two() {
		System.out.println("circumference,area,perimeter");
	}
	public void formula() {
		System.out.println("radius,length,breadth,height");
	}
	public void types(){
		System.out.println("hexagon,pentagon,octagon");
	}
	public void tools() {
		System.out.println("scale,pen,pencil,compass");
	}
	@Override
	public void shapes() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void includes() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void geometry() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void subject() {
		// TODO Auto-generated method stub
		
	}
}

public class day4_9 {

	public static void main(String[] args) {
		Maths m1= new Maths();
		m1.one();
		m1.two();
		m1.formula();
		m1.types();
		m1.tools();
		

	}

}
