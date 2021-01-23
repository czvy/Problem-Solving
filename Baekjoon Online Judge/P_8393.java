import java.util.Scanner;

public class P_8393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result=0;
		
		while(num>0) {
			result+=num;
			num--;
		}
		
		System.out.println(result);
	}
}
