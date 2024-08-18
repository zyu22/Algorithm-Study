import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 5주차
public class Main_2564 {

	static int N, M; // 블록 길이
	static int K; // 상점의 개수
	static int[][] arr;
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(br.readLine());
		
		// 동근이까지 담기
		arr = new int[K+1][2];
		
		for (int i = 0; i < K+1; i++) {
			st = new StringTokenizer(br.readLine());
			int store = Integer.parseInt(st.nextToken()); // 가게 번호
			int position = Integer.parseInt(st.nextToken()); // 가게 위치
			
			// 북쪽
			if (store == 1) {
				arr[i][0] = 0;
				arr[i][1] = position;
			}
			// 남쪽
			else if (store == 2) {
				arr[i][0] = M;
				arr[i][1] = position;
			}
			// 서쪽
			else if (store == 3) {
				arr[i][0] = position;
				arr[i][1] = 0;
			}
			// 동쪽
			else {
				arr[i][0] = position;
				arr[i][1] = N;
			}
		}
		
		// 동근이 위치
		int r = arr[K][0];
		int c = arr[K][1];
		
		int cnt = 0;
		for (int i = 0; i < K; i++) {
			// 같은 열일 경우
			if ((r == 0 || r == M) && arr[i][0] == r)
				cnt += Math.abs(arr[i][1]-c);
			// 같은 행일 경우
			else if ((c == 0 || c == N) && arr[i][1] == c)
				cnt += Math.abs(arr[i][0]-r);
			// 그 외
			else {
				int minR = Math.min(arr[i][0]+r, M*2-(arr[i][0]+r));
				int minC = Math.min(arr[i][1]+c, N*2-(arr[i][1]+c));
				cnt += (minR+minC);
			}
		}
		
		System.out.println(cnt);
		
	}
}
