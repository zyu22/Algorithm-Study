// 타인 풀이 참고
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_16922 {

	private static int N;
	private static int[] num = new int[] {1, 5, 10, 50};

	private static boolean[] visit;
	private static int res;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		visit = new boolean[1001]; // 왜 1001?
		
		
		backtracking(0, 0, 0);
		
		System.out.println(res);

	}

	private static void backtracking(int depth, int idx, int sum) {
		if (depth == N) {
			if (!visit[sum]) {
				visit[sum] = true;
				res++;
			}
			return;
		}
		
		for (int i = idx; i < 4; i++) {
			backtracking(depth+1, i, sum + num[i]);
		}
	
	}

}
