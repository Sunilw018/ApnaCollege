package Pattern;

public class BinaryToDecimalConvert {

	public static void IntegerBinaryToDecimal(int num) {

		int ans = 0, rem = 0, temp = num;
		int i = 0;
		while (num != 0) {
			rem = num % 10;
            num /= 10;

			ans += rem * Math.pow(2, i);
			i++;
			
		}
		
		 System.out.println("Decimal Equivalent of "+ ans);
	}

	public static void main(String[] args) {
		int num = 1010;
		IntegerBinaryToDecimal(num);
	}

}
