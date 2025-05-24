package jobsheet_9;

public class StackKonversi10 {
    int[] tumpukanbenir;
    int size;
    int top;

    public StackKonversi10(){
        this.size = 32;
        tumpukanbenir = new int[size];
        top=-1;
    }

    public boolean isEmpty(){
        return  top==-1;
    }

    public boolean isFull(){
        return top == size -1;
    }

    public void push(int data){
        if(isFull()){
            System.out.println("Stack telah penuh");
        }
        else {
            top++;
            tumpukanbenir[top] = data;
        }
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack kosong.");
            return -1;
        }
        else {
            int data = tumpukanbenir[top];
            top--;
            return data ;
        }
    }
}
