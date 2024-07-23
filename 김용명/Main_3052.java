import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_3052 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		int num = 0;
		int a = 0;
				
		for (int i = 0; i < 10; i++) {
			int A = Integer.parseInt(br.readLine());
			arr[i] = A%42;
		}
		for (int i = 0; i < 10; i++) {
			for (int j = i; j < 9; j++) {
				if(arr[i] == arr[j+1]) {
					arr[j+1] = 50;
				}
			}
			
		}
		for (int i = 0; i < 10; i++) {
			if(arr[i] != 50) {
				num ++;
			}
			
		}
		System.out.println(num);
	}

}
