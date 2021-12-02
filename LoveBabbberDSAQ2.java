package com.Company;

//Find the maximum and minimum element in an array

public class LoveBabbberDSAQ2 {
  public static int maxElm(int arr[]){
    int max = arr[0];
    for(int i =1;i<arr.length;i++){
      if(arr[i]>max){
        max = arr[i];
      }
    }
    return max;
  }
  public static int minElm(int arr[]){
    int min = arr[0];
    for(int i =1;i<arr.length;i++){
      if(arr[i]<min){
        min = arr[i];
      }
    }
    return min;
  }
  
  public static void main(String[] args) {
     int[] arr = {2,90,678,1,1000};
     
     int max = maxElm(arr);
     int min = minElm(arr);
     System.out.println("Maximum value "+max);
     System.out.println("Minimum value "+min);
  }

}
