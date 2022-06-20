public class Node<T> {
  private T dato;
  public Node(T dato){
    this.dato= dato;
  }
  public T getDato(){
    return dato;
  }
  public void setDato(T x){
    this.dato = x;
  }
  public String toString(){
    return ""+this.dato;
  }
}
