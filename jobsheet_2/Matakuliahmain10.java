package jobsheet_2;

public class Matakuliahmain10 {
    
    public static void main(String[] args) {
        MataKuliah10 ok = new MataKuliah10();
        ok.kodeMK= "CTPS";
        ok.nama = "Critical Thinking";
        ok.jumlahjam = 12;
        ok.sks = 2;
        ok.tampilkaninfromasi();
        System.out.println("==================");
        ok.ubahSKS(90);
        ok.tambajam(9);
        ok.tampilkaninfromasi();
        System.out.println("==================");
        ok.kurangijam(9);
        ok.tampilkaninfromasi();


        
    }

}
