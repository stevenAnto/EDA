public class Node<E>{
  private E data;
  private Node<E> left;
  private Node<E> right;
  //private Node<E> precedent;

  public Node(E data, Node<E> left, Node<E> right){
    this.data = data;
    this.left = left;
    this.right = right;
  }
  public Node(E data){
    this(data,null,null);
  }
  public E getD(){
    return this.data;
  }
  public void setData(E data) {
    this.data = data;
  }
  public Node<E> getLeft(){
    return this.left;
  }
  public void setLeft(Node<E> next){
    this.left = next;
  }
  public Node<E> getRight(){
    return this.right;
  }
  public void setRight(Node<E> next){
    this.right = next;
  }
  public int size(Node<E> x){
    if( x==null)return 0;
    else{
      return 1+ size(x.left)+ size(x.right);
    }
  }
  public int height(Node<E> x){
    if( x==null)return -1;
    else{
      return 1+Math.max(height(x.left),height(x.right)) ;
    }
  }
  public String toString(){
    return this.data.toString();
  }
}
