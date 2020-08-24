package cala;


public class Main02 {

    public static void main(String[] args) {
      int[] nums = {25,24,12,76,101,96,28};
        for (int i = 0; i < nums.length-1 ; i++) {
            for (int j = 0; j < nums.length-i-1 ; j++) {
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        for(int i = 0 ; i< nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
