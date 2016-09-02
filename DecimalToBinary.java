public static int decimalToBinary(int a) {
		int result = 0;
		int multiplier = 1;
		while (a>0) {
			result = result + (multiplier*(a%2));
			multiplier *= 10;
			a = a/2;
		}
		return result;
	}