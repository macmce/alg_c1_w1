import java.util.Random;

public class StressTest {

	public static void main(String[] args) {
		Random randomGenerator = new Random();

		while(true){
			int randomInt = randomGenerator.nextInt(11 - 2) + 2;
			System.out.println(randomInt);

			long[] a = new long[randomInt];
			for (int i=0; i < randomInt; ++i) {
				a[i] = randomGenerator.nextInt(99999);
						

			}
			for (int i=0; i < randomInt; ++i) {
				System.out.print(a[i] + " ");
			}
			System.out.println();

			long res1 = MaxPairwiseProduct.getMaxPairwiseProduct(a);
			long res2 = MaxPairwiseProductFast.getMaxPairwiseProduct(a);

			if (res1 != res2) {
				System.out.println("Wrong Answer: " + res1 + " " + res2);				
			} else{
				System.out.println("OK");				
			}


		}
	}

}