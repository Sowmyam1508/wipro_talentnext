package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class PrimeSuplier {
	public static void main(String[] args) {
		Supplier<List<Integer>> primeSupplier = () -> {
			List<Integer> primes = new ArrayList<>();
			int num = 2;

			while (primes.size() < 10) {
				if (isPrime(num)) {
					primes.add(num);
				}
				num++;
			}
			return primes;
		};
		List<Integer> primeList = primeSupplier.get();
		System.out.println("First 10 prime numbers:");
		primeList.forEach(System.out::println);
	}

	private static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}