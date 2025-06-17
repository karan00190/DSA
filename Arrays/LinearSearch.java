public class LinearSearch {
    
    public int linearSearch(int nums[], int target) {
        int n = nums.length;
        int i ;
        for(i =0; i < n; i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
        }

        return -1;

		
    }

    
}
