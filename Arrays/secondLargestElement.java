class Solution {
    public static int secondLargestElement(int[] nums) {
        int n = nums.length;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        
        if(n<2)
        {  
            System.out.println("Please insert atleast 2 element in an array");
            
        }
        
        for(int i=0; i< n; i++)
        {
            if(nums[i] > max1)
            {
                max2 = max1;
                max1 = nums[i];
            }
            else if(nums[i] > max2 && nums[i]!=max1)
            {
                max2= nums[i];
            }
            
        }
        
        if(max2 == Integer.MIN_VALUE)
        {
            return -1;
        }
        return max2;
    
    }
}