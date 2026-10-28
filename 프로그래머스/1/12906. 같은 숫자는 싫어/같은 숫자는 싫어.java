import java.util.*;
// 연속으로 나타는 건 버리기

public class Solution {
    public int[] solution(int []arr) {
        
        Deque<Integer> q = new ArrayDeque<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (q.isEmpty() || q.peekLast() != arr[i]) {
                q.offer(arr[i]);
            }
        }
        
        int idx = 0;
        int answer[] = new int[q.size()];
        for(int num : q){
            answer[idx] = num;
            idx++;
        }
        
        return answer;
    }
}