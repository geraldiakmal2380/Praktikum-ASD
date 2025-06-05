package P2Jobsheet10;

public class AntrianLayanan {
    Mahasiswa[] data;
    int front;//pointer yang valuenya nambah ketika ada angka dikeluarkan
    int size;//utk mengecek isEmpty dan teman-temannya
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
            System.out.println("Atrian masih kosong");
            return null;
        }
        //kode dibawah tidak akan dieksekusi ketika isEmpty adalah true karena sudah return null
        Mahasiswa mhs = data[front];
        front = (front+1)%max;
        size--;
        return  mhs;
    }

    public void lihatTerdepan(){
        if(isEmpty()){
            System.out.println("antrian kosong");
        }
        else {
            System.out.println("Mahasiswa terdepan : ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkandata();
        }
    }

    public void tampilkanSemua(){
        if(isEmpty()){
            System.out.println("Antrian kosong");
        }
        System.out.println("Daftar mahasiswa antrian : ");
        System.out.println("NIM - NAMA - PRODI - KELAS");

        for (int i = 0; i <size; i++) {
            int index = (front+i) % max;
            System.out.print((i+1)+".");
            data[index].tampilkandata();
        }
    }

    public int getJumlahAntrian(){
        return size;
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