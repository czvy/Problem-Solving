import java.util.Scanner;

public class P_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double arr[] = new double[N];
		double max = 0;
		double sum = 0;

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			if (i == 0)
				max = arr[0];
			else {
				if (arr[i] > max)
					max = arr[i];
			}
		}
		
		for (int i = 0; i < N; i++) {
			sum += arr[i] / max * 100;
		}
		System.out.println(sum / N);
	}
}
