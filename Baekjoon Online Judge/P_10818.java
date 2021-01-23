import java.util.Scanner;

public class P_10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int min=0,max=0;
		
		for(int i=0;i<num;i++) {
			int N = sc.nextInt();
			if(i==0) {
				min=N;
				max=N;
			}
			else {
				if(N<min) min=N;
				else if(N>max) max=N;
			}
		}
		System.out.println(min+" "+max);
	}
}
