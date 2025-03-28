package jobsheet_6;

public class MahasiswaBerprestasi {
    Mahasiswa[] listmhs = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m){
    if (idx<listmhs.length){
        listmhs[idx] = m;
        idx++;
    }else{
        System.out.println("Data sudah penuh");
    }
    }

    void bubbleSort(){
        int n = listmhs.length;
        boolean sorting = false;
        do{
            sorting = false;
            for(int i=1;i<n-1;i++){
                Mahasiswa tmp = listmhs[i];
                listmhs[i] = listmhs[i-1];
                listmhs[i-1] = tmp; 
                sorting = true;
            }
            n--;
        }while(sorting);
    }

    void tampil(){
        for(Mahasiswa m :listmhs){
        m.tampilkaninformasi();
        System.out.println("-------------------");
        }
    }
}
