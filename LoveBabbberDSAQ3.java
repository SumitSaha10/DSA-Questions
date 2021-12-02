package com.Company;

import java.util.Arrays;

//Find the kth min and max element in array

public class LoveBabbberDSAQ3 {
  public static int minKthElm(int arr[],int k){
    for(int i =0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[j]<arr[i]){
          int temp = arr[j];
          arr[j] = arr[i];
          arr[i] = temp;
        }
      }
    }
    
    return arr[k-1];
  }
  public static void main(String[] args) {
    int[] arr = {5,23,89,0,24,12};
    int kthMin = minKthElm(arr,6);
    System.out.println(kthMin);
  }

}
