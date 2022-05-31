public class Contenedor<T extends Animal>{
  protected T animal;
  protected double area;
  
  public Contenedor(double area){
    this.area = area;
    animal = null;
  }
  
  public T getAnimal(){
    return this.animal;
  }
  
  public void pone(T x){
    if(this.animal != null)System.out.println("lleno");
    else {
      this.animal = x;
    }
  }


}
