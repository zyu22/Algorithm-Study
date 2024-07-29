import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main_2992 {

	private static int X;
	private static int N;
	
	private static int[] tmp;
	private static int[] arr;
	private static boolean[] visit;
	
	private static List<Integer> res = new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		sb.append(br.readLine());
		
		X = Integer.parseInt(sb.toString());
		N = sb.length();
		
		tmp = new int[N];
		arr = new int[N];
		visit = new boolean[N];
		
		for (int i = 0; i < N; i++) {
			tmp[i] = Integer.parseInt(String.valueOf(sb.charAt(i)));
		}
		
		backtracking(0);
		
		if (res.size() == 0) {
			System.out.println(0);
		} else {
			// res 정렬
			Collections.sort(res);
			System.out.println(res.get(0));
		}

	}

	private static void backtracking(int depth) {
		if (depth == N) {
			int num = 0;
			for (int i = 0; i < N; i++) {
				num += arr[i]*Math.pow(10, N-1-i);
			}
			
			// X보다 큰 값이면 담기
			if (X < num)
				res.add(num);
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
