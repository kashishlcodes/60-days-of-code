class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums==null || nums.length < 3 )
            return ans;
        Arrays.sort(nums);
        int len=nums.length;
        int j,k;
        for(int i=0;i<len-2;i++){
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            
            j=i+1;
            k=len-1;
            
            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                    List<Integer> temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }

                    while(j<k && nums[k]==nums[k+1]){
                        k--;
                    }
                }else if(nums[i] + nums[j] + nums[k]<0){
                    j++;
                }else if(nums[i] + nums[j] + nums[k]>0){
                    k--;
                }
            }
            
            
        }
        
        return ans;
    }
}
