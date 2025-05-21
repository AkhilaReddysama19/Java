package nrec3;

public class test_1 {

	public static void main(String[] args) {
		String s1="queen";
		String s2="queen";
		String s3=new String("A");
		String s4=new String("a");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
	    System.out.println(s3.equals(s4));
	    System.out.println(s3==s4);
	    System.out.println(s1.compareTo(s4));
	    System.out.println(s3.compareTo(s4));

	}

}
