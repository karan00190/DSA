public class SingleNumber {
  

    //Given an array of nums of n integers. Every integer in the array appears twice except one integer. Find the number that appeared once in the array.


    // Examples:
    // Input : nums = [1, 2, 2, 4, 3, 1, 4]

    // Output : 3

    public int singleNumber(int[] nums) {
        //your code goes here
        int n = nums.length;
        int result =0;
        
        for(int i =0; i<n; i++)
        {
            result =result ^ nums[i];
            
        }
        return result;
    
}
    
}
