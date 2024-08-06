class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0;i<=n;i++){
            
            ans[i]=calculateOnes(i);
        }
        return ans;
        
    }
    
    public int calculateOnes(int x){
        int counter=0;
            while(x>0){
                x=x&(x-1);
                counter++;
            }
        return counter;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.calculateOnes(4);       
    }
}