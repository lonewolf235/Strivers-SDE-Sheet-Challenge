import java.util.Arrays;

public class majority1 {

  public int majorityElement(int[] nums) {
    Arrays.sort(nums);
    return nums[nums.length / 2];
  }

//Found this one in leetcode discuss after solving good one for future
// public int majorityElement(int[] nums) {
//         int count = 0, maxElement = 0;
// 				for(int num: nums) {
// 					if(count == 0) {
// 						maxElement = num;
// 					}
// 					if(num == maxElement) {
// 						count++;
// 					} else {
// 						count--;
// 					}
// 				}

// 				return maxElement;
//     }

}
