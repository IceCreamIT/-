package 第二天作业;

public class Solution3 {
    public static void main(String[] args) {

    }
/*
* 解法一，一个一个移动
* */
     public void retate1(int []nums, int k){
        int n = nums.length;
        k %= n;
        for(int i = 0; i <  k; i++){
            int temp = nums[n-1];
            for(int j = n-1; j > 0; j--){
                nums[j] = nums[j-1];
            }
            nums[0] = temp;
        }
     }
/*
* 解法二：利用翻转的方式，只需要三次翻转就可以了，首先是整体翻转，然后在分界线前后翻转，反之亦可
* */
     public void retate2(int []nums, int k){
        int n = nums.length;
        k %= n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
     }

     private void reverse(int []nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
     }
/*
* 解法三：
*
* */
    public void rotate_3(int[] nums, int k) {
    int n = nums.length;
    k %= n;
    // 第一次交换完毕后，前 k 位数字位置正确，后 n-k 位数字中最后 k 位数字顺序错误，继续交换
    for (int start = 0; start < nums.length && k != 0; n -= k, start += k, k %= n) {
        for (int i = 0; i < k; i++) {
            swap(nums, start + i, nums.length - k + i);
        }
    }
}
    private void swap(int []array, int i, int j){
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
    }



}
