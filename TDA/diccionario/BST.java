public class BST <E extends Comparable<E>>{
  class Node{
    protected E data;
    protected Node left;
    protected Node right;
    public Node(E data, Node left, Node right){
      this.data = data;
      this.left = left;
      this.right = right;

    }
    public Node (E data){
      this(data,null, null);
    }
  }
  private Node root;

  public BST(){
    this.root = null;
  }
  public boolean isEmpty(){
    return this.root == null;
  }

  public void insert(E x)throws ItemDuplicated{
    this.root = insertRec(x, this.root);
  }
  private Node insertRec(E x,Node current )throws ItemDuplicated{
    Node resC = current;
    if(current == null) {
      resC = new Node(x);
    }
    else{
      int resCom = current.data.compareTo(x);
      if(resCom == 0) throw new ItemDuplicated("El dato "+x+ "ya fue insertado");
      if (resCom < 0){
	resC.right = insertRec(x, current.right);
      }
      else {
	resC.left = insertRec(x, current.left);
      }
    }
    return resC;

  }
  public String toString(){
    if(isEmpty()) return "Arbol vacio..";
    return inOrden(this.root);
  }
  private String postOrden(Node current){
    String str = "";
    if(current.left != null) str += postOrden(current.left);
    if(current.right != null) str += postOrden(current.right);
    str += current.data.toString() + ",";
    return str;
  }
  private String preOrden(Node current){
    String str = "";
    str += current.data.toString() + ",";
    if(current.left != null) str += preOrden(current.left);
    if(current.right != null) str += preOrden(current.right);
    return str;
  }
  private String inOrden(Node current){
    String str = "";
    if(current.left != null) str += inOrden(current.left);
    str += current.data.toString() + ",";
    if(current.right != null) str += inOrden(current.right);
    return str;
  }
  public E search(E x) throws ItemNoFound{
    Node res = searchNode(x, this.root);
    if(res == null){
      throw new ItemNoFound("el dato "+x+" no esta");
    }
    return res.data;

  }
  protected Node searchNode(E x, Node n){//do it
    if(n == null){
      return null;
    }
    else{
      int resC = n.data.compareTo(x);
      if(resC <0 )return searchNode(x, n.right);
      else if(resC > 0)return searchNode(x, n.left);
      else return n;
    }
  }
  public E minRecover(){
    if(isEmpty()){
      System.out.println("esta vacio");
      return null;
    }
    else{
      Node aux = this.root;
      while(aux.left != null){
	aux = aux.left;
      }
      return aux.data;
    }
  }
  public E minRemove(){
    E min = minRecover(); //obtengo el minimo
    this.root = minRemove(this.root);
    return min;
  }
  public E minRecover(Node current){
    if(current ==null){
      return null;
    }
    else{
      Node aux = current;
      while(aux.left != null){
	aux = aux.left;
      }
      return aux.data;
    }
  }
  protected Node minRemove(Node current){
    if(current.left != null){
      current.left = minRemove(current.left);
    }
    else{
      current = current.right;//el hijo es adoptado por el abuelo
    }
    return current;
  }

  public void remove(E x) throws ItemNoFound{
    this.root = removeNode(x, this.root);
  }
  protected Node removeNode(E x, Node current)throws ItemNoFound{
    Node res = current;
    if(current == null)throw new ItemNoFound(""+x+"no esta");
    int resC = current.data.compareTo(x);
    if(resC < 0) res.right = removeNode(x, current.right);
    else if(resC > 0 ){
      res.left =removeNode(x, current.left);
    }
    else if (current.left != null && current.right != null){//dos hijos
      res.data = minRecover(current.right); //sucesor : uno derecha y  luego todo izquierda
      res.right = minRemove(current.right);  //elimina el elemento intercambiado
    }else {
      res = (current.left != null) ? current.left : current.right;//un hijo
    }
    return res;
  }

}
