public class KMPMatch{
  int [] preprocesado ;
  String texto;
  String patron;

  public KMPMatch(String patron,String texto){
    preprocesado = (new failureFunction(patron)).function;
    this.texto = texto;
    this.patron = patron;
  }

  public int search(){
    int i,j;
    i=j=0;
    while(i <texto.length()){
      if(texto.charAt(i)==patron.charAt(j)){
	if (j==patron.length()-1) return i-j;
	else{
	  i++;
	  j++;
	}
      }
      else{
	if (j>0) j = preprocesado[j-1];
	else{
	  i++;
	}
      }
    }
    return -1;
  }
}
