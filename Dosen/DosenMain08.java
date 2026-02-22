package Dosen;

import java.util.Scanner;

public class DosenMain08 {
    public static void main(String[] args) {
     
        Dosen08 d1 = new Dosen08();
        d1.tampilkanInformasi();
        d1.statusAktif();
        d1.ubahBidangKeahlian("Algoritma Struktur Data");
        int masaKerja = d1.hitungMasaKerja(2026);
        System.out.println("Masa kerja dosen " + masaKerja + " tahun");

        System.out.println();

        Dosen08 d2 = new Dosen08("DSN001", "Dr. Budi Santoso", true, 2010, "Pemrograman");
        d2.tampilkanInformasi();
        d2.statusAktif();
        d2.ubahBidangKeahlian("Pemrograman");
        int masaKerja2 = d2.hitungMasaKerja(2026);
        System.out.println("Masa kerja dosen " + masaKerja2 + " tahun");

        System.out.println();

    }
    
}
