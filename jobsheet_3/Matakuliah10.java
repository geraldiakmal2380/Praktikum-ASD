package jobsheet_3;

public class Matakuliah10 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahjam;

    MatakuliahDemo10 a = new MatakuliahDemo10();

    public Matakuliah10(){

    }
    public Matakuliah10(String kode,String nama,int sks,int jumlahjam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahjam = jumlahjam;
    }
        void cetakinfo(Matakuliah10[] array,int loop){
        System.out.println("Data mata kuliah ke-"+(loop+1));
        System.out.println("kode       :  "+array[loop].kode); 
        System.out.println("Nama       :  "+array[loop].nama);   
        System.out.println("SKS        :  "+array[loop].sks); 
        System.out.println("JUmlah jam :  "+array[loop].jumlahjam); 
        } 
    
    
    }
    

