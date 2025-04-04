package joobsheet_7;

public class MahasiswaBerprestasi10 {
    Mahasiswa10[] listMhs = new Mahasiswa10[5];
    int idx;

    void tambah(Mahasiswa10 mhs){

    }

    void tampil(){

    }

    int sequentialsearch(double cari){
        int posisi=-1;
        for(int j=0;j<listMhs.length;j++){
            if(listMhs[j].ipk==cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilposisi(double x,int pos){
        if(pos !=-1){
            System.out.println("Data Mahasiswa dengan IPK :"+x+" Ditemukan pada index "+pos);
        }else{
            System.out.println("Data "+x+" tidak ditemukan");
        }
    }
    void tampilDataSearch(double x,int pos){
        if(pos !=-1){
        System.out.println("nim\t : "+listMhs[pos].nim);
        System.out.println("Nama\t : "+listMhs[pos].nama);
        System.out.println("Kelas\t : "+listMhs[pos].kelas);
        System.out.println("ipk\t : "+x);
        }else{
            System.out.println("Data mahasiswa dengan IPK "+x+" Tidak ditemukan");
        }
    }
}
