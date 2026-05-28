import java.util.*;

class Solution {
    
    static class Process {
        int idx;
        int prior;
      
        Process(int prior, int idx) {
            this.idx = idx;
            this.prior = prior;
        }
    }

    public int solution(int[] priorities, int location) {
        Queue<Process> q = new LinkedList<>();
        
        for (int i = 0; i < priorities.length; i++) {
            q.offer(new Process(priorities[i], i));
        }
        
        int ans = 0;
        
        while (!q.isEmpty()) {
            Process curr = q.poll();
            
            boolean up = false;
            
            for (Process p : q) {
                if (p.prior > curr.prior) {
                    up = true;
                    break;
                }
            }
            
            if (up) {
                q.offer(curr);
            } else {
                ans++;
                
                if (curr.idx == location) {
                    return ans;
                }
            }
        }
        
        return ans;
    }
}