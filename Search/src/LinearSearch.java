import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

	public static int basicLinearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key)
				return i;
		}
		return -1;
	}

	public static int binarySearch(int[] arr, int key) {
		System.out.println("bin srch call");
		int left = 0, right = arr.length - 1, mid;
		while (left <= right) {
			mid = (left + right) / 2;
			System.out.println("19. " + mid);
			if (arr[mid] == key)
				return mid;
//			System.out.println("mid == key");
			if (arr[mid] > key) {
				System.out.println("if: focus left");
//				focus on left side
				right = mid - 1;
			} else {
//				focus on right side
				System.out.println("else: focus right");
				left = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 54, 87, 656, 23, 1, 3, 5 };
//		int[] arr = { 1, 2, 36, 66, 88, 99, 115, 145, 149, 789 };
//		System.out.println("sortedArr " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter a number to search");
		int key = sc.nextInt();

		int index = basicLinearSearch(arr, key);
		if (index != -1)
			System.out.println("Key found at index(Linear): " + index);
		else
			System.out.println("Key not found.....");

		index = binarySearch(arr, key);
		if (index != -1)
			System.out.println("Key found at index(binary): " + index);
		else
			System.out.println("Key not found.....");
	}
}
