import java.io.*;

public class P_15552 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] ss = new String[2];
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0;i<num;i++) {
			String str = br.readLine();
			ss = str.split(" ");

			bw.write(Integer.parseInt(ss[0])+Integer.parseInt(ss[1])+"\n");
		}
		bw.flush();
		bw.close();
	}
}
