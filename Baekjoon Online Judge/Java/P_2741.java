//import java.util.Scanner;
import java.io.*;

public class P_2741 {
	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();	
//		for(int i=1;i<=N;i++) System.out.println(i);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=N;i++) bw.write(i+"\n");
		bw.flush();
		bw.close();
	}
}
