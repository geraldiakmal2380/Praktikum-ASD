package jobsheet_6;

public class sorting10 {
    int[] data;
    int jumdata;

    sorting10(int Data[],int jmldata){
        jumdata = jmldata;
        data = new int[jmldata];

        for(int i=0;i<jumdata ; i++){
            data[i] = Data[i];
        }
    }

    void bubleshort(){
        int temp=0;
        for(int i=0;i<jumdata-1;i++){
            for(int j=1;j<jumdata-i;j++){
                //tampil();
                //System.out.println("Menukar "+data[j]+" dengan "+data[j-1]);
                if(data[j-1]>data[j]){
                    temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
            }
        }
    }

    void selectionsort(){
        for(int i=0;i<jumdata-1;i++){//jumdata-1=4
            int min=i;
            //mencari angka terkecil mulai dari index 1-4
            for(int j=i+1;j<jumdata;j++){
                if(data[j]<data[min]){
                    min=j;
                    //System.out.println("value j "+j);
                    /*penjelasan di bawah sini
                     j=1,min=0
                     20<30? Y
                     min=j >> min = 0 >> 1

                     j=2,min=1
                     2<20? Y
                     min=j >> min = 0 >> 2

                     j=3,min=2
                     8 <2? N
                     MIN TETAP

                     j=4,min=2
                     14<2 ? N
                     MIN TETAP

                     lanjut ke bawah karena jumdata adalah 5

                     loop berikutnya dst hingga i mentok

                     */
                }
            }
            int temp=data[i];
            //System.out.println("data ke-"+i+" menjadi data ke-"+min);
            data[i]=data[min];
            data[min] = temp;
            //tampil();

        }
        
        
    
    }
    void insertionsort(){
        for(int i=1;i<=data.length-1;i++){
            int temp = data[i];
            int j=i-1;

            while(j>=0 && data[j]>temp){
                data[j+1] = data[j];
                j--;
            }
            data[j+1]=temp;
        }
    }
    void tampil(){
        for(int i=0;i<jumdata;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
}
