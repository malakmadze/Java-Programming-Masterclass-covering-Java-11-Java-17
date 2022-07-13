package arrays;

import java.util.Scanner;

public class Main {
  private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    // #1. array initialization in java
    int [] myIntArray = {1,2,3,4,5,6,7,8,9,10};
    // #2. array initialization in java
    double[] myDoubleArray = new double [10];
    //Assign value to array elements
    for (int i=0; i<myDoubleArray.length; i++){
      myDoubleArray[i] = i*2.0;
    }
    printArray(myDoubleArray);

    //Accept User Input
    int [] myIntegers = getIntegers(5);
    printArray(myIntegers);
    System.out.println("The avarage is: " + getAverage(myIntegers));
  }
  public static void printArray(double [] array){
    for (int i=0; i<array.length; i++){
      System.out.println(array[i]);
    }
  }
  public static void printArray(int [] array){
    for (int i=0; i<array.length; i++){
      System.out.println("Element " + i + " typed value was " + array[i]);
    }
  }

  public static int[] getIntegers (int number){
    System.out.println("Enter " + number + " integer values.\r");
    int[] values = new int[number];
    for (int i=0; i<values.length; i++){
      values[i] = scanner.nextInt();
    }
    return values;
  }

  public static double getAverage(int[] array){
    double sum = 0;
    for (int i=0; i<array.length; i++){
      sum += array[i];
    }
    return sum /= array.length;
  }
}
