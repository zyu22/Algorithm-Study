import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main_2596 {
	
	static String[] secret = {"000000", "001111", "010011", "011100", "100110", "101001", "110101", "111010"};	
	static String[] letter = {"A", "B", "C", "D", "E", "F", "G", "H"};
	static int N;
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		String s = br.readLine();
		
		// 문자열 비교 시작
		for (int i = 0; i < N; i++) {
			
			boolean find = false;
			for (int j = 0; j < secret.length; j++) {
				
				int cnt = 0;
				// 문자열과 암호 1대1 비교
				for (int k = 0; k < 6; k++) {
					if (s.charAt(k) != secret[j].charAt(k)) {
						cnt++;
						if (cnt > 1)
							break;
					}
				}
				// 1개 이하 틀릴 경우 암호 해독
				if (cnt < 2) {
					sb.append(letter[j]);
					find = true;
					break;
				}
			}
			// 암호 해독 실패
			if (!find) {
				sb.setLength(0);
				sb.append(i+1);
				break;
			} else
				s = s.substring(6); // 암호 해독 성공 시 그다음 문자열 6개 비교
			
		}
		
		System.out.println(sb.toString());
		
	}

}
