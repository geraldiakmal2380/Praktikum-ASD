package P2Jobsheet10;

public class AntrianLayanan {
    Mahasiswa[] data;
    int front;//pointer yang valuenya nambah ketika ada angka dikeluarkan
    int size;//utk mengecek isEmpty
    int rear;//pointer yang valuenya nambah ketika ada angka baru masuk
    int max;

    public AntrianLayanan(int max){
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear =-1;
        this.size = 0;
    }
    public void tambahanAntrian(Mahasiswa mhs){
        if(isFull()){
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa");
            return;
        }
        rear = (rear+1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama+" Berhasil masuk antrean");
    }

    public Mahasiswa layaniMahasiswa(){
        if(isEmpty()){
            //lanjutin besok
        }
    }

    boolean isFull(){
        if(size== max){
            return true;
        }else {
            return false;
        }
    }

    boolean isEmpty(){
        if(size==0){
            return true;
        }else {
            return false;
        }
    }
}