/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incrementdecrement;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class IncrementDecrement {

    /**
     * @param args the command line arguments
     */
    public static String leftPad(String originalString, int length) {
        String paddedString = originalString;

        while (paddedString.length() < length) {
            paddedString = "0" + paddedString;
        }
        return paddedString;

    }

    public static void main(String[] args) {

        int length = 0;
        int menu = 0;

        while (menu != 3) {
            Scanner scan = new Scanner(System.in);
            System.out.println("=====Program auto increment dan decrement=====");
            System.out.println("1. Increment\n2. Decrement\n3. Exit");
            System.out.print("Masukkan inputan: ");
            menu = scan.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan length: ");
                    length = scan.nextInt();
                    if (length > 2 && length < 100) {
                        for (int i = 1; i <= 100; i++) {
                            System.out.println((leftPad(i + "", length)));

                        }
                    } else {
                        System.out.println("length hanya dapat ditampilkan dengan nilai minimal 3 dan maksimal 99");
                    }

                    break;
                case 2:
                    System.out.print("masukkan length: ");
                    length = scan.nextInt();
                    if (length > 2 && length < 100) {
                        for (int i = 100; i >= 1; i--) {
                            System.out.println((leftPad(i + "", length)));

                        }
                    } else {
                        System.out.println("length hanya dapat ditampilkan dengan nilai minimal 3 dan maksimal 99");
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Masukkan hanya angka 1 untuk increment, 2 untuk decrement dan 3 untuk exit");
                    break;

            }
        }
    }
}
