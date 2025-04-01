package jobsheet_6;

public class dosen {
    String kode,nama;
    Boolean jeniskelamin;
    int usia;
    int id = 0;
    dosen[] test = new dosen[2];        
    int n = test.length;
    dosen(){

    }

    dosen(String kd,String name,Boolean jk,int age){
        kode = kd;
        nama = name;
        jeniskelamin =jk ;
        usia = age;
    }

    void tambahdata(dosen a){
        if(id<n){
            test[id] = a;
            id++;
        }else{
            System.out.println("Maaf data sudah penuh dan tidak menerima data lagi");
        }
    }

    void tampil(){
        System.out.printf("%-8s %-15s %-10s %-4s \n","Kode","Nama ","gender","Usia");
        System.out.println(kode);
        for(dosen z : test ){
            String gender = null;
            if(jeniskelamin){
                gender = "laki2";
            }
            else{
                gender = "perempuan";
            }
           System.out.printf("%-8s %-15s %-10s %-2d",z.kode,z.nama,gender,z.usia);
        }   
    }
}
