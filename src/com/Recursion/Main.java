package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {1,2,3,4,55,66,78};
        int target = 78;
        System.out.println(binaryRec(arr,target,0,arr.length-1));
    }
    public static int binaryRec(int[] nums,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int m = start +(end-start)/2;
        if(nums[m]==target){
            return m;
        }
        if(target>nums[m]){
            return binaryRec(nums,target,m+1,end);
        }
        else{
            return binaryRec(nums,target,start,m-1);
        }
    }
}
// always try to write return statement while using recursion: