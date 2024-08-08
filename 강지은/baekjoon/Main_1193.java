import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main_1193 {

	static int N;
	static int num = 1;
	static int cnt = 0;
	
	static int nr;
	static int nc;
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		while (cnt != N) {
			// 짝수 순회일 때
			if (num%2 == 0) {
				int r = num;
				for (nr = r-1; nr > 0; nr--) {
					nc = num-nr;
					cnt++;
					if (cnt == N)
						break;
				}
			}
			// 홀수 순회일 때
			else {
				int c = num;
				for (nc = c-1; nc > 0; nc--) {
					nr = num-nc;
					cnt++;
					if (cnt == N)
						break;
				}
			}
			num++;
		}

		System.out.printf("%d/%d", nr, nc);
		
	}

}
