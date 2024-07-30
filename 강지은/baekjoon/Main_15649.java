// 시간 초과 발생
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_15649 {

	private static int N;
	private static int M;
	
	private static int[] arr;
	private static boolean[] visited;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		visited = new boolean[N];
		
		backtracking(0);

	}

	private static void backtracking(int depth) {
		
		if (depth == M) {
			for (int n : arr)
				System.out.printf("%d ", n);
			System.out.println();
			return;
		}
		
		for (int i = 0; i < N; i++) {
			if (visited[i] == false) {
				visited[i] = true;
				arr[depth] = i+1;
				backtracking(depth+1);
				visited[i] = false;
			}
		}
		
		return;
		
	}
	
}
