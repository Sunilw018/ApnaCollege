package Array;

public class MaxSubarraySum_2 {

	public static int subArraySum(int[] arrNum, int n) {

		int maxSum = 0;
		int currSum = 0;

		for (int i = 0; i < n; i++) {
			currSum = currSum + arrNum[i];
			if (currSum < 0) {
				currSum = 0;
			}
			if (maxSum < currSum)
				maxSum = currSum;
		}
		return maxSum;
	}

	public static void main(String[] args) {

		int arrNum[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int n = arrNum.length;

		System.out.println("Max Sum :- "+subArraySum(arrNum, n));
	}

}
