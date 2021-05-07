import java.util.Scanner;

public class P_2447_2 {
	static int cnt = 3;
	static String[][] arr = new String[3][3];
	static String[][] arr2;
	static String star = "*";
	static String blank = " ";
	
	public static void main(String[] args) {
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==1&&j==1)arr[i][j]=" ";
				else arr[i][j]="*";
			}
		}
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		star(num);
	}

	static void star(int num) {
		if(num==cnt) {
			String[][] result = new String[num][num];
			for (int i=0;i<num;i++) {
				for(int j=0;j<num;j++) {
					result[i][j]=arr2[i/3][j/3];
					if(i%3==1&&j%3==1) result[i][j] =" ";
				}
			}
			for (int i=0;i<num;i++) {
				for(int j=0;j<num;j++) {
				System.out.print(result[i][j]);
				}
				System.out.println();
			}
		}
		else {
			arr2 = new String[cnt][cnt];
			for (int i=0;i<cnt;i++) {
				for(int j=0;j<cnt;j++) {
					arr2[i][j]=arr[i/3][j/3];
					if(i%3==1&&j%3==1) arr2[i][j] =" ";
				}
			}
			arr=arr2;
			cnt*=3;
			star(num);
		}
	}
}
