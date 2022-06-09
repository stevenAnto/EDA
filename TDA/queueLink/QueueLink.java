public class QueueLink <T> implements Queue<T>{
  private Node<T> front; 
  private Node<T> back; 

  public QueueLink(){
    front = back =null;
  }
  public void enqueue (T x){
    if (isEmpty()) front=back = new Node<T>(x);
    else {
      back.setNext(new Node<T>(x));
      back = back.getNext();
    }

  }
  public T dequeue ()throws ExceptionIsEmpty{
    if (isEmpty()){
      throw new ExceptionIsEmpty("cola vacia");
    }
    T aux = front.getD();
    front = front.getNext();
    return aux;
  }
  public T front() throws ExceptionIsEmpty{
    if (isEmpty()){
      throw new ExceptionIsEmpty("cola vacia");
    }
    return front.getD();
  }
  public T back()throws ExceptionIsEmpty{
    if (isEmpty()){
      throw new ExceptionIsEmpty("cola vacia");
    }
    return back.getD();
  }
  public boolean isEmpty(){
    return front == null;
  } 
  public String toString(){
    String str = "{";
    for(Node<T> aux = front; aux !=null;aux = aux.getNext()){
      //System.out.println("entro");
      str += aux.getD();
      if(aux.getNext() !=null) str += ",";
    }
    str += "}";
    return str;
  }
}
