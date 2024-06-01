package com.juaracoding.mfhujian1jf.ujian1;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] hargaTiket = new int[5];

        int totalHargaTiket = 0;

        //Perulangan untuk menginput harga tiket dan menjumlahkan total harga  tiket
        for (int i = 0; i < 5; i++) {
            int j = i + 1;
            System.out.print("Harga tiket film " + j + ": ");
            hargaTiket[i] = scanner.nextInt();
            totalHargaTiket += hargaTiket[i];
        }

        System.out.println("Total harga tiket: " + totalHargaTiket);

    }
}
