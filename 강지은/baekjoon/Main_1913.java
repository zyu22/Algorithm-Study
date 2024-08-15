import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1913 {

	static int N;
	static int X;
	static int[][] map;
	
	static int[] dr = {1, 0, -1, 0};
	static int[] dc = {0, 1, 0, -1};
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		X = Integer.parseInt(br.readLine());
		
		map = new int[N][N];
		
		int nr = 0;
		int nc = 0;
		int d = 0; // 방향
		
		int cnt = N*N;
		map[nr][nc] = cnt--;
		
		// X가 위치한 좌표 저장
		int xr = 1;
		int xc = 1;
		
		while (cnt > 0) {
			if (!(0 <= nr+dr[d] && nr+dr[d] < N && 0 <= nc+dc[d] && nc+dc[d] < N) || map[nr+dr[d]][nc+dc[d]] != 0)
				d += 1;
			
			if (d == 4)
				d = 0;
			
			nr += dr[d];
			nc += dc[d];
			
			if (cnt == X) {
				xr = nr+1;
				xc = nc+1;
			}
			
			map[nr][nc] = cnt--;
		}
		
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < N; c++) {
				sb.append(map[r][c]+" ");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		System.out.println(xr + " " + xc);
		
	}

}
