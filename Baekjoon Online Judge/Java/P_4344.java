import java.util.Scanner;

public class P_4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			double sum = 0, cnt = 0;
			int arr[] = new int[num];
			for (int j = 0; j < num; j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}
			for (int j = 0; j < num; j++) {
				if (arr[j] > sum / num)
					cnt++;
			}
			System.out.println(String.format("%.3f", cnt / num*100)+"%");

		}
	}
}
