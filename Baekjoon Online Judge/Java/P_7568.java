import java.util.Scanner;

public class P_7568 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int height[] = new int[N];
		int weight[] = new int[N];
		int rank[] = new int[N];

		for (int i = 0; i < N; i++) {
			weight[i] = sc.nextInt();
			height[i] = sc.nextInt();
			rank[i] = 1;
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (height[i] < height[j] && weight[i] < weight[j]) {
					rank[i]++;
				}
			}
		}

		for (int i = 0; i < N; i++) {
			System.out.print(rank[i] + " ");
		}
	}
}
