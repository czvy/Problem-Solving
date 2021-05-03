import java.util.Scanner;

public class P_10952 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A=-1,B=-1;
		
		while(A!=0||B!=0) {
			A = sc.nextInt();
			B = sc.nextInt();
			if(A+B!=0)System.out.println(A+B);
		}
		
	}
}
