package joobsheet_7;

public class MahasiswaDemo10 {
    public static void main(String[] args) {
        MahasiswaBerprestasi10 list = new MahasiswaBerprestasi10();
        int jumMhs=5;

        for(int i=0;i<jumMhs;i++){
            String nim="c";
            String nama="b";
            String kelas = "a";
            String ip = "3.14";
            Double ipk = Double.parseDouble(ip);

            list.tambah(new Mahasiswa10(nim,nama,kelas,ipk));
            
        }
        list.tampil();
    }
}
