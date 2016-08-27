import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.StringTokenizer;

public class MaxPairwiseProduct {
	static long getMaxPairwiseProduct(long[] numbers) {
		long result = 0;
		int n = numbers.length;
		for (int i = 0; i < n; ++i) {
			for (int j = i + 1; j < n; ++j) {
				if (numbers[i] * numbers[j] > result) {
					result = numbers[i] * numbers[j];
				}
			}
		}
		return result;
	}

	static long getMaxPairwiseProductFast(long[] numbers) {

		int n = numbers.length;
		int max_index1 = -1;

		for (int i = 0; i < n; ++i) {
			if ((max_index1 == -1) || (numbers[i] > numbers[max_index1])) {
				max_index1 = i;
			}
		}

		int max_index2 = -1;

		for (int j = 0; j < n; ++j) {
			// if ((numbers[j] != numbers[max_index1]) && ((max_index2 == -1) ||
			// (numbers[j] > numbers[max_index2]))) {
			if ((j != max_index1) && ((max_index2 == -1) || (numbers[j] > numbers[max_index2]))) {
				max_index2 = j;
			}
		}

		return numbers[max_index1] * numbers[max_index2];
	}

	public static void main(String[] args) {
		Random randomGenerator = new Random();

		while (true) {

			int randomInt = randomGenerator.nextInt(1000 - 2) + 2;

			System.out.println(randomInt);

			long[] a = new long[randomInt];
			for (int i = 0; i < randomInt; ++i) {
				a[i] = randomGenerator.nextInt(99999);
			}

			for (int i = 0; i < randomInt; ++i) {
				System.out.print(a[i] + " ");
			}

			System.out.println();

			long res1 = MaxPairwiseProduct.getMaxPairwiseProduct(a);
			long res2 = MaxPairwiseProduct.getMaxPairwiseProductFast(a);

			if (res1 != res2) {
				System.out.println("Wrong Answer: " + res1 + " " + res2);
			} else {
				System.out.println("OK");
			}
		}

		/*
		 * 
		 * FastScanner scanner = new FastScanner(System.in); long n =
		 * scanner.nextLong(); long[] numbers = new long[(int) n]; for (int i =
		 * 0; i < n; i++) { numbers[i] = scanner.nextLong(); }
		 * System.out.println(getMaxPairwiseProductFast(numbers));
		 */
	}

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

}