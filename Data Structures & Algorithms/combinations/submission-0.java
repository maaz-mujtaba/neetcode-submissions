class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int[] nums = new int[n];
        for(int i = 0; i<n; i++)
        {
            nums[i] = i+1;
        }
        List <List<Integer>> list = new ArrayList<>();
        List <Integer> arr = new ArrayList<>();
        help(1,n,k,arr,list);
        return list;
    }
    void help(int index, int n,int k,List<Integer> arr, List<List<Integer>>list)
    {
        if(arr.size()==k)
        {
            list.add(new ArrayList<>(arr));
            return;
        }
        for(int i = index;i<=n;i++)
        {
            arr.add(i);
            help(i+1,n,k,arr,list);
            arr.remove(arr.size()-1);
            //help(i+1,n,k,arr,list);
        }
    }
}