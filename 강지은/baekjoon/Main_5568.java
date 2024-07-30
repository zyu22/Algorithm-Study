import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_5568 {

	private static int N;
	private static int K;
	
	private static String[] tmp;
	private static String[] arr;
	private static boolean[] visit;
	
	private static List<String> res = new ArrayList<>();
	private static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		K = Integer.parseInt(br.readLine());
		
		tmp = new String[N];
		arr = new String[K];
		visit = new boolean[N];
		
		for (int i = 0; i < N; i++) {
			tmp[i] = br.readLine();
		}
		
		backtracking(0);
		
		System.out.println(res.size());

	}

	private static void backtracking(int depth) {
		if (depth == K) {
			for (String s : arr)
				sb.append(s);
			
			// 중복 조합이 있는지 확인
			for (String s : res) {
				if (s.equals(sb.toString())) {
					sb.setLength(0);
					return;
				}
			}
			
			// 중복 조합이 없으면 담기
			res.add(sb.toString());
			sb.setLength(0);
			return;
		}
			
		
		for (int i = 0; i < N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				arr[depth] = tmp[i];
				backtracking(depth+1);
				visit[i] = false;
			}
		}
		
	}

}
