import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1417 {
	
	static int N;
	static int[] arr;
	static int cnt = 0;

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int max = arr[0];
		int maxIdx = 0;
		
		for (int i = 1; i < N; i++) {
			if (max <= arr[i]) {
				max = arr[i];
				maxIdx = i;
			}
		}
		
		while (maxIdx != 0) {
			arr[0]++;
			arr[maxIdx]--;
			
			cnt++;
			
			max = arr[0];
			maxIdx = 0;
			for (int i = 1; i < N; i++) {
				if (max <= arr[i]) {
					max = arr[i];
					maxIdx = i;
				}
			}
		}
		
		System.out.println(cnt);
		
	}
	
}
