public class Test {
  public static void main(String[]arg){
    Lista <Integer> lnt = new LinkedList<Integer>();
    System.out.println(lnt.searchIndex(4));
    System.out.println(lnt.search(20));
    lnt.remove(50);
    lnt.insertFirst(10);
    System.out.println("tamanio "+lnt.getSize());
    System.out.println(lnt);
    lnt.insertFirst(14);
    System.out.println("tamanio "+lnt.getSize());
    System.out.println(lnt);
    lnt.insertLast(20);
    System.out.println("tamanio "+lnt.getSize());
    System.out.println(lnt);
    lnt.insertLast(21);
    System.out.println("tamanio "+lnt.getSize());
    System.out.println(lnt);
    lnt.insertLast(50);
    System.out.println("tamanio "+lnt.getSize());
    System.out.println(lnt);
    lnt.insertFirst(5);
    System.out.println("tamanio "+lnt.getSize());
    System.out.println(lnt);
    lnt.insertFirst(2);
    System.out.println("tamanio "+lnt.getSize());
    System.out.println(lnt);
    lnt.insertFirst(50);
    System.out.println("tamanio "+lnt.getSize());
    System.out.println(lnt);
    lnt.insertFirst(5);
    System.out.println("tamanio "+lnt.getSize());
    System.out.println(lnt);
    lnt.insertFirst(4);
    System.out.println("tamanio "+lnt.getSize());
    System.out.println(lnt);
    lnt.insertFirst(5);
    System.out.println("tamanio "+lnt.getSize());
    System.out.println(lnt);
    lnt.remove(50);
    lnt.remove(50);
    System.out.println(lnt);
    System.out.println("esta el 18? "+lnt.search(120)+"\n");
    System.out.println("\nBuscar por indice 2");
    System.out.println(lnt.searchIndex(2));
    System.out.println("\nBuscar por indice 5");
    System.out.println(lnt.searchIndex(5));
    System.out.println();
    lnt.insertK(10, 5 );
    System.out.println(lnt);






  }
}
