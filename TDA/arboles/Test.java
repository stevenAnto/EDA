public class Test{
  public static void main(String []a){
    BST<Integer> b = new BST<Integer>();

    try{
      b.insert(16);
      b.insert(15);
      b.insert(20);
      b.insert(30);
      b.insert(1);
      b.insert(5);
      b.insert(19);
      b.insert(12);
      b.insert(7);
      b.insert(42);
      b.insert(25);
      System.out.println(b);
    }
    catch(ItemDuplicated x){
      System.out.println(x.getMessage());
    }
    /*try{
      System.out.println(b.search(16));
    }*/
    catch(ItemNoFound y){
      System.out.println(y.getMessage());
    }
    System.out.println("minimo arbol: "+b.minRemove());
    System.out.println("despues de minremove: "+b);
    try{
      b.remove(12);
    }
    catch(ItemNoFound z){
      System.out.println(z.getMessage());
    }
    System.out.println(b);

  }
}
