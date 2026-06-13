class Solution {
    public int lastRemaining(int n) {
        int head=1;
        int rem=n;
        boolean left=true;
        int step=1;
        while(rem>1){
            if(left || rem%2==1){
                head=head+step;
            }
            rem=rem/2;
            step=step*2;
            left= !left;
        }
        return head;
        
    }
}