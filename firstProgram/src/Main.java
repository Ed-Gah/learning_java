public class Main {
    public static void main (String[] args) {
        int nums[] = {5,16,2,3,111,18,4};
        int size = nums.length;
        int temp = 0;
        // for selection sort
        int minIndex = -1;

        // array before sorting
        System.out.println("Before sorting");
        for(int num : nums) {
            System.out.print(num + " ");
        }

       // Bubble sorting algorithm
//        for(int i=0; i<size;i++) {
//            for(int j=0;j<size-i-1; j++) {
//          // size-i-1 saves times by not checking the same sorting value again and again.
//                if (nums[j] > nums[j + 1]) {
//                    // swapping
//                    temp = nums[j];
//                    nums[j] = nums[j + 1];
//                    nums[j+1] = temp;
//                }
//            }
//            System.out.println();
//            for(int num : nums) {
//                System.out.print(num + " ");
//            }
//        }
        // end of bubble sort.

        // selection sort
//        for (int i=0; i<size-1; i++) {
//            minIndex = i;
//            for (int j=i+1; j<size; j++) {
//                if (nums[minIndex] > nums[j]) {
//                    minIndex = j;
//                }
//            }
//            temp = nums[minIndex];
//            nums[minIndex] = nums[i];
//            nums[i] = temp;
//
//            System.out.println();
//            for (int num: nums) {
//                System.out.print(num + " ");
//            }
//        }
        // end of selection sort.

        // Inserting sorting.
//        for (int i=1;i<size;i++) {
//           int key = nums[i];
//           int j = i-1;
//           while (j>=0 && nums[j] > key) {
//               nums[j+1] = nums[j];
//               j--;
//           }
//           nums[j+1] = key;
//        }
        // end of insertion sort

        // Quick sort
        quickSort(nums, 0, size-1);

        // after sorting]
        System.out.println();
        System.out.println("After sorting");
        for(int num : nums) {
            System.out.print(num + " ");
        }


//        int target = 9;
//        int result = linearSearch( nums, target);
//        int result1 = binarySearch(nums, target, 0, nums.length-1);
//
//
//        if (result != -1)
//        System.out.println("Element found at index: " + result);
//        else System.out.println("Element not found");

    }

    // quick sort method
    private static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int pi = partion(nums, low, high); // the pivot point
            quickSort(nums, low,pi-1 );
            quickSort(nums,pi+1,high);
        }
    }

    private static  int partion(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low - 1;
        for (int j=low; j<high;j++) {
            if (nums[j] < pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[i+1];
        nums[i + 1] = nums[high];
        nums[high] = temp;
        return i + 1;
    }

    // Linear searching method
    public static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for (int i = 0; i< nums.length; i++) {
            steps ++;
            if (nums[i] == target) {
                System.out.println("Steps taken by linear search: " + steps);
                return i;
            };
        }
        System.out.println("Steps taken by linear search: " + steps);
        return -1;
    }
    // end of linear searhe.


    // Binary searching method
    public static int binarySearch(int[] nums, int target, int left, int right) {
        //5,7,9,11,13
        int steps = 0;
//        recursive binary search
        if (left <=right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target)
               return mid;
           else if (nums[mid] < target)
               return binarySearch(nums, target, mid + 1, right);
            else return binarySearch(nums, target, left, mid - 1);
        }

//        Normal binary search
//       int left = 0;
//       int right = nums.length - 1;
//       while (left <= right) {
//           steps ++;
//           int mid = (left + right) / 2;
//           if (nums[mid] == target) {
//               System.out.println("Steps taken by binary search: " + steps);
//               return mid;
//           }else if (nums[mid] < target) {
//               left = mid + 1;
//           } else right = mid - 1;
//
//       }
    // end of binary search.

        System.out.println("Steps taken by binary search: " + steps);
        return -1;
    }
}

