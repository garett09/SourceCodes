
public class Sort {
	void insertionSort(int[] list) {
		int i, j, key, temp; // it starts at index 1 because the very first element is sorted since it does
								// not need to compare
		for (i = 1; i < list.length; i++) {
			key = list[i];
			j = i - 1;
			while (j >= 0 && key < list[j]) {
				temp = list[j];
				list[j] = list[j + 1];
				list[j + 1] = temp;
				j--;
			}
		}
	}

	void selectionSort(int[] list) {
		int i, j, minValue, minIndex, temp = 0;
		for (i = 0; i < list.length; i++) {
			minValue = list[i];
			minIndex = i;
			for (j = i; j < list.length; j++) {
				if (list[j] < minValue) {
					minValue = list[j];
					minIndex = j;
				}
			}
			if (minValue < list[i]) {
				temp = list[i];
				list[i] = list[minIndex];
				list[minIndex] = temp;
			}

		}

	}

	// Breaks down the array to single or null elements in array.
	public static int[] mergeSort(int[] array) {

		// Recursive control 'if' statement.
		if (array.length <= 1) {

			return array;

		}

		int midpoint = array.length / 2;

		// Declare and initialize left and right arrays.
		int[] left = new int[midpoint];
		int[] right;

		if (array.length % 2 == 0) { // if array.length is an even number.

			right = new int[midpoint];

		} else {

			right = new int[midpoint + 1];

		}

		// Populate the left and right arrays.
		for (int i = 0; i < midpoint; i++) {

			left[i] = array[i];

		}

		for (int j = 0; j < right.length; j++) {

			right[j] = array[midpoint + j];

		}

		int[] result = new int[array.length];

		// Recursive call for left and right arrays.
		left = mergeSort(left);
		right = mergeSort(right);

		// Get the merged left and right arrays.
		result = merge(left, right);

		// Return the sorted merged array.
		return result;

	}

	// Merges the left and right array in ascending order.
	private static int[] merge(int[] left, int[] right) {

		// Merged result array.
		int[] result = new int[left.length + right.length];

		// Declare and initialize pointers for all arrays.
		int leftPointer, rightPointer, resultPointer;
		leftPointer = rightPointer = resultPointer = 0;

		// While there are items in either array...
		while (leftPointer < left.length || rightPointer < right.length) {

			// If there are items in BOTH arrays...
			if (leftPointer < left.length && rightPointer < right.length) {

				// If left item is less than right item...
				if (left[leftPointer] < right[rightPointer]) {

					result[resultPointer++] = left[leftPointer++];

				} else {

					result[resultPointer++] = right[rightPointer++];

				}

			}

			// If there are only items in the left array...
			else if (leftPointer < left.length) {

				result[resultPointer++] = left[leftPointer++];

			}

			// If there are only items in the right array...
			else if (rightPointer < right.length) {

				result[resultPointer++] = right[rightPointer++];

			}

		}

		return result;

	}

	/* A utility function to print array of size n */
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

}
