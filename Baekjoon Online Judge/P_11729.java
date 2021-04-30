import java.io.*;

public class P_11729 {
	static int cnt = 0;
	static int[][] arr;
	static int[][] temp;

	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		hanoi(N);
	}
	
	static void hanoi(int num) throws IOException {
		if(cnt==num) {
			bw.write(arr.length+"\n");
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<2;j++) {
					if(j==0)bw.write(arr[i][j]+" ");
					else bw.write(arr[i][j]+"\n");
				}
			}
			bw.flush();
			bw.close();
		}
		else {
			int compare = cnt==0?0:temp.length;
			arr=new int[compare*2+1][2];
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<2;j++) {
					if(i<compare) {
						arr[i][j]=temp[i][j]==2?3:temp[i][j]==3?2:temp[i][j];
					}
					else if(i>compare) {
						arr[i][j]=temp[i-compare-1][j]==1?2:temp[i-compare-1][j]==2?1:temp[i-compare-1][j];
					}
					else
						arr[i][j]=j==0?1:3;
				}
			}
			temp=arr;
			cnt++;
			hanoi(num);
		}
	}
}
