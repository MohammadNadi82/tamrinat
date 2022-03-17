/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tamrin.pkg6;

import java.util.*;

import java.util.Scanner;

public class Tamrin6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a size array ; ");
        int Andaze = input.nextInt();
        int ezafe = 0;
        int k = 0;
        System.out.println("enter a repetitious number : ");
        int Tekrar = input.nextInt();
        int array[] = new int[Andaze];
        for (int i = 0; i < Andaze; i++) {
            System.out.println("enter a number for array : ");
            int m = input.nextInt();
            if (m == Tekrar) {
                ezafe++;
            }
            if (m != Tekrar) {
                k = i - ezafe;
                array[k] = m;
            }

        }
        Andaze = Andaze - 1;
        for (int j = 0; j < ezafe; j++) {
            array[Andaze] = Tekrar;
            Andaze--;
        }
        System.out.print("(array are : ");
        for (int s = 0; s < array.length; s++) {
            System.out.print(array[s] + ", ");
        }
        System.out.print(")");
    }

}
