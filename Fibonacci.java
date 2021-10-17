package assignment9;

public class Fibonacci {
	public static void main(String args[]) {
		printFibo(8);
	}

	public static int fibo(int num) {
		if (num == 1 || num == 2) {
			return 1;
		}
		return fibo(num - 1) + fibo(num - 2);
	}

	public static void printFibo(int num) {
		if (num == 0) {
			return;
		} else {
			printFibo(num - 1);
			System.out.print(fibo(num) + " ");
		}
	}

}
