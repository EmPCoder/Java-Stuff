public class EvenOdd {

	public static void main(final String[] args) {

		final int[] nums = { 1, 2, 3, 4, 5 }; // declares array of integer named nums

		for (int i = 0; i <= nums.length; i++) { // for loop to traverse array

			if (i % 2 == 0) { // takes the current number in the for loop and %2 to determine if odd or even
				System.out.println(i + " => Even");
			} else {
				System.out.println(i + " => Odd");
			}
		}
	}

}
