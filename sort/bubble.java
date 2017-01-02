package Sort;

public class bubble {

	public static void main(String[] args) {

		int[] a = { 6, 3, 7, 1, 8, 9, 2, 5, 4, 0 };

		int temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
