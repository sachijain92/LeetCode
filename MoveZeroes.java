/*Given an array nums, write a function to move all 0's to the end of it while maintaining the relative 
order of the non-zero elements.
For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].*/



public class Solution 
{
    public void moveZeroes(int[] nums)
    {
        if(nums.length==0)
            return;
   
        for(int i=0;i<nums.length;i++)
            {
                
             for(int j=i+1;j<nums.length;j++)   
                {
                    if(nums[i]==0)
                    {
                        if(nums[j]!=0)
                            {
                                nums[i]=nums[j];
                                nums[j]=0;
                                break;
                            }
                    }
                    else
                       break;
                }
            }
    }
}