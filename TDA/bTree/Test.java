public class Test{
  public static void main(String arf[]){
    Btree<Integer> b = new Btree<Integer>(5);
    b.insert(1);
    b.insert(2);
    b.insert(3);
    b.insert(4);
    System.out.println(b);
    b.insert(5);
    System.out.println(b);
    b.insert(6);
    b.insert(7);
    b.insert(8);
    System.out.println(b);
    b.insert(9);
    b.insert(10);
    b.insert(11);
    b.insert(12);
    b.insert(13);
    System.out.println(b);
    b.insert(14);
    b.insert(15);
    b.insert(16);
    b.insert(17);
    b.insert(18);
    System.out.println(b);

    System.out.println(b.search(7));
    System.out.println(b.search(500));

  }
}
