class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        
            int i,total=0,leftsum=0,n=nums.length,ls,rs;
            int[] result =new int[nums.length];
            for(i=0;i<n;i++)
            total=total+nums[i];
            for(i=0;i<n;i++)
            {
                ls=nums[i]*i-leftsum;
                rs =(total-leftsum-nums[i]-(n-i-1)*nums[i]);
                result[i]=ls+rs;
                leftsum=leftsum+nums[i];
            }
            return result;
        }
    
}
