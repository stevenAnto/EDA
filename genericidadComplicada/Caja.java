@SuppressWarnings("unchecked")
public class Caja<T extends Comparable<T>> extends CosaConMedida implements Comparable<Caja<T>>{
  public Caja(T obj, int medida ){
    super(medida,obj);
  }
  public  String toString(){
    return ""+obj;
  }
  public int compareTo(Caja<T> other){
    if (medida > other.medida)return 1;
    if (medida < other.medida)return -1;
    return 0;

  }
}
