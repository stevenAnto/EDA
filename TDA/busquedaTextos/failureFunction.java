public class failureFunction{
  int [] function;
  int size;

  public failureFunction(String patron){
    int i=1;
    int j=0;
    this.size= patron.length();
    function = new int [this.size];
    function[0]=0;
    System.out.println(patron.length());
    while(i<this.size){
      System.out.println("while i:"+i+"j :"+j);
      if(patron.charAt(i)==patron.charAt(j)){
	System.out.println("while1.1");
	function [i]=j+1;
	i++;
	j++;
      }
      else if(j>0){
	j = function[j-1];
      }
      else{
	function[i] = 0;
	i++;
      }

    }
  }
  public int getFunction(int i){
    return function[i];

  }
}
