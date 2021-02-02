import java.util.Scanner;

public class P_4153 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = -1, B = -1, C = -1;
		while (A != 0 || B != 0 || C != 0) {
			A = sc.nextInt();
			B = sc.nextInt();
			C = sc.nextInt();
			if (A != 0 && B != 0 && C != 0) {
				if (A * A + B * B == C * C || A * A + C * C == B * B || C * C + B * B == A * A)
					System.out.println("right");
				else
					System.out.println("wrong");
			}
		}
	}
}
