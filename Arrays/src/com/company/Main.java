package com.company;

public class Main {

    public static void main(String[] args) {
        int[] myIntArray = new int[25];  //{ 1,2,3,4,5,6,7,8,9,10};

        //An array is a data structure that allows you to store multiple values of the same type into a single variable
        //Never start a for loop for an array with i=1, because arrays are indexed started at 0
        //The second part of the for loop in an array should never be <=. It should always be i < array.length

        //The brackets means that we are dealing with an array. This is how you identify an array
//        myIntArray[0] = 45;
//        myIntArray[1] = 476;
//        myIntArray[5] = 50;

        //Arrays are zero indexed: an array with n elements is indexed from 0 to n-1, for example 10 elements index range is 0-9
//        System.out.println(myIntArray[0]);
//        System.out.println(myIntArray[1]);
//        System.out.println(myIntArray[2]);
//        System.out.println(myIntArray[3]);

        for(int i = 0; i< myIntArray.length; i++) { //middle part is same as saying i<10
            myIntArray[i] = i*10;
        }
        printArray(myIntArray);
    }
    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);


        }
    }

}
