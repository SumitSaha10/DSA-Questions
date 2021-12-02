package com.Company;

//Find the Union and Intersection of the two sorted array

import java.util.ArrayList;
import java.util.HashSet;


public class LoveBabbberDSAQ6 {
  public static void union(int arr1[],int arr2[]){
    HashSet<Integer> hset = new HashSet<>();
    
    for(int i=0;i<arr1.length;i++){
      hset.add(arr1[i]);
    }
    for(int i=0;i<arr2.length;i++){
      hset.add(arr2[i]);
      
    }
    System.out.println(hset);
  }
  public static void intersection(int arr1[],int arr2[]){
    ArrayList<Integer> arrList = new ArrayList<>();
    ArrayList<Integer> arr2List = new ArrayList<>();
    for(int i=0;i<arr1.length;i++){
      arrList.add(arr1[i]);
    }
    for(int i=0;i<arr2.length;i++){
      if(arrList.contains(arr2[i])){
        arr2List.add(arr2[i]);
      }
    }
    System.out.println(arr2List);
  }
  public static void main(String[] args) {
    int[] arr1 ={6,5,8};
    int[] arr2 ={6,9,0};
    union(arr1,arr2);
    intersection(arr1,arr2);
  }

}
