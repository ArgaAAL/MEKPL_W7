package tugasweek7.tugasweek7;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        int hasil = angka1 + angka2;

        System.out.println("Hasil penjumlahan: " + hasil);
    }
}
