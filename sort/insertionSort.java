package Sort;

public class insertionSort {

	public static void main(String[] args) {

		int[] a = { 6, 3, 7, 1, 8, 9, 2, 5, 4, 0 };

		int temp, j;

		for (int i = 1; i < a.length; i++) {
			temp = a[i];
			for (j = i; j > 0 && a[j - 1] > temp; j--) {
				a[j] = a[j - 1];
			}
			a[j] = temp;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
