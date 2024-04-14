package Array;

public class LinerIntSearch {

	public static int arryNum(int num[], int key) {

		for (int i = 0; i < num.length; i++) {
			if (num[i] == key) {
				return i;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int number[] = { 2, 10, 12, 53, 44, 17, 22, 10, 9, 42 };
		int key = 10;

		int index = arryNum(number, key);
		if (index == -1) {
			System.out.println("Key not found ..!!");
		} else {
			System.out.println("Key is found at Index :- " + index);
		}
	}

}
