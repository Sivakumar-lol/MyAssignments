package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int i = 45, k = 0;
		if (i == 1 || i == 0) {
			System.out.println(i + " is a Prime Number");
		}
		for (int j = 2; i / 2 <= j; j++) {
			System.out.println(i + " is a Prime Number");
			k = 1;
			break;
		}
		if (k == 0) {
			System.out.println(i + " is not a Prime Number");
		}
	}
}
