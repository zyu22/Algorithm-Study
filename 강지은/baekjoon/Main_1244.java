import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main_1244 {

	static int N; // 스위치 개수
	static int[] onoff; //스위치 배열
	static int M; // 학생 수
	static int[][] students; //학생 배열
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		onoff = new int[N+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			onoff[i] = Integer.parseInt(st.nextToken());
		}
		
		M = Integer.parseInt(br.readLine());
		students = new int[M][2];
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 2; j++) {
				students[i][j] = Integer.parseInt(st.nextToken());
			}
			
			int sex = students[i][0];
			int num = students[i][1];
			
			// 성별이 남학생일 경우
			if (sex == 1) {
				int j = 1;
				// 배수 스위치 온오프
				while (num*j <= N) {
					if (onoff[num*j] == 0)
						onoff[num*j] = 1;
					else
						onoff[num*j] = 0;
					j++;
				}
			} else {
				// 성별이 여학생일 경우
				int cnt = 0;
				while (0 < num-cnt && num+cnt <= N) {
					// 대칭 스위치 온오프
					if (onoff[num-cnt] == onoff[num+cnt]) {
						if (onoff[num-cnt] == 0) {
							onoff[num-cnt] = 1;
							onoff[num+cnt] = 1;
						} else {
							onoff[num-cnt] = 0;
							onoff[num+cnt] = 0;
						}
						cnt++;
					} else
						break;						
				}
			}
		}
		
		// 20개씩 출력
		for (int i = 1; i <= N; i++) {
			System.out.print(onoff[i]+" ");
			if (i%20 == 0)
				System.out.println();
		}
	}

}
