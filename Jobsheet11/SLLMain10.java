package Jobsheet11;

public class SLLMain10 {
    public static void main(String[] args) {
            singleLinkedList10 sll = new singleLinkedList10();
            Mahasiswa10 mhs1 = new Mahasiswa10();
            Mahasiswa10 mhs2 = new Mahasiswa10();
            Mahasiswa10 mhs3 = new Mahasiswa10();
            Mahasiswa10 mhs4 = new Mahasiswa10("123456789","lkjasdlk,jasdlkjasda","1b",3.14);

            sll.addFirst(mhs4);
            sll.print();
    }




}
