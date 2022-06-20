public class HeapArray<T extends Comparable<T>>{
  private Node<T> [] arbol;
  private int n;
  @SuppressWarnings("unchecked")
  public HeapArray(int length){
    //No puedo caster objetos que se restrinjan a ser Comparables y ademas Object no apunta a objeto comparable. El casteo descendente solo es posible si dicho objeto superclase apunta a una subclase
   // this.arbol = (Node<T>[]) new Object[length];
    arbol = new Node [length+1];
  }
  public void insert(Node<T> item){
    arbol [++n] = item;
    Node<T> temp;
    for (int j = n; j>1&& (arbol[j].getDato().compareTo(arbol[j/2].getDato()))>0 ;j/=2){
      //intermcabio
      temp = arbol[j];
      arbol[j] =arbol[j/2];
      arbol[j/2] =temp;
    }
  }
  public T padre(int i){
    System.out.println("padre");
    return arbol[i/2].getDato();
  }
  public T izquierda(int i){
    System.out.println("izquierda");
    return arbol[2*i].getDato();
  }
  public T derecha(int i){
    System.out.println("dercha");
    return arbol[2*i+1].getDato();
  }
  public String toString(){
    String str = "";
    for  (int i =0; i<=n;i++){
      str += arbol[i]+",";
    }
    return str;
  }
}
