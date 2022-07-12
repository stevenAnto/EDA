public class Test{
  public static void main(String []a){
    Dictionary<Integer, String> b = new BSTDictionary<Integer, String>();

    try{
      b.insert(16, "carlos");
      b.insert(40, "maria");
      b.insert(10, "julio");
      b.insert(6, "carlos");
      b.insert(19, "javier");
      b.insert(35, "angela");
      b.insert(7, "pedro");
      b.insert(12, "jose");
      b.insert(21, "angela");
      System.out.println(b);
      System.out.println("valor de 12? "+b.search(12));
      System.out.println("eliminacion de 30 ");
      b.remove(7);
      System.out.println(b);

    }
    catch(Exception x){
      System.out.println(x.getMessage());
    }
    /*try{
      System.out.println(b.search(16));
    }*/
    //System.out.println("minimo arbol: "+b.minRemove());
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
