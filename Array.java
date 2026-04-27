package Homework1_array;

import java.util.Scanner;

public class Array {

    // method to display array
    public static void display(int[] list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // method to compare arrays
    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 1) ask number of elements
        System.out.print("Enter the number of elements: ");
        int num = input.nextInt();

        // 2) create arrays
        int[] list1 = new int[num];
        int[] list2 = new int[num];

        // 3) input list1
        System.out.println("Enter numbers for list1:");
        System.out.println("-----------------------");
        for (int i = 0; i < list1.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            list1[i] = input.nextInt();
        }

        // 4) input list2
        System.out.println("\nEnter numbers for list2:");
        System.out.println("-----------------------");
        for (int i = 0; i < list2.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            list2[i] = input.nextInt();
        }

        // display arrays
        System.out.print("\nList1: ");
        display(list1);

        System.out.print("List2: ");
        display(list2);

        // compare arrays
        if (equals(list1, list2)) {
            System.out.println("Both arrays are equal.");
        } else {
            System.out.println("Arrays are NOT equal.");
        }

        input.close();
    }
}