import java.util.*;
 
class Solution {
    public int solution(int n) {
        
        int left = 1;
        int right = 1;
        int sum = 1;
        int answer = 0;
        
        while(left <= n){
            if(sum < n){
                right++;
                sum += right;
            }
            else{
                if(sum == n) {
                    answer++;
                }
                
                sum -= left;
                left++;
            }
        }
        return answer;
    }
}