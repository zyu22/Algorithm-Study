import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_19941 {
	
	static int N;
	static int K;
	static char[] arr;
	static boolean[] visit;

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		arr = br.readLine().toCharArray();
		visit = new boolean[N];
		boolean eat = false;
		
		int[] dr = {-1, 1};
		
		for (int i = 0; i < N; i++) {
			if (arr[i] == 'P') {
				
				for (int j = K; j > 0; j--) {
					if (check(i+dr[0]*j) && arr[i+dr[0]*j] == 'H' && visit[i+dr[0]*j] == false) {
						visit[i+dr[0]*j] = true;
						eat = true;
						break;
					}
				}
				
				if (eat == false) {
					for (int j = 1; j <= K; j++) {
						if (check(i+dr[1]*j) && arr[i+dr[1]*j] == 'H' && visit[i+dr[1]*j] == false) {
							visit[i+dr[1]*j] = true;
							break;
						}
						
					}
				}
				
				eat = false;
				
			}
			
		}
		
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			if (visit[i] == true)
				cnt++;
		}
		
		System.out.println(cnt);

	}

	private static boolean check(int i) {
		return 0 <= i && i < N;
	}

}
