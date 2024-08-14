import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main_13300 {

	static int N, K;
	static int S, Y;
	static int[][] students;
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		students = new int[2][7];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			S = Integer.parseInt(st.nextToken());
			Y = Integer.parseInt(st.nextToken());
			
			// 해당 성별, 학년에 인원 추가
			students[S][Y]++;
		}
		
		int cnt = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 1; j <= 6; j++) {
				// 학생 수에 따라 반 배정
				if (students[i][j] != 0) {
					if (students[i][j] % K == 0)
						cnt += students[i][j]/K;
					else
						cnt += students[i][j]/K+1;
				}
			}
		}
		
		System.out.println(cnt);
		
	}
}
