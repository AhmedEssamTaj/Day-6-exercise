import java.util.ArrayList;
import java.util.Arrays;

/*
Author: Ahmed Essam Taj
Date: 27, October
Day 6 Exercise

 */
public class Main {
    public static void main(String[] args) {

/*
        Q1/ Write a Java program to test if the first and the last element of an array of
integers are same. The length of the array must be greater than or equal to 2.

 */
        // ===== answer Q1 ==============
        System.out.println("=============== Q1 =======================");
        int [] numArray = {50, -20, 0, 30, 40, 60, 10};
        System.out.println("array = "+ Arrays.toString(numArray));
        boolean isEqual = numArray[0] == numArray[numArray.length - 1];
        System.out.println("first and the last element are equal: "+isEqual );

/*
        Q2/ Write a Java program to find the numbers greater than the average of the
numbers of a given array

 */
        // ===== answer Q2 ==============

        System.out.println("=============== Q2 =======================");
        int [] originArray = {1, 4, 17, 7, 25, 3, 100};
        int originArraySum =0;
        for (int i = 0; i < originArray.length; i++) {
            originArraySum += originArray[i];
        }
        double avg = originArraySum/originArray.length;
        System.out.println("The average of the said array is: "+avg);
        System.out.print("The numbers in the said array that are greater than the average are: ");
        for( int o: originArray) {
            if(o > avg)
                System.out.print(o+" ");
        }


/*
        Q3/ Write a Java program to get the larger value between first and last
element of an array of integers

 */
        // ===== answer Q3 ==============

        System.out.println("\n=============== Q3 =======================");
        int [] q3Array = {20, 30, 40};
        int larger ;
        if (q3Array[0] > q3Array[q3Array.length - 1]) {
            System.out.println("Larger value between first and last element: "+q3Array[0]);
        }else if (q3Array[0] < q3Array[q3Array.length - 1]) {
            System.out.println("Larger value between first and last element: "+q3Array[q3Array.length - 1]);
        }else {
            System.out.println("they are equals");
        }

/*
        Q4/ Write a Java program to swap the first and last elements of an array and
create a new array

 */
        // ===== answer Q4 ==============
        System.out.println("=============== Q4 =======================");

        ArrayList <Integer> q4Array = new ArrayList<>();
        q4Array.add(20);
        q4Array.add(30);
        q4Array.add(40);


        int [] swappedArray  = new int[q4Array.size()];
        swappedArray[0] = q4Array.getLast();
        q4Array.remove(swappedArray.length - 1);
        swappedArray[swappedArray.length - 1] = q4Array.getFirst();

        for (int i = 1; i < swappedArray.length-1; i++) {
            swappedArray[i] = q4Array.get(i);
        }

        System.out.println("New array after swapping the first and last elements: "+Arrays.toString(swappedArray));

/*
        Q5/ Write a program that places the odd elements of an array before the
even elements.

 */
        // ===== answer Q5 ==============

        System.out.println("=============== Q5 =======================");
        int[] q5Array = {2,3,40,1,5,9,4,10,7};
        ArrayList<Integer> newArray = new ArrayList<>();

        // store only the odd elements in the original array
        for (int i = 0; i <q5Array.length ; i++) {

            if (q5Array[i] % 2 != 0) {
                newArray.add(q5Array[i]);
            }

        }
        // store only the even elements in the original array
        for (int i = 0; i < q5Array.length; i++) {
            if (q5Array[i] % 2 == 0) {
                newArray.add(q5Array[i]);
            }
        }
        System.out.println("Orderd arra is : "+newArray);

/*
        Q6/ Write a program that test the equality of two arrays..

 */
        // ===== answer Q6 ==============
        System.out.println("=============== Q6 =======================");
        int [] arr1 = {2,3,6,6,4};
        int [] arr2 = {2,3,6,6,4};

        System.out.println("Array 1 is equal to Array 2: "+Arrays.equals(arr1,arr2));
    }
}