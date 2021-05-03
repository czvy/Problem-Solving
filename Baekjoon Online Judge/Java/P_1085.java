import java.util.Scanner;

public class P_1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[4];
		int x = 0, y = 0;
		for (int i = 0; i < 4; i++) {
			num[i] = sc.nextInt();
			
		}
		x = (num[2] - num[0] > num[0]) ? num[0] : num[2] - num[0];
		y = (num[3] - num[1] > num[1]) ? num[1] : num[3] - num[1];

		System.out.println(x>y?y:x);
		
	}
}
