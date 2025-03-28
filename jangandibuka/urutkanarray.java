public class urutkanarray {

    static void cetak(int[] a){
        for(int s :a ){
            System.out.print(s);
            System.out.print(" ");
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
        int a[] = {5,3,6,7,1}; 

        metodebuble(a);
        cetak(a);
    }
}
