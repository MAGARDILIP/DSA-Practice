class RotatedArrSearch {

    // search method (handles duplicates)
    public static boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // target found
            if (nums[mid] == target) {
                return true;
            }

            // duplicates block decision
            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left++;
                right--;
            }
            // left half is sorted
            else if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // right half is sorted
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }

    // main method with test cases
    public static void main(String[] args) {

        int[] nums1 = {2,5,6,0,0,1,2};
        int target1 = 0;
        System.out.println(search(nums1, target1)); // true

        int[] nums2 = {2,5,6,0,0,1,2};
        int target2 = 3;
        System.out.println(search(nums2, target2)); // false

        int[] nums3 = {1,1,1,1,1};
        int target3 = 1;
        System.out.println(search(nums3, target3)); // true

        int[] nums4 = {1};
        int target4 = 0;
        System.out.println(search(nums4, target4)); // false

        int[] nums5 = {3,1,1,1,2};
        int target5 = 3;
        System.out.println(search(nums5, target5)); // true
    }
}


