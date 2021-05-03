import java.util.Scanner;

public class P_2292 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int temp=0;
		int cnt=1;
		
		if(num==1) System.out.println(1);
		else {
		while(num>1) {
			cnt++;
			temp+=6;
			num-=temp;
		}
		System.out.println(cnt);
		}
	}
}
