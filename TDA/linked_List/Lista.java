public interface Lista<E>{
  boolean isEmpty();
  void insertFirst(E x);
  void insertLast(E x);
  boolean search(E x);
  void remove(E x);
  int getSize();
  Node <E> searchIndex(int indice);
  void insertK(E x, int k);
}
