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

/**** Q4. REMOVE DUPLICATES FROM SORTED ARRAY ****/
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

/**** Q5. LEFT ROTATE AN ARRAY BY ONE-PLACE ****/
/*
class Solution {
    public void rotateArrayByOne(int[] nums) {
        int temp = nums[0];
        int n = nums.length;
        for(int i=1; i<n; i++){
            nums[i-1] = nums[i];
        }
        nums[n-1] = temp;
    }
}
*/

/***** Q6. LEFT ROTATE AN ARRAY BY D-PLACE ******/
/*
class Solution {
    public void rotateArray(int[] nums, int k) {
       int n = nums.length;
       k = k % n;
       int temp[] = new int[n];
       for(int i = 0; i<k; i++){
        temp[i] = nums[i];
       }
       for(int i=k; i<n; i++){
        nums[i-k] = nums[i];
       }
       for(int i=n-k; i<n; i++){
        nums[i] = temp[i-(n-k)];
       }
    }
}
*/

/**** Q7. MOVE ZERO TO END ******/
/*
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int temp[] = new int[n];
        int index = 0;
        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                temp[index] = nums[i];
                index++;
            }
        }
        for(int i=0; i<n; i++){
            nums[i] = temp[i];
        }
    }
}
*/

/**** Q8. LINEAR SEARCH ********/
/*
class Solution {
    public int linearSearch(int nums[], int target) {
                //Your code goes here
    for(int i=0; i<nums.length; i++){
      if(nums[i] == target) {
        return i;
      }
    }
    return -1;
    }
}
*/

/**** Q9. FIND THE UNION *******/
/*

 */

import java.util.*;

class Solution {
    static int minRemoval(int intervals[][]) {
        if (intervals.length == 0) return 0;

        // Sort the intervals by their end time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 0;
        int prevEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < prevEnd) {
                // Overlapping interval found, increment removal count
                count++;
            } else {
                // Update the end time of the last non-overlapping interval
                prevEnd = intervals[i][1];
            }
        }

        return count;
    }
}
