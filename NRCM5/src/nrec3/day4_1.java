package nrec3;
interface flowername{
	void name();
}
interface flowercolor{
	void color();
}
interface flowersmell extends flowername,flowercolor{
	void smell();
}

public class day4_1 implements flowersmell {
	public void display() {
		System.out.println("flower details:");
	}
	public void name() {
		System.out.println("sunflower");
	}
	public void color() {
		System.out.println("yellow");
	}
	public void smell() {
		System.out.println("nice");
	}
	
    public static void main(String[] args) {
    	day4_1 d1=new day4_1();
    	d1.display();
    	d1.name();
    	d1.color();
    	d1.smell();
		

	}

}
