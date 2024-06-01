package com.juaracoding.mfhujian1jf.ujian1;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] namaFilm = new String[5];

        System.out.println("Daftar film biskop");

        //Perulangan untuk menginput lima nama film
        for (int i = 0; i < 5; i++) {
            int j = i + 1;
            System.out.print("Masukkan nama film " + j + ": ");
            namaFilm[i] = scanner.nextLine();
        }

        System.out.println("Film yang ingin ditonton");

        //Perulangan untuk menampilkan lima film yang ingin ditonton
        for (int i = 0; i < 5; i++){
            int j = i + 1;
            System.out.println(j + ". " + namaFilm[i]);
        }

    }
}
