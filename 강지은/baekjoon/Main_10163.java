import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 5주차
public class Main_10163 {

	static int N;
	static int[][] map;
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		map = new int[1002][1002];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int width = Integer.parseInt(st.nextToken());
			int height = Integer.parseInt(st.nextToken());
			
			// 해당하는 넓이에 색종이 번호 넣기
			for (int r = 1001-x; r > 1001-x-width; r--) {
				for (int c = y; c < y+height; c++) {
					map[r][c] = i+1;
				}
			}
		}
		
		// 색종이 번호 카운트
		for (int i = 1; i <= N; i++) {
			int cnt = 0;
			for (int r = 0; r < 1002; r++) {
				for (int c = 0; c < 1002; c++) {
					if (map[r][c] == i)
						cnt++;
				}
			}
			System.out.println(cnt);
		}
		
	}
}
