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

    void selectionsort(){
        for(int i=0;i<listmhs.length-1;i++){
            int idxmin = i;
            //mencari angka terkecil
            for(int j=i+1;j<listmhs.length;j++){
                if(listmhs[j].ipk<listmhs[idxmin].ipk){
                    idxmin =j;
                }
            }
            Mahasiswa tmp = listmhs[idxmin];
            listmhs[idxmin] = listmhs[i];
            listmhs[i] = tmp;
        }

        
    }

    void bubbleSort(){
        int n = listmhs.length;
        boolean sorting = false;
        do{
            sorting = false;
            for(int i=1;i<n;i++){
                if(listmhs[i].ipk>listmhs[i-1].ipk){
                    Mahasiswa tmp = listmhs[i];
                    listmhs[i] = listmhs[i-1];
                    listmhs[i-1] = tmp; 
                    sorting = true;
                }  
            }
            n--;
        }while(sorting);
    }

    void insertionsort(){
        for(int i=1;i<listmhs.length;i++){
            Mahasiswa temp = listmhs[i];
            int j = i ;
            while(j>0 && listmhs[j-1].ipk<temp.ipk){
                listmhs[j] = listmhs[j-1];
                j--;
            }
            listmhs[j] = temp;

        }
    }

    void tampil(){
        for(Mahasiswa m :listmhs){
        m.tampilkaninformasi();
        System.out.println("-------------------");
        }
    }
}
