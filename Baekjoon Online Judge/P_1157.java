import java.util.Scanner;

public class P_1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[26];

		int max = 0;
		char tmp = 0;

		String str = sc.next();
		String upper = str.toUpperCase();

		for (int i = 0; i < upper.length(); i++) {
			arr[upper.charAt(i) - 65]++;
		}

		for (int i = 0; i < 26; i++) {
			if (i == 0) {
				max = arr[i];
				tmp = (char) (i + 65);
			} else {
				if (arr[i] > max) {
					max = arr[i];
					tmp = (char) (i + 65);
				} else if (arr[i] == max) {
					tmp = '?';
				}
			}
		}
		System.out.println(tmp);
	}
}
