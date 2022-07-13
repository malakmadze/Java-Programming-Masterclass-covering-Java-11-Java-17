package arrays.challenges;

import java.util.Scanner;

// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.
public class sortArray {
  public static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    int [] sortedArray = getIntegers (5);
    printArray(sortedArray);

    sortedArray = sortIntegers(sortedArray);
    printArray(sortedArray);




  }
  public static int[] getIntegers (int number){
    System.out.println("Enter " + number + " integers\r");
    int[] array = new int[number];
    for (int i=0; i<array.length; i++){
      array[i] = scanner.nextInt();
    }
    scanner.close();
    return array;
  }
  public static void printArray (int[] array){
    for (int i=0; i<array.length; i++){
      System.out.println("Element " + i + " typed value was " + array[i]);
    }
  }

  public static int[] sortIntegers (int[] array){
    int [] sort = new int[array.length];
    for (int i=0; i< array.length; i++){
      sort[i]=array[i];
    }
    // # Alternative method to copy array
    // int [] sort = Arrays.copyOf(array, array.length);
    boolean flag = true;
    int temp;
    while (flag){
      flag = false;
      for (int i=0; i<array.length-1; i++){
        if (sort[i] < sort[i+1]){
          temp = sort[i];
          sort[i] = sort[i+1];
          sort[i+1] = temp;
          flag = true;
        }
      }
    }
    return sort;
  }
}
