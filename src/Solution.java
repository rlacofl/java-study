import java.util.ArrayList;

class Solution {

    public int solution(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();

        int answer = 0;
        int pick = nums.length / 2;

        for (int i = 0; i < nums.length; i++) {
            if (list.size() == pick) {
                break;
            }
            if (list.contains(nums[i])) {
                continue;
            }
            list.add(nums[i]);
        }
        return list.size();
    }
}
