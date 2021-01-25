public class P_4673 {
	public static void main(String[] args) {
		int arr[] = new int[10001];
		arr[10000]=1;
		
		for (int i = 1; i <= 10000; i++) {
			int thousand = i/1000;
			int hundred = (i/100)%10;
			int ten = (i/10)%10;
			int one = i%10;
			
			int newNum = i+thousand+hundred+ten+one;
			if(newNum<10000) {
				arr[newNum]=1;
			}
			
		}
		
		for(int i=1;i<=10000;i++) {
			if(arr[i]==0) {
				System.out.println(i);
			}
		}
	}
}
