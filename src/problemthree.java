public class problemthree {
    class Solution {
        public int removeElement(int[] nums, int val) {
            int i = 0;
            int j = 0;
            for (j = 0; j < nums.length; j++) {
                if (nums[j] != val) {
                    nums[i] = nums[j];
                    i++;
                }
            }
            return i;
        }
    }
}
// time coplexity is O(n)