import java.util.Scanner;

public class P_2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[10];

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		String str = Integer.toString(A * B * C);

		for (int i = 0; i < str.length(); i++)
			arr[(str.charAt(i) - '0')]++;
		for (int i = 0; i < 10; i++)
			System.out.println(arr[i]);
	}
}
