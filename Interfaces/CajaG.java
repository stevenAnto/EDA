public class CajaG <T>{
  private T dato;

  public CajaG(){
    super ();
  }
  public T dame(){
    return this.dato;
  }
  public void pon(T x){
    this.dato =x;
  }
}
