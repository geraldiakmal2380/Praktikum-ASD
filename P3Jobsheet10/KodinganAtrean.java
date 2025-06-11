package P3Jobsheet10;

public class KodinganAtrean {
    Mahasiswa[] data;
    int PointerFront;
    int PointerRear;
    int size;
    int max;

    KodinganAtrean(int ukuran){
        max = ukuran;
        PointerFront = -1;
        PointerRear = 0;
        size = 0;
        data = new Mahasiswa[ukuran];
    }

    public void tambahMahasiswa(Mahasiswa objectMasuk){
        if(isFull()){
            System.out.println("Antrian sudah penuh");
        }
        else {
            PointerRear = (PointerRear +1)%max;
            data[PointerRear] = objectMasuk;
            size++;
            System.out.println("Data mahasiswa "+objectMasuk.nama+" berhasil masuk");
        }

    }

    public Mahasiswa layaniMahasiswa(){
        if(isEmpty()){
            System.out.println("Antrian masih kosong");
            return null;
        }else {
            Mahasiswa mhmm = data[PointerFront];
            size--;
            PointerFront = (PointerFront+1)%max;
            return mhmm;
        }
    }

    boolean isFull(){
        if (size==max){
            return true;
        }else {
            return false;
        }
    }
    boolean isEmpty(){
        if(size==0){
            return true;
        }else{
            return false;
        }
    }
}
