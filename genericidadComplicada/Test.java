public class Test{
  public static void main(String []a){
    Caja<Integer> entero1 = new Caja<Integer>(new Integer(5),10);
    Caja<Integer> entero2 = new Caja<Integer>(new Integer(2),5);
    System.out.println(comparar(entero1,entero2));
    System.out.println(comprar(5,2));
  }
  
  public static <T extends Comparable<T>> int comparar(T x, T y ){
    return x.compareTo(y);
  }
}
