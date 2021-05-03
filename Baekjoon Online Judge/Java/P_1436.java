import java.util.Scanner;

public class P_1436 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int N = sc.nextInt();
		int temp = 0;
		
		while (N!=num) {
			temp++;
			if(Integer.toString(temp).contains("666")) {
				num++;
			}
		}
		System.out.println(temp);
	}
}
