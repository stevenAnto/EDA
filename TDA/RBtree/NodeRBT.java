class NodeRBT<E> {
  boolean color= true; //rojo
  public E data;
  public NodeRBT<E> left;
  public NodeRBT<E> right;
  public int height;
  public NodeRBT<E> parent;

  // Constructores
  public NodeRBT(E data, NodeRBT<E> left, NodeRBT<E> right) {
    this.data = data;
    this.left = left;
    this.right = right;
    this.height = 0;
  }

  public NodeRBT(E data) {
    this(data, null, null);
  }
  // getters, setters
}
