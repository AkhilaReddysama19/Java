package nrec3;
interface Ticketbooking{
	void ticketbooking();
}
interface Busbooking{
	void busbooking();
}
interface Trainbooking{
	void trainbooking();
}
class Booking implements Ticketbooking,Busbooking,Trainbooking{
	public void book(){
		System.out.println("different bookings are:");
	}
	public void bus() {
		System.out.println("redbus,abhibus");
	}
	public void train() {
		System.out.println("metro,vandebharat");
	}
	public void air() {
		System.out.println("qatar,vistara,airindia");
	}
	@Override
	public void trainbooking() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void busbooking() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ticketbooking() {
		// TODO Auto-generated method stub
		
	}
}
interface I1{
	void i1();
}
class List extends Booking implements I1{
	public void name() {
		System.out.println("deepak booked airindia");
	}
	public void flight() {
		System.out.println("arun booked redbus");
	}
	@Override
	public void i1() {
		// TODO Auto-generated method stub
		
	}
}

public class day4_8 {

	public static void main(String[] args) {
		Booking b1=new Booking();
		List l1=new List();
		b1.book();
		b1.bus();
		b1.train();
		b1.air();
		l1.name();
		l1.flight();
		

	}

}


