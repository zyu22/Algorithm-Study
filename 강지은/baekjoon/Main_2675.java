import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2675 {
	
	static int T;
	static int N;

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			N = Integer.parseInt(st.nextToken());
			
			String s = st.nextToken();
			
			for (int i = 0; i < s.length(); i++) {
				for (int j = 0; j < N; j++) {
					sb.append(s.charAt(i));
				}
			}
			
			sb.append("\n");
			
		}
		
		System.out.println(sb);

	}

}
