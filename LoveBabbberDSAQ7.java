package com.Company;

//Write a program to cyclically rotate an array by one

public class LoveBabbberDSAQ7 {
  public static void cyRo(int arr[]){
    int cyElm = arr[arr.length-1];
    for(int i=arr.length-1;i>=1;i--){
      arr[i] = arr[i-1];
    }
    arr[0] = cyElm;
    
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");  
    }
  }
  public static void main(String[] args) {
    int[] arr = {2,5,67,9,0,4};
    cyRo(arr);
  }

}
