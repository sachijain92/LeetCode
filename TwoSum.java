/*
Given an array of integers, find two numbers such that they add up to a specific target number.
The function twoSum should return indices of the two numbers such that they add up to the target,
 where index1 must be less than index2. Please note that your returned answers (both index1 and index2)
 are not zero-based.You may assume that each input would have exactly one solution.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2

*/


public class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
    int Sol[]=new int[2];
    HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
            {   
                
                 if(hm.containsKey(nums[i]))
                     {
                         int x=hm.get(nums[i]);
                         hm.put(nums[i],(x+1));
                     }
                 else
                     hm.put(nums[i],1);
            }
            
        for(int i=0;i<nums.length;i++)
            {  
                int k=hm.get(nums[i]);
                k--;
                hm.put(nums[i],k);
                int temp= target-nums[i];
                int index=0;
                if(hm.containsKey(temp) && hm.get(temp)!=0)
                    {
                        int temp2=hm.get(temp);
                        temp2=temp2--;
                        if(temp2==0)
                          {
                            hm.remove(temp);
                          }
                        else
                             hm.put(temp,temp2);
                        
                        
                        if(nums[i]==temp)
                            {
                                
                            for(int j=0;j<nums.length;j++)
                             {   
                                 int count=0;
                                 if(nums[j]==temp)
                                  {    
                                     index=j;
                                     count++;
                                     if(count==2)
                                         break;
                                  }
                              }
                             }
                        
                        else 
                        {
                             for(int j=0;j<nums.length;j++)
                             {
                            
                                if(nums[j]==temp)
                                { 
                                     index=j;
                                     break;
                                 }
                             }
                        }
                        
                        if(index<i)
                        {
                            Sol[0]=index+1;
                            Sol[1]=i+1;
                            return Sol;
                        }
                        
                        else
                        {
                            Sol[1]=index+1;
                            Sol[0]=i+1;
                            return Sol;
                        }
                    }
            
                }
                
       
            
    return Sol;
        
    }
}