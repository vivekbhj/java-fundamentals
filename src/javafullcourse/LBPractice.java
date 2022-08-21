package javafullcourse;

public class LBPractice {

	public static void main(String[] args) {
		int m1 = 9;
		int m2 = 10;
		int m3 = 14;
		int min;
		System.out.println(m1++ < m2 && m1++ < m3);
		System.out.println(m1);
		System.out.println(m1 > m2 & m1++ <= m3);
		System.out.println(m1);
		System.out.println(m1++);
		System.out.println(m1);
		min = (m1 > m3) ? m1 : m3;
		System.out.println(min);
		m1 += 4;
		m1 -= 7;
		System.out.println(m1);
	}

}
