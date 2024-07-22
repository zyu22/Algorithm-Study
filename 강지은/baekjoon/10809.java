import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10809 {
	
	static int size = 2;
	static int[] arr = new int[100];
	static int sum;
	static int cnt;
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        
        if(Integer.parseInt(s) < 10) {
        	arr[0] = 0;
        	arr[1] = Integer.parseInt(s);
        } else {
        	arr[0] = Integer.parseInt(s)/10;
        	arr[1] = Integer.parseInt(s)%10;
        }
        
        do {
        	sum = arr[size-2] + arr[size-1];
        	
        	if(sum >= 10) {
        		arr[size++] = sum%10;
        	} else {
        		arr[size++] = sum;
        	}
        	
        	cnt++;
        	
        } while (arr[0] != arr[size-2] || arr[1] != arr[size-1]);
        
        System.out.println(cnt);
    }

}
