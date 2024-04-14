package Array;

public class FIndLargeNum {
	public static void largeNum(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[0] < arr[i]) {
				arr[0] = arr[i];
			}
		}
		System.out.println("largest element : " + arr[0]);
	}

	public static void main(String[] args) {
		int arrNum[] = { 1, 6, 8, 10, 15, 0, 2, 35 };

		largeNum(arrNum);

	}

}
