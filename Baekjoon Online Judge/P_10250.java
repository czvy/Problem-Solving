import java.util.Scanner;

public class P_10250 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();
		
		System.out.println(N%H==0?(H*100)+N/H:(N%H*100)+1+N/H);
		}
	}
}
