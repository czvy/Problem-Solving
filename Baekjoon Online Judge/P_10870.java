import java.util.Scanner;

public class P_10870 {
	static int first = 0;
	static int second = 1;
	static int count = 1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(Fibonacci(num));
	}
	static int Fibonacci(int num) {
		if(num==0)
			return 0;
		if(num==count) {
			return second;
		}
		else {
			int temp = second;
			second =first+second;
			first=temp;
			count++;
			return Fibonacci(num);
		}
	}
}
