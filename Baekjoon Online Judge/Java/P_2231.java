import java.util.Scanner;

public class P_2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int res=0;
		
		for(int i=0;i<N;i++) {
			int result=i;
			String str = Integer.toString(i);
			int len = str.length();
			for(int j=0;j<len;j++) {
				result+=str.charAt(j)-'0';
			}
			if(result==N) {
				res=i;
				break;
			}
		}
		System.out.println(res);
	}
}
