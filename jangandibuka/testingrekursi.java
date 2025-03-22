public class testingrekursi {

    public static int rekursif(int a){
        if(a==1){
            return 1;
        }
        return a+a*rekursif(a-1);
        
    }
    public static void main(String[] args) {
        int angka = 5;

        int halo = rekursif(2);
        System.out.println(halo);
    }
}
