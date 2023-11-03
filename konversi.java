package belajar;

import java.util.Scanner;

public class konversi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int desimal;
        String biner, hexa;
        System.out.println(
                "Menu konversi\n1. Biner ke Desimal\n2. Desimal ke Biner\n3. Biner ke Hexa\n4. Hexa ke Biner\n5. Desimal ke Hexa\n6. Hexa ke Desimal");
        System.out.print("Pilihan anda : ");
        int n = in.nextInt();
        in.nextLine();
        System.out.println();

        switch (n) {
            case 1:
                System.out.print("Input bilangan Biner : ");
                biner = in.nextLine();
                desimal = Integer.valueOf(biner, 2);
                System.out.println("Bilangan desimalnya adalah : " + desimal);
                break;

            case 2:
                System.out.print("Input bilangan Desimal : ");
                desimal = in.nextInt();
                biner = Integer.toBinaryString(desimal);
                System.out.println("Bilangan binernya adalah : " + biner);
                break;

            case 3:
                System.out.print("Input bilangan Biner : ");
                biner = in.nextLine();
                hexa = Integer.toHexString(Integer.valueOf(biner, 2));
                System.out.println("Bilangan hexanya adalah : " + hexa);
                break;

            case 4:
                System.out.print("Input bilangan Hexa : ");
                hexa = in.nextLine();
                biner = Integer.toBinaryString(Integer.valueOf(hexa, 16));
                System.out.println("Bilangan binernya adalah " + biner);
                break;

            case 5:
                System.out.print("Input bilangan Desimal : ");
                desimal = in.nextInt();
                hexa = Integer.toHexString(desimal);
                System.out.println("Bilangan hexanya adalah : " + hexa);
                break;

            case 6:
                System.out.print("Input bilangan Hexa : ");
                hexa=in.nextLine();
                desimal=Integer.valueOf(hexa, 16);
                System.out.println("Bilangan desimalnya adalah : "+desimal);
            default:
                break;
        }
        System.out.println("========================================");

    }

}
