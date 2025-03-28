package jobsheet_6;

public class MahasiswaDemo10 {
    public static void main(String[] args) {
        MahasiswaBerprestasi list = new MahasiswaBerprestasi();
        Mahasiswa m1 = new Mahasiswa("Zidan","2A","123",3.2);
        Mahasiswa m2 = new Mahasiswa("Ayu","2A","124",3.5);
         Mahasiswa m3 = new Mahasiswa("Sofi","2A","125",3.1);
        Mahasiswa m4 = new Mahasiswa("Sita","2A","126",3.9);
        Mahasiswa m5 = new Mahasiswa("Miki","2A","127",3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa sebelum sorting : ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

    }
    

    
}
