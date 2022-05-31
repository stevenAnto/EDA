public class Animal{
  private String nombre;
  private double areoc;


  public Animal(String name,double areoc){
    this.nombre= name;
    this.areoc= areoc;
  }
  public String getName(){
    return this.nombre;
  }
  public String toString(){
    return nombre+" : "+ areoc;
  }
}
