public static int binaryToDecimal(int a) {
	int result = 0;
	int powOf2 = 1;
	while (a>0) {
		result += (powOf2*(a%10));
		powOf2 *= 2;
		a = a/10;
	}
	return result;
}