package generic;

public class MaximumTest {
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}
	
	public static void main(String[] args) {
		System.out.printf("%d, %d, %d max %d\n\n", 3, 4, 5, maximum(3, 4, 5));
		System.out.printf("%.1f, %.1f, %.1f max %.1f\n\n", 3.3, 4.4, 5.5, maximum(3.3, 4.4, 5.5));
		System.out.printf("%s, %s, %s max %s\n\n", "apple", "orange", "pear", maximum("pear", "apple", "orange"));
	}
}
