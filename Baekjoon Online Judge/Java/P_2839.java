import java.util.Scanner;

public class P_2839 {
	static int cnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int NUM = sc.nextInt();

		System.out.println((NUM == 4 || NUM == 7) ? -1 : NUM % 5 == 0 ? NUM / 5 : getResult(NUM));
	}

	static int getResult(int NUM) {
		if (NUM == 1 || NUM == 3) {
			return cnt + 1;
		} else if (NUM == 2 || NUM == 4) {
			return cnt + 2;
		}
		cnt++;
		NUM -= 5;
		return getResult(NUM);
	}
}
