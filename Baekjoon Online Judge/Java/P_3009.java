import java.util.Scanner;

public class P_3009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		
		System.out.print(x1==x2?x3:x1==x3?x2:x1);
		System.out.print(" ");
		System.out.print(y1==y2?y3:y1==y3?y2:y1);
	}
}
