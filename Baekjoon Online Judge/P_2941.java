import java.util.Scanner;

public class P_2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		String[] com = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		for (int i = 0; i < 8; i++)
			str = str.replace(com[i], "a");

		System.out.println(str.length());
	}
}
