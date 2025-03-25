package jobsheet_2;

public class mahasiswa {
    String test = "===========================";
    String nama,nim,kelas;
    double ipk;
    public mahasiswa(){
        
    }
    
    public mahasiswa(String nm,String nim,double ipk,String kls){
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }
    void tampilkaninformasi(){//method
        System.out.println("Nama : "+nama);
        System.out.println("NIM :"+nim);
        System.out.println("IPK :"+ipk);
        System.out.println("Kelas : "+kelas);
    }

    void ubahkelas(String kelasbaru){
        kelas = kelasbaru;
    }
    
    void updateipk(double ipkbaru){
        if(ipkbaru>=0 && ipkbaru<=4){
        ipk = ipkbaru;
        }
        else{
            System.out.println("IPK tidak valid");
        }
    }
    String nilaikinerja(){
       
            if(ipk >=3.5){
                return "kinerja sangat baik";
            }
            else if(ipk >=3){
                return "kinerja baik";
            }
            else if(ipk >=2){
                return "kinerja cukup";
            }
            else{
                return "Kinerja kurang";
            }
        }
        
    }
