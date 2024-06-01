package com.juaracoding.mfhujian1jf.ujian1;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opsiHari;
        int hargaWeekday = 35000;
        int hargaWeekend = 45000;

        System.out.println("Silahkan pilih opsi hari weekday atau weekend \nKetik \"1\" jika weekday \nKetik \"2\" jika weekend");
        System.out.print("Masukkan opsi: ");
        opsiHari = scanner.nextInt();
        System.out.println();

        //Percabangan harga weekday dan weekend
        if (opsiHari == 1){
            System.out.print("Jumlah Tiket: ");
            int jumlahTiket = scanner.nextInt();

            //Percabangan total harga dengan diskon atau tanpa diskon saat weekday
            if (jumlahTiket > 5){
                System.out.println("Total harga (dengan diskon): " + ((jumlahTiket * hargaWeekday) - (jumlahTiket * hargaWeekday * 10 / 100)));
            } else{
                System.out.println("Total harga (tanpa diskon): " + jumlahTiket * hargaWeekday);
            }
        } else if (opsiHari == 2){
            System.out.print("Jumlah Tiket: ");
            int jumlahTiket = scanner.nextInt();

            //Percabangan total harga dengan diskon atau tanpa diskon saat weekend
            if (jumlahTiket > 5){
                System.out.println("Total harga (dengan diskon}: " + ((jumlahTiket * hargaWeekend) - (jumlahTiket * hargaWeekend * 10 / 100)));
            } else{
                System.out.println("Total harga (tanpa diskon): " + jumlahTiket * hargaWeekend);
            }
        } else {
            System.out.println("Opsi yang anda masukkan salah");
        }

    }
}
