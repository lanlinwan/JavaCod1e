package Exercise;

import java.util.Scanner;

public class llll {
    public static void main(String[] args) {
        //三角形  2*(n-1)+1
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k<2*i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 3; i >0 ; i--) {
            for (int j = 0; j <4-i+1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k<2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <4 ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }




    }

}
