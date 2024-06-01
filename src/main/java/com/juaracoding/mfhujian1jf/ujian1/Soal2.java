package com.juaracoding.mfhujian1jf.ujian1;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama film: ");
        String namaFilm = scanner.nextLine();

        //Mengubah inputan nama film menjadi huruf besar dan menampilkan hasilnya
        String namaFilmHurufBesar = namaFilm.toUpperCase();
        System.out.println("Nama film dalam huruf besar: " + namaFilmHurufBesar);

    }
}
