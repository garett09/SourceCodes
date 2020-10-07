
public class Test {

	public static void main(String[] args) {
		int[] nums = { 6, 34, 5, 2, 4, 7, 4, 3 };
//		//int[] nums2 = { 457, 2345, 123, 4578569, 5463 };
//		//int[] nums3 = { 165, 164, 984, 651, 51, 1, 6, 51, 615, 231, 321, 81, 891, 3, 21, 321, 81, 5, 1, 651, 65, 476,
//				5798, 789, 7, 897, 894, 7897, 9789, 7645, 154, 646532, 556231, 545643214, 831223, 181874, 1231231,
//				121212, 268598, 636363636, 696969696 };
//		//int[] nums4 = { 3345, 234174078, 4561345, 213123 };
//		//int key = 34;
		// System.out.println(key+" is found at index: "+ Search.linearSearch(nums,
		// key));

		Sort sorting = new Sort();
		Search searching = new Search();
////		sorting.insertionSort(nums);
////		sorting.sorting(nums2, 0, nums2.length - 1);
//		System.out.println("Initial merge sort Array: ");
//		sorting.printArray(nums3);
//
//		// Sorted and merged array with print out.
//		nums3 = sorting.mergeSort(nums3);
//		System.out.println("Sorted Array: ");
//		sorting.printArray(nums3);
//
//		// sorting.printArray(nums2);
//		
//		int n = nums4.length; 
//		  
//        sorting.sort(nums4, 0, n-1); 
//  
//        System.out.println("sorted array"); 
//        sorting.printArray(nums4); 

		int n = nums.length;
		int keys = 3;
		int result = searching.binarySearch(nums, keys);
			System.out.println("Element found at " + "index " + result);
	}

}

