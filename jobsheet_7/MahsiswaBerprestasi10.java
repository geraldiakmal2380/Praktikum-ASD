package jobsheet_7;

public class MahsiswaBerprestasi10 {
    int idx;
    Mahasiswa10[] listmhs = new Mahasiswa10[5];
    Mahasiswa10 object = new Mahasiswa10();
  
    void tambah(Mahasiswa10 mhs){
        if(idx<listmhs.length){

        }else{
            System.out.println();
        }
    }

    void tampil(){

    }

    int sequentialsearch(double cari){
        int posisi = -1;
        for(int j=0;j<listmhs.length;j++){
            if(listmhs[j].ipk==cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilposisi(double x,int pos){
        if(pos!=-1){
            System.out.println("Data Mahasiswa dengan IPK : "+x+" Ditemukan pada Index "+pos);
        }else{
            System.out.println("data "+x+" tidak ditemukan");
        }
    }

    void tampildatasearch(double x,int pos){
        if(pos !=-1){
            System.out.println("nim\t : "+listmhs[pos].nim);
            System.out.println("Nama\t : "+listmhs[pos].nama);
            System.out.println("Kelas\t : "+listmhs[pos].kelas);
            System.out.println("IPK\t : "+x);
        }else{
            System.out.println("Data Mahasiswa dengan IPK "+x+" Tidak ditemukan");
        }
    }


}
