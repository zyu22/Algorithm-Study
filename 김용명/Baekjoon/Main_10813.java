package java0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10813 {

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
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int k = arr[i-1];
			
			arr[i-1]=arr[j-1];
			arr[j-1]= k;
				
			}
		
		for (int c = 0; c < N; c++) {
			System.out.print(arr[c]+" ");
		}
	}

}
