import java.util.*;
// 수많은 마라톤 선수들이 마라톤에 참여 
// 단 한명의 선수를 제외하고 모든 선수 마라톤 완주
class Solution {
    public String solution(String[] participant, String[] completion) {
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String name : participant) {
            if(map.containsKey(name)){
                map.put(name, map.get(name) + 1);
            }
            else{
                map.put(name, 1);
            }
            
        }
        for (String name : completion) {
            map.put(name, map.get(name) - 1);
        }
        
        String answer = "";

        for (String name : map.keySet()) {
            if (map.get(name) == 1) {
                answer = name;
                break;
            }
        }

        return answer;
    }
}