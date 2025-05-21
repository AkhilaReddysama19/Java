package nrec3;

class Movies{
	void genre() {
		System.out.println("comedy");
	}
}
class hit extends Movies{
	void action() {
		System.out.println("investigation");
	}
}
class hero extends hit{
	void name()
	{
		System.out.println(" ram charan");
	}
}
class heroine extends hit{
	void looks() {
		System.out.println("beautiful");
	}
}
public class demo23{

	public static void main(String[] args) {
		hero a1=new hero();
		heroine m1=new heroine();
		a1.genre();
		a1.action();
		a1.name();
		m1.looks();
		//m1.genre();
		//m1.action();
	 

	}

}



