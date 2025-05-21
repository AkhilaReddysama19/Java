package nrec3;
interface College{
	void type();
}
class Date{
	public void add() {
		System.out.println("NRCM,MLRIT");
	}
}
class Date1 extends Date implements College{
	public void Courses() {
		System.out.println("CSE,ECE,EEE");
	}
	public void Fees() {
		System.out.println("1lakh,1.2lakhs,1.1lakhs");
	}
	@Override
	public void type() {
		// TODO Auto-generated method stub
		
	}
}
class Date2{
	public void faculty(){
		System.out.println("joy,srinivas");
	}
}
class Date3 extends Date2{
	public void Students() {
		System.out.println("student details:name,id,branch");
	}
}
public class day4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		Date1 d1= new Date1();
		Date3 d3=new Date3();
		Date2 d2=new Date2();
		d.add();
		d1.Courses();
		d1.Fees();
		d2.faculty();
		
		
		

	}

}
