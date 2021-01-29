import java.util.Scanner;

public class P_5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			int cnt = 1;
			int ch = 'A';

			while (ch < 'Z') {
				if (str.charAt(i) >= ch) {
					cnt++;
				}
				if (ch == 'P')
					ch++;
				ch += 3;
			}
			sum += cnt;
		}
		System.out.println(sum + str.length());
	}
}
