package P1jobsheet10;

public class Queue {
    int[] data;
    int front;//pointer yang valuenya nambah ketika ada angka dikeluarkan
    int size;//utk mengecek isEmpty
    int rear;//pointer yang valuenya nambah ketika ada angka baru masuk
    int max;

    public Queue(int n){
        max = n;
        data = new int[max];
        size = 0;
        front = rear =-1;
    }

    boolean isFull(){
        if(size== max){
            return true;
        }else {
            return false;
        }
    }

    boolean isEmpty(){
        if(size==0){
            return true;
        }else {
            return false;
        }
    }

    void enqueue(int dt){
        if (isFull()){
            System.out.println("Queue sudah penuh");
        }else {
            if(isEmpty()){
                front = rear = 0;//menggerakkan pointer front dan rear ke 0 saat pertama kali jalan
            }else {
                if(rear == max-1){
                    rear =0;//mengembalikan pointer rear ke 0 saat penuh
                }else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    int dequeuue(){
        int dt =0;
        if(isEmpty()){
            if(isEmpty()){
                System.out.println("Queue masih kosong");
            }
        }else {
            dt = data[front];
            size--;
            if (isEmpty()){
                front = rear =-1;
            }else {
                if (front == max -1){
                    front = 0;
                }else {
                    front++;//setelah mengahpus data pointer front akan dimajukan.Cek fungsi print untuk kegunaannya
                }
            }
        }
        return dt;
    }

    public void peek(){
        if(!isEmpty()){
            System.out.println("Elemen terdepan : "+ data[front]);
        }else {
            System.out.println("Queue masih kosong");
        }
    }

    void print(){
        if(isEmpty()){
            System.out.println("Queue masih kosong");
        }else {
            int i = front   ;
            while (i != rear){
                System.out.print(data[i] + " ");
                i = (i+1) % max;
            }
            System.out.println(data[i]+" ");
            System.out.println("Jumlah elemen = "+size);
        }
    }

    void clear(){
        if(!isEmpty()){
            front = rear =-1;
            size =0;
            System.out.println("Queue berhasil dikosongkan");
        }else {
            System.out.println("Queue masih kosong");
        }
    }
}
