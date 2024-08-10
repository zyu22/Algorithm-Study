import java.util.Scanner;

public class Main_14916 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if (N%5 == 0)
			System.out.println(N/5);		
		else if ((N%5)%2 == 0)
			System.out.println(N/5 + (N%5)/2);
		else {
			if (N > 5)
				System.out.println(N/5-1 + (N%5+5)/2);
			else
				System.out.println(-1);
		}

		sc.close();
		
	}

}
