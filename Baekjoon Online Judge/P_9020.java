import java.util.Scanner;

public class P_9020 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int j = 0; j < num; j++) {
			int N = sc.nextInt();
			int fNum = N / 2;

			while (true) {
				int count = 0;
				for (int i = 2; i < fNum; i++) {
					if (fNum % i == 0) {
						count++;
						break;
					}
				}
				if (count == 0) {
					for (int i = 2; i < (N - fNum); i++) {
						if ((N - fNum) % i == 0) {
							count++;
							break;
						}
					}
				}
				if (count == 0) {
					System.out.println(fNum + " " + (N - fNum));
					break;
				} else
					fNum -= 1;
			}
		}
	}
}
