package Array;


//  for use this 1st we have to sort array in ascending order or descending order
public class BInarySearchArray {

	public static int binaryArray(int[] number, int key) {
		int start = 0;
		int end = number.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (number[mid] == key) {
				return mid;
			}
			if (number[mid] < key) {

				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {

		int number[] = { 2, 4, 6, 8, 10, 12, 14 };
		int key = 10;
		int num = binaryArray(number, key);
		System.out.println(num);

	}

}
