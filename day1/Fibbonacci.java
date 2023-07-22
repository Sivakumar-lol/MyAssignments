package week1.day1;

public class Fibbonacci {

	public static void main(String[] args) {
		int first = 0;
		int sec = 1;
		int sum = 0;
		System.out.print(first);
		System.out.print(" "+sec);
		for (int i=1;i<=11;i++)
		{
			sum=first+sec;
			System.out.print(" "+sum );
			first = sec;
			sec = sum;
		}

	}

}
