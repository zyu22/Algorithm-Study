import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main_2563 {

	static int N;
	static int[][] map;
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		map = new int[100][100];
		
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int nr = Integer.parseInt(st.nextToken());
			int nc = Integer.parseInt(st.nextToken());
			
			// 색종이 넓이 구하기
			for (int r = nr; r < nr+10; r++) {
				for (int c = nc; c < nc+10; c++) {
					if (map[r][c] == 0) {
						sum++;
						map[r][c]++;
					}						
				}
			}
		}
		
		System.out.println(sum);
		
	}
}
