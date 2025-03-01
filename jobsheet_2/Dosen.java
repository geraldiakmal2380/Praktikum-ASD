package jobsheet_2;

public class Dosen {
    String idDosen ;
    String nama;
    boolean StatufAktif;
    int tahunbergabung;
    String bidangkeahlian;

    void tampilkaninformasi(){
        System.out.printf("%-20s %s %s \n","IdDosen ",":",idDosen);
        System.out.printf("%-20s %s %s \n","nama ",":",nama);
        System.out.printf("%-20s %s %b \n","Status AKtif ",":",StatufAktif);
        System.out.printf("%-20s %s %d \n","tahun bergabung ",":",tahunbergabung);
        System.out.printf("%-20s %s %s \n","bidang keahlian ",":",bidangkeahlian);
    }
    void SetStatucActive(boolean statusaktif){
        StatufAktif = statusaktif;

    }
    void hitungmasakerja(int thnskrg){
        System.out.println("Total tahun kerja adalah "+(thnskrg-tahunbergabung));

    }
    void ubahkeahlianbidang(String bidang){
        bidangkeahlian = bidang;
    }

}
