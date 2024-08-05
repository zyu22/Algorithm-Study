import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_21921 {

	static int N;
	static int X;
	static int[] arr;
	static int max;
	static int sum = 0;
	static int cnt = 1;
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		X = Integer.parseInt(st.nextToken());
		arr = new int[N];
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st2.nextToken());
		}
		
		for (int i = 0; i < X; i++) {
			sum += arr[i];
		}
		
		max = sum;
		
		for (int i = 1; i <= N-X; i++) {
			sum = sw(arr, i, sum);
			if (max < sum) {
				max = sum;
				cnt = 1;
			}
			else if (max == sum)
				cnt++;
		}
		
		if (max == 0)
			System.out.println("SAD");
		else
			System.out.printf("%d\n%d\n", max, cnt);

	}

	private static int sw(int[] arr, int i, int sum) {
		return sum - arr[i-1] + arr[i+X-1];
	}

}
