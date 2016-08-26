import java.util.Random;
import java.util.*;
import java.io.*;

public class StressTest {

	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		FastScanner(InputStream stream) {
			try {
				br = new BufferedReader(new InputStreamReader(stream));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}

	public static void main(String[] args) {
		Random randomGenerator = new Random();

		/*
		 * while(true){
		 * 
		 * int randomInt = randomGenerator.nextInt(1000 - 2) + 2;
		 * 
		 * System.out.println(randomInt);
		 * 
		 * long[] a = new long[randomInt]; for (int i=0; i < randomInt; ++i) {
		 * a[i] = randomGenerator.nextInt(99999); }
		 * 
		 * for (int i=0; i < randomInt; ++i) { System.out.print(a[i] + " "); }
		 * 
		 * System.out.println();
		 * 
		 * long res1 = MaxPairwiseProduct.getMaxPairwiseProduct(a); long res2 =
		 * MaxPairwiseProductFast.getMaxPairwiseProduct(a);
		 * 
		 * if (res1 != res2) { System.out.println("Wrong Answer: " + res1 + " "
		 * + res2); } else{ System.out.println("OK"); } }
		 */

		FastScanner scanner = new FastScanner(System.in);
		long n = scanner.nextLong();
		long[] numbers = new long[(int) n];
		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextLong();
		}
		System.out.println(MaxPairwiseProductFast.getMaxPairwiseProduct(numbers));

	}
}