// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int sum=0;
//         int arr[]= new int[2];
//        for(int i=0; i<nums.length;i++)
//        {
//           for(int j=i+1;j<nums.length;j++)
//           {
//               sum = nums[i]+nums[j];
//               if(sum==target){
//                   arr[0]=i;
//                   arr[1]=j;
//               }
//           }
//        }
//        return arr;
//     }
// }

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        // Build the hash table
        for (int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
        }

        // Find the complement
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[]{i, numMap.get(complement)};
            }
        }

        return new int[]{}; // No solution found
    }
}
