package Stack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;


public class NearestRightGreater {
    
    public static void NGR(int nums[])
    {
        int n= nums.length;
        
        ArrayList<Integer> key = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        
        for(int i =n-1; i >=0; i--)
        {
            
            if(s.isEmpty())
            {
                key.add(-1);
            }
            else if(!s.isEmpty() && s.peek() > nums[i])
            {
                key.add(s.peek());
            }
            
            else if(!s.isEmpty() && s.peek() <= nums[i])
            {
                while(!s.isEmpty() && s.peek() <= nums[i])
                {
                    s.pop();
                }
                if(s.isEmpty())
                {
                    key.add(-1);
                }
                else{
                    key.add(s.peek());
                }
            }
            
            
            s.push(nums[i]);
        }
        
        Collections.reverse(key);
        
        
        System.out.print(key);
       
        
    }
    public static void main(String[] args) {
        int arr[] ={1,3,2,4};
        NGR(arr);
        
        
        
    }
}