import java.util.Scanner;

public class P_10872 {
	static int result=1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num==0?1:fact(num));
	}
	static int fact(int N) {
		if(N==1) return result;
		else {
			result*=N;
			return fact(N-1);
		}
	}
}


