package Sorting_Array;

public class BubbleSortingArray_Inc_Order {

	public static void sortArr(int[] arrNum) {

		for (int i = 0; i < arrNum.length; i++) {

			for (int j = i + 1; j < arrNum.length; j++) {

				if (arrNum[i] > arrNum[j]) {

					int temp = arrNum[i];
					arrNum[i] = arrNum[j];
					arrNum[j] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {

		int arrNum[] = { 5, 4, 1, 3, 2 };

		sortArr(arrNum);

		for (int i : arrNum) {

			System.out.print(i + " ");
		}
	}

}
