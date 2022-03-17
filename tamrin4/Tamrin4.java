/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tamrin4;

import java.util.*;

public class Tamrin4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("تعداد نمرات را وارد کنید");
        int Tedad = x.nextInt();
        float Miangin = 0;
        int m = 0;
        int max = 0;
        int min = 20;
        int array[] = new int[Tedad];
        for (int i = 0; i < Tedad; i++) {
            System.out.println("نمره را وارد کنید ");
            array[i] = x.nextInt();
            Miangin = array[i] + Miangin;
        }
        while (m < Tedad) {
            if (array[m] > max) {
                max = (int) array[m];
            }
            if (array[m] < min) {
                min = (int) array[m];
            }
            m++;
        }
        System.out.println("بیشترین نمره شما هست : " + max);
        System.out.println("کمترین نمره شما هست : " + min);
        System.out.println("میانگین نمره شما هست : " + Miangin / Tedad);
    }

}
