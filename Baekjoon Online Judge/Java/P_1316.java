import java.util.Scanner;

public class P_1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt = 0;
		int N = sc.nextInt();

		for (int j = 0; j < N; j++) {
			int alpha[] = new int[26];
			String str = sc.next();

			for (int i = 0; i < str.length(); i++) {
				if (i == 0) {
					alpha[str.charAt(0) - 97]++;
				} else {
					if (str.charAt(i) != str.charAt(i - 1)) {
						if (alpha[str.charAt(i) - 97] != 0) {
							cnt++;
							break;
						} else {
							alpha[str.charAt(i) - 97]++;
						}
					}
				}
			}
		}
		System.out.println(N - cnt);
	}
}
