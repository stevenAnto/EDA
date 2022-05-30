// printdigit=System.out.printl= metodo que solo imprime un caracter
/*Todo metodo recursivo debe tener 4 reglas
 * un caso base
 * la llamada recursiva debe llevar a un caso 
 * que te lleve al caso base
 * Design rule : el seguimiento de la recursividad es tediosa, y por lo tanto  debe probar dicha recursion, lo hacemos en general por induccion
 * Compound rule :No resolver el mismo problema en llamadas recursivas separadas . Caso Fibonacci intuitivo*/
public class Recursivo{
  public static void print(int n){
    if (n>=10) recursivo(n/10);//llamada recursiva
    System.out.println(n%10);//caso base
  }
}

