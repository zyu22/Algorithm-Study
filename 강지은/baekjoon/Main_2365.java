import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main_2365 {

	static int N;
	static String result;
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		int max = 0;
		
		for (int i = 1; i <= N; i++) {
			int first = N;
			int second = i;
			
			sb.append(first+" "+second);
			
			int cnt = 2;
			int third = first - second;
			while (third >= 0) {
				sb.append(" "+third);
				first = second;
				second = third;
				cnt++;
				third = first - second;
			}
			
			if (max < cnt) {
				max = cnt;
				result = sb.toString();
			}
			
			sb.setLength(0);			
		}
		
		System.out.println(max);
		System.out.println(result);
		
	}

}
