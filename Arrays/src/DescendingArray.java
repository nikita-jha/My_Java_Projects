import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DescendingArray {
    private static Scanner scanner  = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);

    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values: \r");
        for(int i = 0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++ ) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for(int i = 0; i<array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length); //This is an optional way of copying the array into another method
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            //element 0   50
            //element 1   100
            //element 2   40
            for(int i = 0; i<sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i + 1]) { //if the number at place i is smaller than the proceeding number
                    temp = sortedArray[i]; //temp = 50
                    sortedArray[i] = sortedArray[i+1]; //element 0 becomes 100
                    sortedArray[i+1] = temp; //element 1 becomes 50 (temp was defined as 50 in line 38)
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}














