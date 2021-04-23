import java.util.Scanner;

public class P_1002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();

			double a = x1 - x2;
			double b = y1 - y2;

			double radius = Math.sqrt(a * a + b * b);

			if (radius==0 && r1 == r2) {
				System.out.println(-1);
			}  else if (radius == Math.abs(r2 - r1) || radius == r1 + r2) {
				System.out.println(1);
			}  else if (radius > r1 + r2 || radius < Math.abs(r2 - r1)) {
				System.out.println(0);
			}  else if (radius < r1 + r2) {
				System.out.println(2);
			}
		}
	}
}
