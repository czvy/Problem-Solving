import java.util.Scanner;

public class P_10757 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.next();
		String s2 = sc.next();
		
		if(s1.length()<s2.length()) {
			String temp = s2;
			s2 = s1;
			s1 = temp;
		}
		int len = s1.length();
		int arr[] = new int[len];
		
		String str= "";
		for(int i=0;i<s1.length()-s2.length();i++) {
			str+="0";
		}
		str+=s2;
		s2 =str;
		
		int olim = 0;
		for(int i=s1.length()-1;i>=0;i--) {
			arr[i]=((s1.charAt(i)-'0')+(s2.charAt(i)-'0')+olim)%10;
			olim = ((s1.charAt(i)-'0')+(s2.charAt(i)-'0')+olim)/10;
		}
		
		if(olim!=0)System.out.print(olim);
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]);
		}
		
		
		
	}
}
