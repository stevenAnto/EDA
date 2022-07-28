public class Test{
  public static void main(String []aaa){
    /*fuerzaBrutaSearchPattern buscar = new fuerzaBrutaSearchPattern();
    System.out.println(buscar.search(a,b));*/
    String texto = "abacaabadcabaabaaabb";
    String patron = "abaaba";
    /*BoyerMoore pattern = new BoyerMoore(patron,texto);
    System.out.println(pattern.getFuncionPre());
    System.out.println("busqueda: "+pattern.search());*/
    failureFunction patronFunction = new failureFunction(patron);
    System.out.println("imprimiento funciond e fallo");
    for (int i=0; i< patronFunction.size; i++){
      System.out.println(patronFunction.getFunction(i));
    }
    System.out.println();
    KMPMatch pattern = new KMPMatch(patron,texto);
    System.out.println(pattern.search());
  }
}
