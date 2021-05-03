import java.util.Scanner;

public class P_2869 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		
		System.out.println((V-A)%(A-B)==0?(V-A)/(A-B)+1:(V-A)/(A-B)+2);
	}
}
