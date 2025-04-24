/******** Q1. LARGEST ELEMENT IN AN ARRAY *****/
/*
class Solution {
    public int largestElement(int[] nums) {
        int largest = nums[0];
        for(int i=1; i<nums.length; i++) {
            if(nums[i] > largest){
                largest = nums[i];
            }
        }
        return largest;
    }
}
*/

/**** Q2. SECOND LARGEST IN AN ARRAY ****/
/*
class Solution {
    public int secondLargestElement(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > largest) {
                second_largest = largest;
                largest = nums[i];
            } else if(nums[i] > second_largest && nums[i] != largest) {
                second_largest = nums[i];
            }
        }

        return second_largest;
    }
}
*/

/***** Q3. CHECK IF THE ARRAY IS SORTED ****/
/*
class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        for(int i=0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
*/

/**** Q4.REMOVE DUPLICATES FROM SORTED ARRAY ****/
/*
class Solution {
    public int removeDuplicates(int[] nums) {
      int i = 0;
      for(int j=1; j<nums.length; j++){
        if(nums[i] != nums[j]) {
            i++;
            nums[i] = nums[j];
        }
      }
      return i+1;
    }
}
*/
