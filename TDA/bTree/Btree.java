public class Btree<E extends Comparable<E>>{
  private BNode<E> root;
  private int orden;

  //variables de apoyo para insercion
  private boolean up;
  private BNode<E> nDes;

  public Btree(int orden){
    this.orden = orden;
    this.root = null;
  }

  public boolean isEmpty(){
    return this.root == null;
  }

  public boolean search(E cl){
    return search(this.root, cl);
  }

  private boolean search(BNode<E> current, E cl){
    int pos[] = new int [1];
    boolean fl;

    //Busqueda sin exito, bajo hasta el nodo hoja y no exite
    if(current == null){
      return false;
    }
    //Existe, y ahora buscamos dentro del nodo
    else{
      //Este metodo hace un busqueda secuencial, en el mismo Nodo
      fl = searchNode(current,cl,pos);
      if(fl){
	System.out.println("Se encontro "+cl+ "en posicion "+pos[0]);
	return true;
      }
      else{
	return search(current.childs.get(pos[0]),cl);
      }
    }
  }
  //Busqueda secuencial
  private boolean searchNode(BNode<E> current, E cl, int pos[]){
    pos[0]=0;
    while (pos[0]<current.count && current.keys.get(pos[0]).compareTo(cl)<0){
      pos[0]++;
    }
    if(pos[0]== current.count){
      return false;
    }
    return (cl.equals(current.keys.get(pos[0])));
  }

  public void  insert(E cl){
    up = false;
    E mediana;
    BNode<E> pnew;
    //devuvle una clave
    mediana = push(this.root,cl);
    //si la banderea sigue prendida por el push, implica que debemos crear una nueva raiz
    if(up){
      pnew = new BNode<E>(this.orden);
      pnew.count = 1;
      pnew.keys.set(0,mediana);
      pnew.childs.set(0,this.root);
      pnew.childs.set(1,nDes);
      this.root = pnew;
    }


  }

  private E push(BNode<E> current, E cl){
    //up hace salir de la recursividad sin hacer nada
    int pos[] = new int [1];
    E mediana;
    if(current == null){
      //up indica que si se puede insertar
      up= true;
      //?????
      nDes = null;
      //Estoy en un nulo, entonces retorno el padre
      return cl;
    }
    //el nodo si existe
    else{
      boolean fl;
      fl = searchNode(current,cl,pos);
      if(fl){
	System.out.println("Item Duplicated");
	// up ex una variable auxiliar, es como una bandera, se inicia con false
	up = false;
	return null;
      }
      //En caso no he encontrado la clave, me muevo
      //Devuelve la clase que se quiere insertar
      mediana = push(current.childs.get(pos[0]),cl);
      if(up){
	//dividir
	if(current.nodeFull(this.orden-1)){

	  mediana = divideNode(current,mediana,pos[0]);
	}
	else{
	  //Dicho nodo tiene capacidad
	  up = false;
	  //acomodar
	  putNode(current,mediana,nDes,pos[0]);
	}
      }
	return mediana;
    }
  }
//Coloca la clave
  private void putNode(BNode<E> current, E cl, BNode<E> rd, int k){
    int i;
    for(i = current.count-1; i>=k; i--){
      current.keys.set(i+1,current.keys.get(i));
      current.childs.set(i+2,current.childs.get(i+1));
    }
    current.keys.set(k, cl);
    current.childs.set(k+1,rd);
    current.count++;
  }

  private E divideNode(BNode<E> current, E cl, int k){
    BNode<E> rd = nDes;
    int i, posMdna;
    posMdna = (k <= this.orden/2) ? this.orden/2 : this.orden/2+1;

    nDes = new BNode<E>(this.orden);
    //mover a partir de la posicion de la mediana
    for(i = posMdna; i<this.orden-1; i++){
      nDes.keys.set(i-posMdna,current.keys.get(i));
      nDes.childs.set(i-posMdna+1,current.childs.get(i+1));
    }
    nDes.count = (this.orden-1)-posMdna;
    current.count = posMdna;

    //*La nueva mediana es la ultima clave del primer nodo el cual se ha dividido
    ///se convierte en el hijo cero del hermano:wq
    //
    if(k<= this.orden/2){
      putNode(current,cl,rd,k);
    }
    else{
      putNode(nDes,cl,rd,k-posMdna);
    }
    //Obtener nueva mediana, la ultima clave de la divion de Nodos
    E median = current.keys.get(current.count-1);
    //el ultimo hijo del Nodo que se divive va a ser el hijo cero del hermano
    nDes.childs.set(0,current.childs.get(current.count));
    current.count--;
    return median;
  }
  public String toString(){
    String s = "";
    if(isEmpty()) s+= "Esta vacio";
    else s = toString(this.root);
    return s;
  }
  private String toString(BNode<E> current){
    int i;
    String s = "";
    if(current != null){
      s += current.toString()+"\n";
      for(i = 0; i<= current.count; i++){
	s += toString(current.childs.get(i));
      }
    }
    return s;
  }
}
