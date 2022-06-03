public class LinkedList<E> implements Lista<E>{
  private Node<E> first;
  private int size;

  public LinkedList(){
    this.first = null;
    this.size = 0;
  }
  public boolean isEmpty(){
    return this.first == null;
  }
  public void insertFirst(E x){
    System.out.println("se inserta al principio"+x);
    /*Node <E> temp = new Node<E>(x);
      temp.setNext(this.first);
      this.first = temp;*/
    this.first = new Node<E>(x, this.first);
    size++;

  }
  public void insertLast(E x){
    System.out.println("se inserta al final "+x);
    if (isEmpty()) insertFirst(x);
    else {
      Node <E> aux = this.first;
      for(;aux.getNext()!= null;aux = aux.getNext()){}//Correcto : Recorrido de nodos
      aux.setNext( new Node<E>(x));
      System.out.println("Nodo: "+aux);
    }
    size++;
  }
  public boolean search(E x){
    Node<E> aux = this.first;
    while (aux != null && !aux.getD().equals(x)){
      aux = aux.getNext();
    }
    if (aux != null) return true;
    return false;
  }
  public void remove(E x){
    System.out.println("se eliminara a "+x);
    Node <E> aux = this.first;
    if(aux == null){
      System.out.println("esta vacio");
    }
    else{
      if(aux.getD().equals(x)) this.first = aux.getNext();
      while (aux.getNext()!= null && !aux.getNext().getD().equals(x)){
	aux = aux.getNext();
      }
      aux.setNext(aux.getNext().getNext());
    }

    /*if(search(x)){
      Node <E> aux = this.first;
      for(;aux.getNext()!= null;aux = aux.getNext()){
      if(aux.getNext().getD().equals(x)){
      aux.setNext(aux.getNext().getNext());
      break;
      }
      }
    }
    else{
    System.out.println("no se encontro;");
    }
    size--;*/
  }
  public void insertK(E x, int k){
    System.out.println("insertara a "+ x +" en la posiccion "+k);
    //nodo anterior de l
    if ( k==0){
      this.insertFirst(x);
    }else {
      Node <E> anterior = searchIndex(k-1);
      if(anterior == null){
	System.out.println("indice no encontrado");
      }
      else{
	anterior.setNext(new Node<E>(x,anterior.getNext().getNext()));
      }
      //Node <E> auxPosterior = anterior.getNext();
      //anterior.setNext(new Node<E>(x,anterior));

    }

  }

  public Node<E> searchIndex(int indice){
    //System.out.println("se busca en el indice :"+indice);
    int contador = 0;
    Node<E> aux = this.first;
    while (indice >=0 && aux != null && contador != indice){
      aux = aux.getNext();
      contador++;
      //System.out.println("uind"+contador+","+indice);
    }
    if (aux != null) return aux;
    return null;
    /*int contador = 0;
      Node <E> aux = this.first;
      if(aux==null) return null;
      for(;aux.getNext()!= null;aux = aux.getNext()){
      if(contador == indice) {
      return aux;
      }
      contador++;
    //System.out.println("contador"+contador);
      }
      if(contador == this.size-1)return aux;
      return null;*/
  }
  public String toString(){
    String str = "{";
    for(Node<E> aux = this.first; aux !=null;aux = aux.getNext()){
      //System.out.println("entro");
      str += aux.getD();
      if(aux.getNext() !=null) str += ",";
    }
    str += "}";
    return str;
  }
  public int getSize(){
    return this.size;
  }
}
