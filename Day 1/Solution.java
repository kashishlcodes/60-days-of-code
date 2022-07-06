class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length=nums.length;

        int[] result=new int[2];

        if(length==0 || length==1)
            return result;


        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<length;i++){
            if(map.containsKey(target-nums[i])){
                result[0]=map.get(target-nums[i]);
                result[1]=i;
                break;
            }else{
                map.put(nums[i],i);
            }
        }

        return result;

    }
}
