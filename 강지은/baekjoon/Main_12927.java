import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main_12927 {

	static char[] arr;
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		arr = br.readLine().toCharArray();
		
		int size = arr.length;
		int cnt = 0;
		
		for (int i = 0; i < size; i++) {
			if (arr[i] == 'Y') {
				for (int j = i; j < size; j++) {
					if ((j+1)%(i+1)==0) {
						if (arr[j] == 'Y')
							arr[j] = 'N';
						else
							arr[j] = 'Y';
					}
				}
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}

}
