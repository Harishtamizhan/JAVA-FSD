package com;

public class BinarySearch {
	
public static  void main(String[] args){
        
        int[] arr = {17,20,5,11,60};
        System.out.println("Enter the value to search");
       
        int key = 5;
        int arrlength = arr.length;
        binarySearch(arr,0,key,arrlength);
        
}

public static void binarySearch(int[] arr, int start, int key, int length){

    int midValue = (start+length)/2;
    while(start<=length){

        if(arr[midValue]<key){

            start = midValue + 1;
        } else if(arr[midValue]==key){
            System.out.println("Element is found at index :"+midValue);
            break;
        }else {

            length=midValue-1;
        }
        midValue = (start+length)/2;
    }
        if(start>length){

            System.out.println("Element is not found");
        }

}


}


