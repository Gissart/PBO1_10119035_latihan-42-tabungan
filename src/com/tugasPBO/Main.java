package com.tugasPBO;
import java.util.Scanner;
/*
* Nama      : Argya Aulia Fauzandika
* NIM       : 10119035
* Kelas     : PBO1 / IF1
* Deskripsi : Program seperti ATM, menarik sejumlah saldo
* */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan saldo awal : ");
        Tabungan tb = new Tabungan(scan.nextInt());
        System.out.print("Jumlah uang yang mau di ambil :");
        int jumlah = tb.ambilUang(scan.nextInt());
        System.out.println("Saldo anda sekarang : " + jumlah);
    }
}
