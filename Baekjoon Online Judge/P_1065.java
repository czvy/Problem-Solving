import java.util.Scanner;

public class P_1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int cnt = 0;

		for (int i = 1; i <= N; i++) {
			if(calc(i)==true)cnt++;
			if(i==1000)cnt--;
		}
		
		System.out.println(cnt);
	}
	
	static boolean calc(int i) {
		int thousand = i / 1000;
		int hundred = (i / 100) % 10;
		int ten = (i / 10) % 10;
		int one = i % 10;
		
		if(i<=99) return true;
		else {
			if(hundred-ten==ten-one) return true;
		}
		return false;
	}
}
