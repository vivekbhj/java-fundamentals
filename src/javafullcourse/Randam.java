package javafullcourse;

public class Randam {
	// class A {
	String m1(String x) {
		System.out.println("One");
		return "ABC";
	}

	String m1(String y, String z) {
		System.out.println("Two");
		return "PQR";
	}

	public static void main(String[] args) {
		Randam a = new Randam();
		// Randam b = new Randam();
		Randam b = a;
		System.out.println(a == b);
		// a.m1("ABC");
	}
}


