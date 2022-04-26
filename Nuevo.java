import java.util.*;

public class Nuevo{
  static Scanner sc = new Scanner(System.in);
  public static void main(String[]args){
    System.out.println("ingrese valor a evaluar");
    String pal = sc.nextLine();
    System.out.println(countWords(pal));
    int [] lista = {5,4,9,2,7,9,3};
    mostrar(lista);
    insertionSort(lista);
    mostrar(lista);
    System.out.println(maxArray(lista));
    System.out.println(max(5,4,9));
  }
  public static int max(int a, int b){
    int r= (a>b)? a:b;
    return r;
  }
  public static int max(int a, int b,int c){
    int r = (a>b)? max(a,c): max(b,c);
    return r;
  }
  public static int maxArray(int []a){
    int i=0;
    int m = a[0];
    //invariante : i<n && m==max(int []a)
    while(i<a.length-1){
      ++i;
      //invariante
      m=(a[i]>m)?a[i]:m;
    }
    return m;
  }
  public static void  insertionSort(int []a){
    //invariante a[i]<a[i+1]para i=0 to k-2
    //a[k] to a[n-1] estan desordenados.
    int k=0;
    while(k<a.length){
      //insertion
      for (int j = k; j>0 && a[j-1]>a[j];--j){
	int t= a[j];
	a[j]=a[j-1];
	a[j-1]=t; 
      }
      ++k;
    }
  }
  public static int countWords(String a){
    int np=0;
    String estado= "fuera";
    char c= ' ';

    for (int i =0;i<a.length()&& (c=a.charAt(i))!='.';i++){
      System.out.println("entro1");
      if(estado.equals("fuera")){
	System.out.println("entro12");
	if(c != ' '){
	  System.out.println("entro13");
	  ++np;
	  estado = "dentro";
	}
      }
      else{
	if(c==' ')estado = "fuera";
      }
    }
    return np;
  }
  public static void mostrar(int []a){
    for (int i =0; i<a.length;i++){
      System.out.print(a[i]+",");
    }
    System.out.println();
  }
}
