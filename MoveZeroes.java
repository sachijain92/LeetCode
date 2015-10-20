/*Given an array nums, write a function to move all 0's to the end of it while maintaining the relative 
order of the non-zero elements.
For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].*/



public class Solution 
{
    public void moveZeroes(int[] nums)
    {
        if(nums.length==0)		//if length of array is 0 return
            return;
        int i=0,j=1;
        while(j<nums.length)
         {
         	if(nums[i]==0)	//when we find 0 at a particular index search for an index with non-zero element 
                 {
                 	if(nums[j]!=0)
                        {
                         	nums[i]=nums[j];	//swap them and increase the pointers
                         	nums[j]=0;
                         	i++;
                         	j++;
                         }
                            
                         else 	
                         	j++;
                 }
                else	
                 {
                  	i++;
                        j++;
                 }
                
          }
    }
}
