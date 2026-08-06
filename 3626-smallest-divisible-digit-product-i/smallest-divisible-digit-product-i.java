class Solution {
    public static int product(int n){
        int product=1;
        while(n>0){
            int digit=n%10;
             product=product*digit;
             n/=10;
            
        }
        return product;
    }
    public int smallestNumber(int n, int t) {
        int i=n;
        while(i<=100){
            int res=product(i);
            if(res%t==0){
                return i;
            }
            i++;
        }
        return -1;
    }
}