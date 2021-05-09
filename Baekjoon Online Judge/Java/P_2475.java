import java.util.Scanner;

public class P_2475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		for(int i=0;i<5;i++) {
			int N = sc.nextInt();
			result+=N*N;
		}
		System.out.println(result%10);
	}
}
