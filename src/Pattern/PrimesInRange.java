package Pattern;

public class PrimesInRange {

	public static boolean isPrime(int k) {
		boolean isprime = true;
		for (int i = 2; i <= k - 1; i++) {
			if (k % i == 0) {
				isprime = false;
			}
		}
		return isprime;
	}

	public static void primeInRange(int n) {
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}

//		System.out.println();

	}

	public static void main(String[] args) {
		primeInRange(30);

	}

}
