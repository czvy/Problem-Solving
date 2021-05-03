import java.util.Scanner;

public class P_1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int tmp = 0;
		while(num>0) {
			tmp++;
			num-=tmp;
		}
		int temp = num+tmp-1;
		System.out.println(tmp%2==0?(1+temp)+"/"+(tmp-temp):tmp-temp+"/"+(1+temp));
	}
}
