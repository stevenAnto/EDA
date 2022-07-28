public class Test{
  public static void main(String []aaa){
    /*fuerzaBrutaSearchPattern buscar = new fuerzaBrutaSearchPattern();
    System.out.println(buscar.search(a,b));*/
    String alfabeto = "abacaabadcabacabaabb";
    String patron = "abacab";
    BoyerMoore pattern = new BoyerMoore(patron,alfabeto);
    System.out.println(pattern.getFuncionPre());
    System.out.println("busqueda: "+pattern.search());
  }
}
