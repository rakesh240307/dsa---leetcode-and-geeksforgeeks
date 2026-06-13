class Solution {
    public int maximumPrimeDifference(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i<=100;i++){
            boolean a = true;
            for(int j = 2 ; j*j<=i;j++){
                if(i%j==0){
                    a = false;
                    break;
                }

            }
            if(a && i!=1){
                set.add(i);
            }
            
        }
            int f = 0;
            int l = 0;
            for(int i = 0 ; i<nums.length;i++){
                if(set.contains(nums[i])){
                    f = i;
                    break;
                }

            }
            for(int i = nums.length-1;i>=0;i--){
                if(set.contains(nums[i])){
                    l = i;
                    break;
                }
            }


        return l-f;
        
    }
}