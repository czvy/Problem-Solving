import java.util.Scanner;

public class P_1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int tmp = num;
		int cnt = 0;
		num = -1;

		while (tmp != num) {
			int A, B;
			if (cnt == 0) {
				A = tmp / 10;
				B = tmp % 10;
			} else {
				A = num / 10;
				B = num % 10;
			}
			num = B * 10 + ((A + B) % 10);
			cnt++;
		}
		System.out.println(cnt);

	}
}