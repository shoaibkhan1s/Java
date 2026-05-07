

public class CustomQueue {
protected int[] data;
private static final int DEFAULT_SIZE= 10;
int end =0;
public CustomQueue(){
    this(DEFAULT_SIZE);
}

public CustomQueue(int size){
    this.data = new int[size];
}

public boolean insert(int elem){
    if (isFull()) {
        System.out.println("queue is full");
        return false;
    }

    data[end++] = elem;
    return true;
}

public int remove() throws Exception{
    if (isEmpty()) {
        throw new Exception("Queue is empty");
    }

    int removed  = data[0];
    for (int i = 1; i < end; i++) {
        data[i-1] = data[i];
    }
    end--;
    return removed;
}

public int front() throws Exception{
    if (isEmpty()) {
        throw new Exception("Queue is empty");
    }
    return data[0];
}


public void display() throws Exception{
if (isEmpty()) {
    throw new Exception("Queue is empty");
}

for(int i=0;i<end;i++){
    System.out.print(data[i] + " <- ");
}
System.out.println("END");
}




public boolean isFull(){
    return end == data.length;
}

public boolean isEmpty(){
    return end==0;
}

public static void main(String[] args) throws Exception {
  CustomQueue q = new CustomQueue(3);
  q.insert(5);
  q.insert(10);
  q.insert(15);

  q.display();

  q.remove();

  q.display();
}

}
