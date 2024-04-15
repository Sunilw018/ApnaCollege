package Array;

public class MaxSubarraySum_1 {

	public static void subArraySum(int[] arrNum) {
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < arrNum.length; i++) {
			for (int j = i; j < arrNum.length; j++) {
				currSum = 0;
				for (int k = i; k <= j; k++) {
					currSum += arrNum[k];
				}
				System.err.print(currSum + " ");

				if (maxSum < currSum) {
					maxSum = currSum;
				}
			}

		}
		System.out.println("\nMax Sum of Array " + maxSum);

	}

	public static void main(String[] args) {

		int arrNum[] = { 1, -2, 6, -1, 3 };
//		int arrNum[] = { 2, 4, 6, 8, 10 };
		subArraySum(arrNum);

	}

}
