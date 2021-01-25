import java.util.Scanner;

public class P_10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alpha[] = new int[26];
		for (int i = 0; i < 26; i++)
			alpha[i] = -1;

		String str = sc.next();

		for (int i = 0; i < str.length(); i++) {
			if (alpha[str.charAt(i) - 97] == -1)
				alpha[str.charAt(i) - 97] = i;
		}
		for (int i = 0; i < 26; i++)
			System.out.print(alpha[i] + " ");
	}
}
