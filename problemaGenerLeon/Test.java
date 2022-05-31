import java.util.*;
public class Test{
  public static void main(String []a){
    ArrayList<Animal> animales =  new ArrayList<>();
    ArrayList<Jaula<AnimalTerrestre>> animalesT = new ArrayList<Jaula<AnimalTerrestre>>();

    //No permite crear del tipo Animal
    //tipo de parametro solo acepta AnimalTerrestre
    AnimalTerrestre leon0= new Leon("leon01",10);
    AnimalTerrestre leon1= new Leon("leon02",12);
    AnimalTerrestre leon2= new Leon("leon03",13);
    AnimalTerrestre  elefante1 = new Elefante ("elefante01", 100);
    AnimalTerrestre  elefante2 = new Elefante ("elefante02", 90);
    AnimalTerrestre  elefante3 = new Elefante ("elefante03", 120);

    animalesT.add(ponerJaula(leon0,5));
    animalesT.add(ponerJaula(leon1,12));
    animalesT.add(ponerJaula(leon2,13));
    animalesT.add(ponerJaula(elefante1,100));
    animalesT.add(ponerJaula(elefante2,90));
    animalesT.add(ponerJaula(elefante3,120));
    mostrarLeonMaspretado(animalesT);
  }
  //Ojo en la restriccion  de T extends AnimalTerrestre, si se omite, no se acepta ya que supone 
  //que hereda de Object lo cual no podria ser aceptado por nuestro ArrayList de la linea 15
  public static <T extends AnimalTerrestre> Jaula<T> ponerJaula(T x, double area){
    Jaula<T> jaula = new Jaula<T>(area);
    jaula.poner(x);
    return jaula;
  }
  //Metodo generico
  public static <T> void mostrar(ArrayList<T> a){
    for (int i=0; i<a.size();i++){
      System.out.println(a.get(i));
    }
  }
  public static void mostrarLeonMaspretado(ArrayList<Jaula<AnimalTerrestre>> jaulas){
    Jaula<AnimalTerrestre> minJaula = null;
    for (Jaula<AnimalTerrestre> jaula : jaulas ){
      AnimalTerrestre animal = jaula.get();
      if( animal != null && animal instanceof Leon && (minJaula == null || jaula.compareTo(minJaula)<0)){
	minJaula = jaula;
      }
    }
    if(minJaula != null) System.out.println("es "+minJaula.getAnimal().getName());
    else System.out.println("no hay");
  }
}
