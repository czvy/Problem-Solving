import java.util.Scanner;

public class P_1259 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = -1;
		
		while(num!=0) {
			num = sc.nextInt();
			if(num!=0) {
				int count = 0;
				String temp = Integer.toString(num);
				for(int i=0;i<temp.length()/2;i++) {
					if(temp.charAt(i)!=temp.charAt(temp.length()-1-i)) {
						count++;
					}
				}
				System.out.println(count==0?"yes":"no");
			}
		}
	}
}
