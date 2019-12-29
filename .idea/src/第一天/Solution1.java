package 第一天;

public class Solution1 {
    public static void main(String[] args) {

    }

    public int removeDuplicates(int[] nums) {
        int n = 0;
        for(int i = 1; i < nums.length - 1; i++){
            if(nums[0] != nums[i]){
                n++;
                nums[n] = nums[i];
            }
        }
        return n++;
    }
}
