class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int res=0;
        int[] arr=new int[n];
        Arrays.fill(arr,0);
        for(int x:nums){
            arr[x]++;
        }
        for(int i=0;i<n;i++){
            if(arr[i]>1){
                res=i;
            }
        }
        return res;
    }
}