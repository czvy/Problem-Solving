import java.util.Scanner;

public class P_3053 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextInt();
		System.out.println(String.format("%.6f", num*num*Math.PI));
		System.out.println(String.format("%.6f", num*num*2));
	}
}
