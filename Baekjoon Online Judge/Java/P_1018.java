import java.util.Scanner;

public class P_1018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		char arr[][] = new char[N][M];

		for (int i = 0; i < N; i++) {
			String str = sc.next();
			for (int j = 0; j < M; j++) {
				arr[i][j] = str.charAt(j);
			}
		}

		int w = 0;
		int h = 0;

		char first = arr[0][0];

		char now = 'B';
		int flag = 0;
		int min = N * M;

		int count = 0;
		while (true) {
			count = 0;
			for (int i = w; i < w + 8; i++) {
				now = now == 'W' ? 'B' : 'W';
				for (int j = h; j < h + 8; j++) {
					if (arr[i][j] == now) {
						count++;
					}
					now = now == 'W' ? 'B' : 'W';
				}
			}

			if (count < min)
				min = count;
			h++;
			if (h > M - 8) {
				w++;
				h = 0;
			}
			if (w > N - 8) {
				flag++;
				now = 'W';
				w = 0;
				h = 0;
				if (flag == 2)
					break;
			}
		}
		System.out.println(min);
	}
}
