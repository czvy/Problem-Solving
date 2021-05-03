import java.util.Scanner;

public class P_3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[42];
		int cnt = 0;

		for (int i = 0; i < 10; i++) {
			int num = sc.nextInt();
			arr[num % 42]++;
		}

		for (int i = 0; i < 42; i++) {
			if (arr[i] != 0)
				cnt++;
		}

		System.out.println(cnt);
	}
}
