class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0, max=0;
        int len=s.length();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<len;i++){
            if(map.get(s.charAt(i))!=null){
                start=Math.max(start,map.get(s.charAt(i))+1);
            }

            max=Math.max(max,i-start+1);
            map.put(s.charAt(i),i);
        }

        return max;
    }
}
