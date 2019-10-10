package model;

public class PrimeNumbers {

	public static void main(String[] args) {

		int i = 2;
		while (i < 100) {
			if (isPrime(i)) {
				System.out.println(i);
			}
			i++;
		}
	}

	public static boolean isPrime(int i) {
		int count = 2;
		while (count < i) {
			if (i % count == 0) {
				return false;
			}
			count++;
		}
		return true;
	}

}
