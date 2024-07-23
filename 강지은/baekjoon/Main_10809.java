import java.util.Arrays;
import java.util.Scanner;

public class Main_10809 {

	public static void main(String[] args) {
        char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 
                       'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int[] idx = new int[26];
        Arrays.fill(idx, -1); // 배열 -1로 초기화
        
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] arr = S.toCharArray(); // 입력문자를 배열로 변환
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < 26; j++) {
                if(arr[i] == alpha[j] && idx[j] == -1) {
                	idx[j] = i;
                }
            }
        }
        
        for(int num : idx) {
        	System.out.printf("%d ", num);
        }
    }

}
