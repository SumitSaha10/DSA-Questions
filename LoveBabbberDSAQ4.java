package com.Company;

//Given an array which is only consists of 0 , 1 and 2. Sort the array without using any sorting algo

public class LoveBabbberDSAQ4 {
  public static void sort012(int arr[]){
  int c0=0, c1=0, c2 =0;
    for(int i=0;i<arr.length;i++){
      if(arr[i] == 0){
        c0++;
      }
      else if(arr[i] == 1){
        c1++;
      }
      else{
        c2++;
      }
    }
    int k =0;
    for(int i=0;i<c0;i++){
      arr[k]=0;
      k++;
    }
    for(int i=0;i<c1;i++){
      arr[k]=1;
      k++;
    }
    for(int i=0;i<c2;i++){
      arr[k]=2;
      k++;
    }
         
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
  public static void main(String[] args) {
   int[] arr ={0,2,1,2,0};
   sort012(arr);
  }

}
