import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1436 {

	private static int cnt;
	private static int start = 665;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		while (N != cnt) {
			start++;
			
			if(sb.append(start).toString().contains("666"))
				cnt++;
				
			sb.setLength(0);
		}
		System.out.println(start);

	}

}
