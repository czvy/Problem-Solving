import java.util.Scanner;

public class P_1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tmp = 0;
		int cnt = 0;
		String str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= 65 && str.charAt(i) <= 90) || (str.charAt(i) >= 97 && str.charAt(i) <= 122))
				tmp = 1;
			else
				tmp = 0;

			if (tmp == 1) {
				if (i == str.length() - 1) {
					cnt++;
				} else if (str.charAt(i + 1) == ' ') {
					cnt++;
				}

			}
		}
		System.out.println(cnt);
	}
}
