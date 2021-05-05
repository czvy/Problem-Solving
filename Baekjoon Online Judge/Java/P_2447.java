import java.util.Scanner;

public class P_2447 {
	static int cnt = 1;
	static String[] line;
	static String[] line2;
	
	public static void main(String[] args) {
		line2 = new String[1];
		line2[0]= "*";
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		star(num);
	}

	static void star(int num) {
		if(num==cnt) {
			for(int i=0;i<num;i++) {
				System.out.println(line[i]);
			}
		}
		else {
			int N = cnt*3;
			line= new String[N];
			for(int i=0;i<N;i++) {
				line[i]="";
				for(int j=0;j<3;j++){
					if((j==1)&&(i/cnt==1)) {
						for(int k=0;k<cnt;k++) {
						line[i]+=" ";
						}
					}
					else if(cnt==1) {
						line[i]+=line2[0];
					}
					else {
						line[i]+=line2[i%cnt];
					}
				}
			}
			line2 = new String[N];
			line2 = line;
			cnt*=3;
			star(num);
		}
	}
}
