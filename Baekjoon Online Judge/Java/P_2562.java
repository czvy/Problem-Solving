import java.util.Scanner;

public class P_2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int tmp = 1;

		for (int i = 0; i < 9; i++) {
			int num = sc.nextInt();
			if (i == 0)
				max = num;
			else {
				if (num > max) {
					max = num;
					tmp = i + 1;
				}
			}
		}
		System.out.println(max);
		System.out.println(tmp);
	}
}
