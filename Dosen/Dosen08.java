package Dosen;

import java.util.Scanner;

public class Dosen08 {
    String idDosen;
    String namaDosen;
    boolean aktif;
    int tahunBergabung;
    String BidangKeahlian;

    public Dosen08(String string, String string2, boolean b, int i, String string3) {
        idDosen = "DSN000";
        namaDosen = "Nama Tidak Diketahui";
        aktif = false;
        tahunBergabung = 2000;
        BidangKeahlian = "Bidang Keahlian Tidak Diketahui";

    }

   public Dosen08() {
        
    }

   public void tampilkanInformasi() {
       System.out.println("ID Dosen        : " + idDosen);
       System.out.println("Nama            : " + namaDosen);
       System.out.println("Status Aktif    : " + (aktif ? "Aktif" : "Tidak Aktif"));
       System.out.println("Tahun Bergabung : " + tahunBergabung);
       System.out.println("Bidang Keahlian : " + BidangKeahlian);
    }

    public void statusAktif() {
        aktif = true;
        System.out.println("Status dosen " + namaDosen + " sekarang: Aktif");
    }

    public int hitungMasaKerja(int tahunSekarang) {
        if (tahunSekarang < tahunBergabung) {
            System.out.println("Tahun sekarang tidak boleh lebih kecil dari tahun bergabung.");
            return -1;
        }
        int masaKerja = tahunSekarang - tahunBergabung;
        System.out.println("Masa kerja dosen " + namaDosen + " adalah: " + masaKerja + " tahun");
        return masaKerja;
    }

    public void ubahBidangKeahlian(String bidangBaru) {
        BidangKeahlian = bidangBaru;
        System.out.println("Bidang keahlian dosen " + namaDosen + " berhasil diubah menjadi: " + BidangKeahlian);
    }
}
