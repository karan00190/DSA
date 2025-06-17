class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
         int n = nums.length;
        int currCount =0;
        int maxCount =0;

        for(int i =0; i<n; i++)
        {
            if(nums[i]==1)
            {
                currCount++;
                maxCount = currCount;
            }
            else if(nums[i]==0)
            {
                currCount =0;
            }

        }
        return maxCount;

        
    }
    public static void main(String[] args)
    {
        int arr[] = {1,0,0,1,1,1,1,1,1,0,0,0};
        System.out.println(findMaxConsecutiveOnes(arr));
        
    }
}