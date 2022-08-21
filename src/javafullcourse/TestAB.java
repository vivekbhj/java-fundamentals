package javafullcourse;

public class TestAB {
	public static void main(String[] args){
		 A a = new A();
		 a.m1(a);
		 a.m1(new B());
		 
		A a1 = new B();
		B b=(B) a1;
		  b.m1(null);
		 
		 a = b;
		 a.m1(null);
		 a.m1(new A());
		  }
	 

}
