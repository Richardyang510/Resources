package Sort;

public class selectionSort {
	
	public static void main(String[] args) {

		int[] a = { 6, 3, 7, 1, 8, 9, 2, 5, 4, 0 };

		int temp, minPos;
		
		for(int i = 0;i < a.length;i++){
			minPos = i;
			for(int j = i;j < a.length;j++){
				if(a[j] < a[minPos]){
					minPos = j;
				}
			}
			if(minPos != i){
				temp = a[i];
				a[i] = a[minPos];
				a[minPos] = temp;
			}
		}
		
		

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
