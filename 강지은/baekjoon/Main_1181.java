import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main_1181 {

	static int N;
	static Set<String> set;
	static List<String> arr;
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		set = new HashSet<>();
		arr = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			set.add(br.readLine());
		}
		
		arr.addAll(set);
		
		Collections.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String A, String B) {
				if (A.length() > B.length())
					return 1;
				else if (A.length() < B.length()) 
					return -1;
				else
					return A.compareTo(B);
			}
		});
		
		for (String string : arr) {
			System.out.println(string);
		}
		
	}
	
}
