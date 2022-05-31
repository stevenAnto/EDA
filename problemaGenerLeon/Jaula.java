public class Jaula<T extends AnimalTerrestre> extends Contenedor<T> implements Comparable<Jaula<T>>{
  public Jaula(double area){
    super(area);
  }
  public T get(){
    return animal;
  }
  public void poner(T x){
 pone (x) ;
  }

  public int compareTo(Jaula<T> other){
    if(this.area> other.area)return 1;
    if(this.area< other.area)return -1;
    return 0;

  }
}
