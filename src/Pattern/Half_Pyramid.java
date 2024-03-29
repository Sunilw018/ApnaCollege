package Pattern;

public class Half_Pyramid {

	public static void main(String[] args) {
		int n = 4;
		for (int line = 1; line <= 4; line++) {
			for (int number = 1; number <= line; number++) {
				System.out.print(line+" ");
			}
			System.out.println();
		}

	}

}
