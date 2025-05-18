package jobsheet_9;

public class StackTugasMahasiswa10 {
    Mahasiswa10[] stack;
    int top;
    int size;

    public StackTugasMahasiswa10(int size){
        this.size = size;
        stack = new Mahasiswa10[size];
        top = -1;
    }

    public boolean IsFull(){
        if(top==size-1){
            return true;
        }
        else{
            return  false;
        }
    }

    public  boolean IsEmpty(){
        if(top == -1){
            return true;
        }
        else {
            return false;
        }
    }



    public void push(Mahasiswa10 mhs){//fungi masukan data ke stack
        if(!IsFull()){
            top++;
            stack[top] = mhs;
            System.out.println("Tugas Mahasiswa "+mhs.nama+" Berhasil dikumpulkan.");
        }
        else {
            System.out.println("Tugas Mahasiswa "+mhs.nama+" Gagal dikumpulkan.");
        System.out.println("Stack penuh! tidak bisa menambahkan tugas lagi");
        }
    }

    public Mahasiswa10 pop(){//fungsi menilai
    if(!IsEmpty()){
        Mahasiswa10 m = stack[top];
        top--;
        return m;
    }
    else {
        System.out.println("Stack kosong! tidak ada tugas untuk di nilai");
        return null;
    }

    }

    public Mahasiswa10 peek(){//fungsi melihat mahasiswa yang mengumpulkan terakhir
        if(!IsEmpty()){
            return stack[top];
        }
        else {
            System.out.println("Stack kosong tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public Mahasiswa10 peekterbawah(){//fungsi melihat mahasiswa rajin(yg mengumpulkan pertama)
        if(!IsEmpty()){
            return stack[0];
        }
        else {
            System.out.println("Stack kosong tidak ada tugas yang dikumpulkan");
            return null;
        }
    }
    public void print(){//fungsi cetak seluruh data
        System.out.println();//jangan di HAPUS NGEBUG NANTI
        for (int i = 0; i <= top ; i++) {
            System.out.printf("%-15s %-15s %-15s \n",stack[i].nama,stack[i].nim,stack[i].kelas);
        }
        System.out.println();
    }

    public int BerpaBanyakTugasYangSudahDikumpulkan(){
        System.out.println();//jangan di HAPUS NGEBUG NANTI
        int hitungan=0;
        for (int i = 0; i <= top ; i++) {

            if(stack[i].nama == null && stack[i].kelas == null && stack[i].nim == null){//default value string adalah null

            }else{
                hitungan++;
            }
        }
        System.out.println();
        return hitungan;

    }
}
