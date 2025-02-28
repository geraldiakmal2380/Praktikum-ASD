package jobsheet_2;

public class MahasiswaMain10 {

    public static void main(String[] args) {
        mahasiswa mhs1 = new mahasiswa();//ini adalah constructor
        
        mhs1.nama = "Geraldi Akmal Syandana";
        mhs1.kelas = ("TI 1b");
        mhs1.nim = "24410727";
        mhs1.ipk = 3.55;
        mhs1.tampilkaninformasi();
        mhs1.ubahkelas("TI 1I");
        mhs1.updateipk(5);
        System.out.println(mhs1.test);
        mhs1.tampilkaninformasi();
        System.out.println(mhs1.nilaikinerja());
        System.out.println("======================================");
        mahasiswa mhs2 = new mahasiswa("Geraldi Akmal","210983",3.3,"TI 1b");
        mhs2.updateipk(5);
        mhs2.tampilkaninformasi();

        mahasiswa mhsgeraldi = new mahasiswa("gerdu","8288",2.4,"Ti 1b");
    }
}
