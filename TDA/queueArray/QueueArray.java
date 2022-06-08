public class QueueArray<E> implements Queue<E>{
  private E[] array;
  int front;
  int back;
  int numElem;
  @SuppressWarnings("unchecked")
  public QueueArray(int n){
    this.array = (E[]) new Object[n];
    this.numElem = 0;
    this.back = -1;
  }
  public void enqueue(E x){
    if(numElem == array.length){
      System.out.println("lleno");
    }else{
      back =  ++back % (array.length);
      this.array[back] = x;
      numElem ++;
    }
  }
  public E dequeue()throws ExceptionIsEmpty{
    if (isEmpty()){
      throw new ExceptionIsEmpty("cola vacia");
    }
    int aux =this.front;
    System.out.println("front "+front);
    System.out.println("tama "+array.length);

    front = ++front % (array.length);
    System.out.println("front "+front);
    numElem--;
    return this.array[aux];
  }

  public E front() throws ExceptionIsEmpty{
    if (isEmpty()){
      throw new ExceptionIsEmpty("cola vacia");
    }
    return array[front];
  }
  public E back() throws ExceptionIsEmpty{
    if (isEmpty()){
      throw new ExceptionIsEmpty("cola vacia");
    }
    return array[back];
  }
  public boolean isEmpty(){
    return numElem==0;
  }
  public String toString(){
    String str = "{";
    try {

      System.out.println("front: "+this.front());
      System.out.println("back: "+this.back());
    }catch (ExceptionIsEmpty x){
      System.out.println(x.getMessage());
    }
    for( int i =front; i < this.array.length && array[i]!=null; i++){
      str += this.array[i];
      if (i != back) str+= ",";
    }
    str += "}";
    return str+ "size: "+this.numElem;
  }
}
