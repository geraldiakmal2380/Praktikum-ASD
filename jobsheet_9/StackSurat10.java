package jobsheet_9;

public class StackSurat10 {
    Surat10[] stackSurat;
    int top;
    int size;

    public StackSurat10(int ukurane){
        size = ukurane;
        stackSurat = new Surat10[ukurane];
        top = -1;
    }

    public void push(Surat10 objmasuk){//push data ke dalam stack surat10[]
        if(!IsFull()){
            top++;
            stackSurat[top] = objmasuk;
            System.out.println("Surat dari "+objmasuk.NamaMahasiswa +" Berhasil di tambah");
            System.out.println("Kapasitas "+(top+1)+"/"+size);
        }else {
            System.out.println("Stack sudah penuh (5/5)");
        }

    }

    public void printsemua(){
        if(!IsEmpty()){
            System.out.printf("%-2s %-15s %-15s %-15s %-15s\n","ID","Nama","Kelas","Jenis Izin","Durasi");
            for (int i = 0; i <= top; i++) {
                System.out.printf("%-2s %-15s %-15s %-15C %-2d \n",stackSurat[i].idSurat,stackSurat[i].NamaMahasiswa,stackSurat[i].kelas,stackSurat[i].jenisIzin,stackSurat[i].durasi);
            }

        }else {
            System.out.println("Stack masih kosong");
        }
    }

    //IsFUll dan IsEmpty
    public boolean IsFull(){
        if(top==size-1){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean IsEmpty(){
        if(top==-1){

            return true;
        }else {
            return false;
        }
    }

}
