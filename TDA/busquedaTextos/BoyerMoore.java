import java.util.*;

//El procesado de dicho algoritmo tiene una complejidad de O(m+s)m es el tamano de patron y s del alfalbeto. En este caso asumimos que el todos los caracteres del texto son el alfabeto.
//la complejidad del "cuerpo " del algoritmo, es decir hacer los saltos y verificar hacia atras, en el peor de los casos es de complejidad nm, y en el mejor de los casos es de m/m
//sumando nm+m+s=(n+1)m+s= O(nm+s) ene el peor de los casos seria n/m+m+s
public class BoyerMoore{
  private String patron;
  private String texto;
  private HashMap<Character, Integer> preprocesado= new HashMap<Character, Integer>();

  public BoyerMoore(String patron,String texto){
    this.patron = patron;
    this.texto = texto;
    for(int i=0;i<this.texto.length();i++){
      preprocesado.put(this.texto.charAt(i),-1);
    }
    for(int j=0;j<this.patron.length();j++){
      preprocesado.put(this.patron.charAt(j),j);
    }
  }
  public int search(){
    System.out.println("1");
    int i,j;
    System.out.println(";ga");
    System.out.println(patron.length()-1);
    i=j=patron.length()-1;
    System.out.println("i"+i+"j"+j);
    while (i<=texto.length()){
      System.out.println("cilco Whil");
      if(texto.charAt(i)==patron.charAt(j)){
	System.out.println("while.1");
	if (j==0) return i;
	else{
	  i--;
	  j--;
	}
      }
      else{
	System.out.println("while 2 ");
	int l = preprocesado.get(texto.charAt(i));
	i = i+ (patron.length()-Math.min(j,1+l));
	j = patron.length()-1;
      }
    }
    return -1;
  }
  public HashMap<Character,Integer> getFuncionPre(){
    return preprocesado;
  }
}
