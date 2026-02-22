package Latihan_Praktikum;

import java.util.Scanner;

public class MatakuliahMain08 {
    public static void main(String[] args) {
        MataKuliah08 mk1 = new MataKuliah08();
        mk1.tampilkanInformasi();
        mk1.ubahSks(3);
        mk1.tambahJam(4);
        mk1.kurangiJam(2);
        mk1.kurangiJam(10);

        System.out.println();

        MataKuliah08 mk2 = new MataKuliah08("MK101", "Algoritma Dan Struktur Data", 4, 6);    
        mk2.tampilkanInformasi();
        mk2.ubahSks(3);
        mk2.tambahJam(2);
        mk2.kurangiJam(3);
        
    }
}
