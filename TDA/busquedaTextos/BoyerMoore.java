import java.util.*;

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
