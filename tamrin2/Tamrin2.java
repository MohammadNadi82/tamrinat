/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tamrin2;

import java.util.*;

public class Tamrin2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number : ");
        int Andaze = input.nextInt();
        int copy = (int) Andaze;
        copy = copy + 2;
        char ch = '*';
        for (int i = 1; i <= Andaze; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= Andaze; i++) {
            for (int j = Andaze; j >= i; --j) {
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println();
    }
}
