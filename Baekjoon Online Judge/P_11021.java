import java.io.*;

public class P_11021 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[2];
		
		for(int i=0;i<N;i++) {
			String str = br.readLine();
			arr = str.split(" ");
			
			bw.write("Case #"+(i+1)+": "+(Integer.parseInt(arr[0])+Integer.parseInt(arr[1]))+"\n");
		}
		bw.flush();
		bw.close();
	}
}
