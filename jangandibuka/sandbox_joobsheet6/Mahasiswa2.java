package sandbox_joobsheet6;
public class Mahasiswa2 {
    public static void main(String[] args) {
    Mahasiswa m1 = new Mahasiswa("andre",123);
    Mahasiswa m2 = new Mahasiswa("andre v2",124);

    Mahasiswa iniobjk = new Mahasiswa();

    iniobjk.tambahdata(m1);
    iniobjk.tambahdata(m2);
        iniobjk.printdata();

    }

}
