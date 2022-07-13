package referencesVsValueTypes;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int myIntValue = 10;
    int anotherIntValue = myIntValue;
    System.out.println("myIntValue = " + myIntValue);
    System.out.println("anotherIntValue = " + anotherIntValue);
    anotherIntValue++;
    System.out.println("myIntValue = " + myIntValue);
    System.out.println("anotherIntValue = " + anotherIntValue);


    int [] myIntArray = new int[5];
    int[] anotherArray = myIntArray;
    for (int i=0; i<anotherArray.length; i++){
      anotherArray[i] = i+1;
    }
    System.out.println("myIntArray= " + Arrays.toString(myIntArray));
    System.out.println("anotherIntArray= " + Arrays.toString(anotherArray));

    modifyArray(myIntArray);
    System.out.println("myIntArray= " + Arrays.toString(myIntArray));
    System.out.println("anotherIntArray= " + Arrays.toString(anotherArray));

    anotherArray = new int[] {4,5,6,7,8};
    System.out.println("myIntArray= " + Arrays.toString(myIntArray));
    System.out.println("anotherIntArray= " + Arrays.toString(anotherArray));

  }
    private static void modifyArray(int[] array){
     array[0] = 2;
     array = new int [] {5,4,3,2,1};
    }
}
