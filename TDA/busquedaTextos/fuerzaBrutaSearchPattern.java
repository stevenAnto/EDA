public class fuerzaBrutaSearchPattern{
  public fuerzaBrutaSearchPattern(){

  }
  public int search(String texto,String patron){
    for(int i=0;i<=(texto.length()-patron.length());i++){
      System.out.println("i"+i);
      int j=0;
      while(j<patron.length()&&texto.charAt(i+j)==patron.charAt(j)){
	System.out.println("j"+j);
	j++;
      }
      if(j==patron.length())return i;
    }
    return -1;
  }
}
