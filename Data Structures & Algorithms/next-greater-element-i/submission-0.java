class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int size = nums1.length;

        int[] res = new int[size];
        Stack <Integer> s = new Stack<>();
        HashMap <Integer,Integer> map = new HashMap<>();

        for(int num : nums2){
            while(!s.isEmpty() && s.peek() < num){
                map.put(s.pop(),num);
            }

            s.push(num);
        }

        for(int i = 0; i<nums1.length; i++){
            res[i] = map.getOrDefault(nums1[i],-1);
        }
        return res;
    }
}