package Latihan_Praktikum;

public class MataKuliah08 {
    String kodeMK;
    String namaMK;
    int sks;
    int jumlahJam;

    public MataKuliah08() {
        kodeMK = "MK001";
        namaMK = "Nama Tidak Diketahui";
        sks = 0;
        jumlahJam = 0;
    }

    public MataKuliah08(String kodeMK, String namaMK, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tampilkanInformasi() {
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + namaMK);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    public void ubahSks(int sksBaru) {
       sks = sksBaru;
       System.out.println("SKS berhasil diubah menjadi: " + sks);
    }

    public void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah Jam berhasil ditambah menjadi: " + jumlahJam);
    }

    public String kurangiJam(int jam) {
        if (jam < jumlahJam) {
            return "Jumlah jam yang dikurangi melebihi jumlah jam yang tersedia.";
        } else {
            jumlahJam -= jam;
            return "Jumlah Jam berhasil dikurangi menjadi: " + jumlahJam;
        }
    }

}
