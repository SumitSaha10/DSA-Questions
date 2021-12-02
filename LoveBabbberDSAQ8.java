package com.Company;

//Find largest sum contiguous Subarray

public class LoveBabbberDSAQ8 {
  public static int maxSumSubArray(int arr[])            
  {
    int maxSum = 0;
    int curSum = 0;
    for(int i=0;i<arr.length;i++){
      curSum = curSum + arr[i];
      if(curSum>maxSum){
        maxSum = curSum;
      }
      if(curSum<0){
        curSum = 0;
      }
    }
    return maxSum;
  }
  public static void main(String[] args) {
   int[] arr = {-5,89,-24,-12};
   int maxSum = maxSumSubArray(arr);
   System.out.println(maxSum);
  }

}
