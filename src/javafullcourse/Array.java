package javafullcourse;

public class Array {

	public static void main(String[] args) {
		int a[] = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = i;

		}

		for (int i : a) {

			System.out.println(i);
		}

	}

}
