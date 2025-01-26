//01/21/2024
//Christopher Garcia
//Introduction to Algorithms
public class problemFive {
    class Solution {
        public int removeElement(int[] nums, int val) {
            int i = 0; //Constant 0(1)
            int j = 0; //Constant 0(1)
            for (j = 0; j < nums.length; j++) { //0(N)
                if (nums[j] != val) { //Constant 0(1)
                    nums[i] = nums[j];//Constant 0(1)
                    i++; //Constant 0(1)
                }
            }
            return i;//Constant 0(1)
        }
    }
}
// time coplexity is O(n)