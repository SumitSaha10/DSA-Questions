package com.Company;

//Move all the negative elements to one side of the array

public class LoveBabbberDSAQ5 {
  public static void negSider(int arr[]){
     for(int i =0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[j]<arr[i]){
          int temp = arr[j];
          arr[j] = arr[i];
          arr[i] = temp;
        }
      }
    }
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    }
  public static void main(String[] args) {
    int[] arr = {7,-1,0,6,-6,-2,8};
    negSider(arr);
  }

}
