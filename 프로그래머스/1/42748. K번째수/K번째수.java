import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int cnt = commands.length;
        int[] answer = new int[cnt];
        int idx = 0;

        for (int[] compare : commands) {
            int i = compare[0];
            int j = compare[1];
            int k = compare[2];

            List<Integer> arr = new ArrayList<>();

            for (int a = i - 1; a < j; a++) {
                arr.add(array[a]);
            }

            Collections.sort(arr);
            answer[idx] = arr.get(k - 1);
            idx++;
        }

        return answer;
    }
}