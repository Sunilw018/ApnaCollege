package Array;

public class PrintSubarrays {

	public static void subArrays(int[] arrNum) {
		for (int i = 0; i < arrNum.length; i++) {
			int start = i;
			for (int j = i; j < arrNum.length; j++) {
				int end = j;
				for (int k = start; k <= end; k++) {
					System.out.print(arrNum[k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int arrNum[] = { 2, 4, 6, 8, 10 };
		subArrays(arrNum);
	}

}
