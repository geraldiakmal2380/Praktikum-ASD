package jobsheet_2;

public class MataKuliah10 {
    String kodeMK,nama;
    int jumlahjam,sks;
    
    

    void tampilkaninfromasi(){
        System.out.println("KODE MK : "+kodeMK);
        System.out.println("Nama Lengkap Matkul : "+nama);
        System.out.println("Jumlah Jam : "+jumlahjam);
        System.out.println("SKS : "+sks);
    }
    
    void ubahSKS(int sksbaru){
        sks = sksbaru;
    }

    void tambajam(int jam){
        jumlahjam = jumlahjam+jam;
    }

    void kurangijam(int jam){
        jumlahjam = jumlahjam-jam;
    }
    
}
