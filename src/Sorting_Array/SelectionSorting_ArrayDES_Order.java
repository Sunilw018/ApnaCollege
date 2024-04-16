package Sorting_Array;

public class SelectionSorting_ArrayDES_Order {

	public static void sortingDES(int[] arrNum) {

		int minNum = 0;
		int temp = 0;

		for (int i = 0; i < arrNum.length - 1; i++) {
			minNum = i;
			for (int j = i + 1; j < arrNum.length; j++) {

				if (arrNum[minNum] < arrNum[j]) {
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

		int arrNum[] = { 5, 3, 1, 4, 2 };

		sortingDES(arrNum);

		for (int i : arrNum) {
			System.err.print(i + " ");
		}
	}
}
// OutPut := 5 4 3 2 1 