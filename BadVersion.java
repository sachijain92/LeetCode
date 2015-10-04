/*You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version 
of your product fails the quality check. Since each version is developed based on the previous version, all the versions 
after a bad version are also bad.Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
 which causes all the following ones to be bad.You are given an API bool isBadVersion(version) which will return whether 
version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
*/

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl 
{
   public int firstBadVersion(int n)
   {
	        int low=1;
	        int high=n;
	        
	        
	        if(n==1)
	        {
	            if(isBadVersion(1))
	                return 1;
	            
	            else
	                return 0;
	        }
	        
	        if(n==2)
	        {
	            if(isBadVersion(1))
	                return 1;
	            
	            else 
	                return 2;
	        }
	        
	        
	        while(low<=high)
	        	
	        {   
	            int mid=low+((high-low)/2);
	            if(isBadVersion(mid))
	                {
	                    if(mid==1)
	                        return 1;
	                
	                    if(!isBadVersion(mid-1))
	                         return mid;
	                
	                
	                    high=mid-1;
	                }
	            
	            else
	                low=mid+1;
	        }
	        return 0;
   }
}