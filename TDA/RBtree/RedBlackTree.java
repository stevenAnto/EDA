public class RedBlackTree<K extends Comparable<K>,V> implements RedBlackI<K,V>{
  Node  root;
  int size;

  class Node{
    K key;
    V value;
    Node left,right,parent;
    boolean isLefChild, black; //true es negro
    public Node(K key, V value){
      this.key = key;
      left=right=parent=null;
      this.black = false;
      this.isLefChild = false;
    }
  }

  public void insert(K key, V value){
    Node  node  = new Node(key,value);
    if (root==null){
      root = node;
      root.black =true;
      size++;
      return;
    }
    insert(root,node);
    size++;
  }
  private void insert(Node parent,Node newNode){
    int comp = newNode.key.compareTo(parent.key);
    if(comp>0){
      if(parent.right ==null){
	parent.right = newNode;
	newNode.parent = parent;
	newNode.isLefChild =false;
	return;
      }
      insert(parent.right,newNode);
    }
    if(parent.left == null){
      parent.left = newNode;
      newNode.parent = parent;
      newNode.isLefChild = true;
      return;
    }
    insert(parent.left,newNode);
    checkColor(newNode);
  }
  public void  checkColor(Node node){
    if(node==root){ //la raizze no viola
      return;
    }
    if(!node.black && !node.parent.black){
      correctTree(node);
    }
    checkColor(node.parent);
  }
  public void correctTree(Node node){
    if(node.parent.isLefChild){//casp derecjp
      //verificamos al tio tiene un right childa
      if((node.parent.parent.right==null)||(node.parent.parent.right.black)){//verifico que el tio sea null o negro
	rotate(node);
      }
      if(node.parent.parent.right!=null){
	node.parent.parent.right.black =true;//cambio de color
      }
      node.parent.parent.black =false;
      node.parent.black =true;
      return;
    }
    //aunt is grandparetn.left
    //Poner codigo de izquierda
    else{//caso izquierdo
      //verificamos al tio tiene un right childa
      if((node.parent.parent.left==null)||(node.parent.parent.left.black)){
	 rotate(node);
      }
      if(node.parent.parent.left!=null){
	node.parent.parent.left.black =true;
      }
      //para cambio de color de rotate y tambien el flip
      node.parent.parent.black =false;
      node.parent.black =true;
      return;
    }
  }
  public void rotate(Node node){
    if(node.isLefChild){
      if(node.parent.isLefChild){
	rightRotate(node.parent.parent);
	node.black =false;
	node.parent.black =true;
	if(node.parent.right!=null){
	  node.parent.right.black=false;
	  return;
	}
      }
      rightLeftRotate(node.parent.parent);
      node.black = true;
      node.right.black =false;
      node.left.black = false;
      return;

    }
    /*if(node.parent.isLefChild){
      rightRotate(node.parent.parent);
      node.black =false;
      node.parent.black =true;
      if(node.parent.right!=null){
	node.parent.right.black=false;
	return;
      }
    }
    rightLeftRotate(node.parent.parent);
    node.black = true;
    node.right.black =false;
    node.left.black = false;
    return;*/
  }
  public Node leftRotate(Node node){
    Node tmp = node.right;
    node.right = tmp.left;
    tmp.left = node;
    return tmp;
  }
  public Node rightRotate(Node node){
    Node tmp = node.left;
    node.left =tmp.right;
    tmp.right =node;
    return tmp;
  }
  public Node rightLeftRotate(Node node){
    node.right = rightRotate(node.right);
    return leftRotate(node);
  }
  public Node leftRightRotate(Node node){
    node.left =leftRotate(node.left);
    return rightRotate(node);
  }
}
