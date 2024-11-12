class Solution {
    public int brokenCalc(int startValue, int target) {
        
        int count = 0;
        while(target > startValue){

            // target - startvalue (n)
            if(target % 2 == 0){
                target = target / 2;
            }
            else{
                target += 1;
            }
            count +=1;
        }

        return count + startValue - target;
    }
}


// T(C): Log(n) 
// S(C): O(1)
