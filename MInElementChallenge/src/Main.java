import java.util.Scanner;

public class Main {
    private static Scanner sc = new  Scanner(System.in);
    //    The Access modifier could be written as "private" as there is no other class present so the access modifier
//   that  is private within the same class only.
    public static int[] getIntegers (int count){
        int myIntegersArray[] = new int[count];
        for(int i=0; i< myIntegersArray.length; i++){
            System.out.print("Enter the element " + (i+1) + "  in the array = ");
            myIntegersArray[i]=sc.nextInt();
            sc.nextLine();
        }
        return myIntegersArray;
    }
    //    The Access modifier could be written as "private" as there is no other class present so the access modifier
//   that  is private within the same class only.
    public static int findMin(int[] a){
        boolean isTrue ;
        do {
            isTrue =false;
            for (int i=0;i<a.length-1;i++){
                if (a[i] > a[i + 1]){
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    isTrue = true;
                }
            }
        }while(isTrue);
        return a[0];
    }

  public static void main (String[] args){
        System.out.print("Enter the number of values to  be entered  in the array = ");
        int count = sc.nextInt();
        sc.nextLine();
        int myArray[] = getIntegers(count);
        System.out.println("The minimum value of array is " + findMin(myArray));
    }
}
/**
 * another solution approach could  be
 * private static int findMin(int[] a){
 *     int min = Integer.MAX_VALUE;
 *     for(int i=0;i<a.length;i++){
 *     int value = a[i];
 *     if(value < min){
 *         min = value;
 *     }
 * }
 * return min;
 * }
 */
