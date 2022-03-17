/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tamrin7;

import java.util.*;

public class TAMRIN7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(javab());

    }

    public static int javab() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter n = ");
        int n = input.nextInt();
        int positive = 0;
        int negetive = -125;
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter a array single digit " + i + " :");
            array[i] = input.nextInt();
            if (array[i] > positive) {
                positive = array[i];
            }
            if (array[i] < 0 && array[i] > negetive) {
                negetive = array[i];
            }
        }
        return positive + negetive;

    }

}
