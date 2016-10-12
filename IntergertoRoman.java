
public class IntergertoRoman {

	public static String getRomanChar(int num, int carry) {
		// 1 5 10 50 100 500 1000
		char[] roms = new char[] { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
		int index = 1;
		if (carry == 100)
			index = 3;
		else if (carry == 1000)
			index = 5;
		else if (carry == 10000)
			index = 7;
		carry = carry / 10;
		num = num / carry;
		switch (num) {

		case 1:
			return String.valueOf(roms[index - 1]);
		case 2:
			return String.valueOf(roms[index - 1]) + String.valueOf(roms[index - 1]);
		case 3:
			return String.valueOf(roms[index - 1]) + String.valueOf(roms[index - 1]) + String.valueOf(roms[index - 1]);
		case 4:
			return String.valueOf(roms[index - 1]) + String.valueOf(roms[index]);
		case 5:
			return String.valueOf(roms[index]);
		case 6:
			return String.valueOf(roms[index]) + String.valueOf(roms[index - 1]);
		case 7:
			return String.valueOf(roms[index]) + String.valueOf(roms[index - 1]) + String.valueOf(roms[index - 1]);
		case 8:
			return String.valueOf(roms[index]) + String.valueOf(roms[index - 1]) + String.valueOf(roms[index - 1])
					+ String.valueOf(roms[index - 1]);
		case 9:
			return String.valueOf(roms[index - 1]) + String.valueOf(roms[index + 1]);

		case 10:
			return String.valueOf(roms[index + 1]);

		}
		return "";
	}

	public static String intToRoman(int num) {

		String ans = "";
		int digit = 0, carry = 10;

		while (num > 0) {
			digit = num % carry;
			ans = getRomanChar(digit, carry) + ans;
			carry *= 10;
			if (digit != 0)
				num -= digit;

		}

		return ans;

	}

	public static void main(String arg[]) {
		System.out.println(intToRoman(3999));
	}
}
