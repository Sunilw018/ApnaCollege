package Array;

public class ReverseOrderArray {

	public static void reverseOrder(int[] num) {

		int start = 0;
		int last = num.length - 1;

		while (start < last) {
			int temp = num[last];
			num[last] = num[start];
			num[start] = temp;

			start++;
			last--;
		}
	}

	public static void main(String[] args) {

		int number[] = { 2, 4, 6, 8, 10 };

		reverseOrder(number);

		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}

	}
}
