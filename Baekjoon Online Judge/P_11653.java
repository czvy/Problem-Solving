import java.util.Scanner;

public class P_11653 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int temp = 2;
		
		while(N!=1) {
			if(N%temp==0) {
				N/=temp;
				System.out.println(temp);
				temp=2;
			}
			else
				temp++;
		}
	}
}
