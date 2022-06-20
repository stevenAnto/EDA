public class Test{
  public static void main(String a[]){
    HeapArray<Integer> heap = new HeapArray<Integer>(10);
    heap.insert(new Node<Integer>(16));
    System.out.println(heap);
    heap.insert(new Node<Integer>(14));
    System.out.println(heap);
    heap.insert(new Node<Integer>(10));
    System.out.println(heap);
    heap.insert(new Node<Integer>(8));
    System.out.println(heap);
    heap.insert(new Node<Integer>(7));
    System.out.println(heap);
    heap.insert(new Node<Integer>(9));
    System.out.println(heap);
    heap.insert(new Node<Integer>(3));
    System.out.println(heap);
    heap.insert(new Node<Integer>(2));
    System.out.println(heap);
    heap.insert(new Node<Integer>(4));
    System.out.println(heap);
    heap.insert(new Node<Integer>(1));
    System.out.println(heap);
    //heap.padre(1);
    System.out.println(heap.izquierda(1));
    System.out.println(
    heap.derecha(1));
    System.out.println(heap.padre(2));
    System.out.println(
    heap.izquierda(2));
    System.out.println(
    heap.derecha(2));
    System.out.println(
    heap.padre(3));
    System.out.println(
    heap.izquierda(3));
    System.out.println(
    heap.derecha(3));
    System.out.println(
    heap.padre(4));
    System.out.println(
    heap.izquierda(4));
    System.out.println(
    heap.derecha(4));
    System.out.println(
    heap.padre(5));
    System.out.println(
    heap.izquierda(5));
    //System.out.println(
    //heap.derecha(5));
  }
}
