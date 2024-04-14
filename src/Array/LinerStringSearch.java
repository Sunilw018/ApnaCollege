package Array;

public class LinerStringSearch {

	public static int foodList(String[] arrayfood, String key) {
		for (int i = 0; i < arrayfood.length; i++) {
			if (arrayfood[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {

		String arrayfood[] = { "Asparagus", "Biscuits", "Hardtack", "Toast", "Cabbage", "Pancake" };
		String key = "Toast";

		int result = foodList(arrayfood, key);

		if (result == -1) {
			System.out.println("Key word is not found ...");
		} else {
			System.out.println("Key word is found at index " + result);
		}
	}
}