import java.util.Scanner;

public class P_10950 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int tmp=0,cnt=0;
		
		for(int i=0;i<num*2;i++) {
			int n1 = sc.nextInt();
			cnt++;
			if(cnt==2) {
				cnt=0;
				System.out.println(tmp+n1);
			}
			tmp=n1;
		}
	}
}
