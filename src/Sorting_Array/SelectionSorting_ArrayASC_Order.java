package Sorting_Array;

public class SelectionSorting_ArrayASC_Order {

	public static void sortingASC(int[] arrNum) {
		int minNum = 0;
		int temp = 0;

		for (int i = 0; i < arrNum.length - 2; i++) {

			minNum = i;

			for (int j = i + 1; j < arrNum.length; j++) {

				if (arrNum[minNum] > arrNum[j]) {
					minNum = j;
				}

			}
			// swap
			temp = arrNum[minNum];
			arrNum[minNum] = arrNum[i];
			arrNum[i] = temp;
		}
	}

	public static void main(String[] args) {

		int arrNum[] = { 5, 4, 1, 3, 2 };
		sortingASC(arrNum);
		
		for (int i : arrNum) {
			System.err.print(i+" ");
		}
	}

}

// OutPut :- 1 2 3 5 4 