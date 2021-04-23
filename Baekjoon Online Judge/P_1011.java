import java.util.Scanner;

public class P_1011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			int distance = y - x;
			int cnt = 0;

			while (distance > 0) {
				distance -= cnt += 2;
			}
			int temp = distance + cnt;
			System.out.println(distance == 0 ? cnt : temp < cnt / 2 + 1 ? cnt - 1 : cnt);
		}
	}
}
