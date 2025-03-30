package sandbox_joobsheet6;
public class Mahasiswa {
    int nim,id=0;
    String nama;
    Mahasiswa[] list = new Mahasiswa[2];
    Mahasiswa(){

    }

    Mahasiswa(String nama,int nim){
        this.nama = nama;
        this.nim = nim;
    }

    void tambahdata(Mahasiswa m){
        list[id] = m;
        id++;
    }

    void printdata(){
        for(Mahasiswa m : list){
            System.out.println("Nama "+m.nim+" "+"Id : "+m.nim);
        }
    }
}
