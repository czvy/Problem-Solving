import java.util.Scanner;

public class P_2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int result = 0;
		int min = -1;
		
		for(int i = M;i<=N;i++) {
			int flag=0;
			for(int j = 2; j<i;j++) {
				if(i%j==0) {
					flag++;
					break;
				}
			}
			if(flag==0&&i!=1) {
				if(min==-1) {
					min=i;
				}
				result+=i;
			}
		}
		System.out.println(result==0?min:result+"\n"+min);
	}
}
