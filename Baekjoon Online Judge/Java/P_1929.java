import java.util.Scanner;

public class P_1929 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();

		N += 1;

		int arr[] = new int[N];

		for (int i = 2; i < N; i++)
			arr[i] = i;

		for (int i = 2; i < N; i++) {
			if (arr[i] == 0)
				continue;
			for (int j = i; j < N; j += i) {
				if (j != i)
					arr[j] = 0;
			}
		}

		for (int i = M; i < N; i++) {
			if (arr[i] != 0)
				System.out.println(i);
		}
	}

}
