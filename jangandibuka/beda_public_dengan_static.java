

public class beda_public_dengan_static {
    static void methodstatic(){
        System.out.println("Method atau fungsi static bisa dipanggil tanpa membuat object");
    }
    public void methodpublic(){
        System.out.println("Method atau fungsi public harus dipanggil dengan membuat object terlebih dahulu");
    }

    public static void main(String[] args) {
        //ini cara memanggil method static
        methodstatic();

        //ini cara memanggil method public
        beda_public_dengan_static iniobjek = new beda_public_dengan_static();
        iniobjek.methodpublic();
    }
}
