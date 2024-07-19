import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2309 {
	
	static int sum;
	static int tmp; 
	static int[] arr = new int[9];

	public static void main(String[] args) throws Exception {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 for (int i = 0; i < 9; i++) {
			 int n = Integer.parseInt(br.readLine());
			 arr[i] = n;
			 sum += n;
		 }
		 
		 // 가짜 난쟁이 삭제
		 int res = sum - 100;
		 
		 out: for (int i = 8; i >= 0; i--) {
			for (int j = i-1; j >= 0; j--) {
				if(arr[i] + arr[j] == res) {
					arr[i] = arr[8];
					arr[j] = arr[7];
					break out;
				}
			}
		}
		                   
		 // 정렬
		 for (int i = 0; i < 7; i++) {
			for (int j = i+1; j < 7; j++) {
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		 
		 for (int i = 0; i < 7; i++) {
			System.out.println(arr[i]);
		}
	}

}
