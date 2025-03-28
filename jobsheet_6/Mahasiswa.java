package jobsheet_6;

public class Mahasiswa {
    String nim,nama,kelas;
    double ipk;

    Mahasiswa(){

    }

    Mahasiswa(String nama,String kelas,String nim,double ip){
        this.nim = nim;
        this.nama = nama;
        this.ipk = ip;
        this.kelas = kelas;

    }

    void tampilkaninformasi(){
        System.out.println("Nama : "+nama);
        System.out.println("NIM : "+nim);
        System.out.println("Kelas : "+kelas);
        System.out.println("IPK : "+ipk);
    }
}
