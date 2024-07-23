import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10811 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		
		for (int a = 0; a < N; a++) {
			arr[a] = a+1;
		}
		
		for (int b = 0; b < M; b++) {
			st = new StringTokenizer(br.readLine(), " ");
			int i = Integer.parseInt(st.nextToken()) - 1;
			int j = Integer.parseInt(st.nextToken()) - 1;
			
			while(i < j) {
				int temp = arr[i];
				arr[i++] = arr[j];
				arr[j--] = temp;
			}
			
		}
		
		for (int c = 0; c < N; c++) {
			System.out.print(arr[c]+" ");
		}
	}

}
// 21345	12435	34215 1234 -> 4321 i~j-1까
