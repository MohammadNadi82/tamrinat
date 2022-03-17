/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tamrin1;

import java.util.Scanner;

public class Tamrin1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("we want to do : (ax^3+bx^2+cx+d) + (sx^3+fx^2+gx+k)");
        System.out.println("enter x : ");
        int x = input.nextInt();
        long first = 0;
        long second = 0;
        long xx = (int) x * x;
        long xxx = (int) x * x * x;
        System.out.println("enter a");
        long a = input.nextInt();
        a = a * xxx;
        System.out.println("enter b");
        long b = input.nextInt();
        b = b * xx;
        System.out.println("enter c");
        long c = input.nextInt();
        c = c * x;
        System.out.println("enter d");
        long d = input.nextInt();
        first = a + b + c + d;
        System.out.println("enter s");
        long s = input.nextInt();
        s = xxx * s;
        System.out.println("enter f");
        long f = input.nextInt();
        f = f * xx;
        System.out.println("enter g");
        long g = input.nextInt();
        g = g * x;
        System.out.println("enter k");
        long k = input.nextInt();
        second = s + f + g + k;
        System.out.print("(ax^3+bx^2+cx+d) + (sx^3+fx^2+gx+k) = ");
        System.out.println(first + second);
    }

}
