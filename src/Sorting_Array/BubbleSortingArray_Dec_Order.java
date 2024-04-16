package Sorting_Array;

public class BubbleSortingArray_Dec_Order {

	public static void sortarry(int[] arrNum) {

		int tmp = 0;

		for (int i = 0; i < arrNum.length; i++) {
			for (int j = i + 1; j < arrNum.length; j++) {
				if (arrNum[i] < arrNum[j]) {
					tmp = arrNum[i];
					arrNum[i] = arrNum[j];
					arrNum[j] = tmp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arrNum[] = { 5, 4, 1, 3, 2 };

		sortarry(arrNum);

		for (int i : arrNum) {
			System.out.print(i + " ");
		}
	}

}
