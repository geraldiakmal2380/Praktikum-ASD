package jobsheet_2;

public class Dosenmain {
    

    public static void main(String[] args) {
        Dosen namaobjek = new Dosen();
        namaobjek.idDosen = "VNV";
        namaobjek.nama = "Vivi Nur Wijayaningrum, S.Kom, M.Kom";
        namaobjek.StatufAktif = true;
        namaobjek.tahunbergabung = 2017;
        namaobjek.bidangkeahlian = "Dasar Pemrograman & Algoritma";
        namaobjek.tampilkaninformasi();
        namaobjek.hitungmasakerja(2025);
        namaobjek.ubahkeahlianbidang("Pemasak restoran handal");
        namaobjek.tampilkaninformasi();
    }
}
