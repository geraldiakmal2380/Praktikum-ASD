public class urutkanarray {

    static void cetak(int[] a){
        for(int s :a ){
            System.out.print(s);
            System.out.print(" ");
        }
        System.out.println();
    }

    static void metodeinsertion(int[] b){
       int n = b.length;
       
        
       for(int i=1;i<n;i++){
        int key = b[i];//13
        int j = i-1;//11

        while (j>=0 && b[j] > key) {
            b[j+1] = b[j];
            j--;
            cetak(b);
        }
       }

        
    }

    static void metodebuble(int[] a){
        int temp =0;
        int panjang= a.length;
        boolean proses=false;

        do{
            proses = false;
            for(int i=0;i<panjang-1;i++){
                if(a[i]>a[i+1]){
                    temp =a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    proses = true;
                }
            }panjang--;
        }while(proses); 
        

    }
    public static void main(String[] args) {
        int a[] = {7,3,6,5,1}; 
        int b[] = {11, 11, 13, 5, 6};
        metodebuble(a);
        metodeinsertion(b);
        //cetak(a);
        cetak(b);
    }
}
