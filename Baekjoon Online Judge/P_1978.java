import java.util.Scanner;

public class P_1978 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		int count=0;
		for(int i=0;i<num;i++) {
			int N = sc.nextInt();
			int temp=0;
			if (N==1) temp=1;
			for(int j=2;j<N;j++) {
				if(N%j==0) {
					temp++;
					break;
				}
			}
			if (temp==0)
				count++;
		}
		System.out.println(count);
	}
}
