import java.util.Scanner;

public class P_4948 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = -1;
		while(num!=0) {
			num = sc.nextInt();
			if(num==1) {
				System.out.println(1);
				continue;
			}
			int M = num*2;
			
			int arr [] = new int[M];
			
			for(int i=2;i<M;i++) arr[i]=i;
			
			for(int j=2;j<M;j++) {
				if(arr[j]==0) continue;
				for(int k=j;k<M;k+=j) {
					if(k!=j)arr[k]=0;
				}
			}
			
			int count=0;
			for(int i=num+1;i<M;i++) {
				if(arr[i]!=0)count++;
			}
			if(num!=0)System.out.println(count);
		}
	}
}
