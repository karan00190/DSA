class Solution {
    public static int LargestElement(int[] nums)
    {
        int n = nums.length;
        int max = nums[0];
        for(int i =0; i<n; i++)
        {
            if(nums[i]>max)
            {
                max = nums[i];
            }
            
        }
        return max;
    
    }
    
}