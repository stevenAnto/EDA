public class DriverFiguras {
  public static void main (String []arg){
    Figura figuras []= new Figura [7];
    Circulo cir1 = new Circulo (5);
    Circulo cir2 = new Circulo (4);
    Circulo cir3 = new Circulo (6.1);
    Rectangulo rec1 =  new Rectangulo (2,5) ;
    Rectangulo rec2 =  new Rectangulo (1,5) ;
    Rectangulo rec3 =  new Rectangulo (8,2) ;
    Cuadrado cua1 = new Cuadrado (2) ;
    figuras[0]=cir1;
    figuras[1]=cir2;
    figuras[2]=cir3;
    figuras[3]=rec1;
    figuras[4]=rec2;
    figuras[5]=rec3;
    figuras[6]=cua1;
    Estudiante estudiantes [] = new Estudiante [5];

    estudiantes [0]=(new Estudiante("01234","Pedro", new Fecha(27,06,1900),6500.50));
    estudiantes [1]=(new Estudiante("546","stv", new Fecha(20,10,2005),4500.50));
    estudiantes [2]=(new Estudiante("44546","juna", new Fecha(11,12,1995),500.50));
    estudiantes [2]=(new Estudiante("45646","m,aria", new Fecha(2,03,1993),300.50));
    estudiantes [2]=(new Estudiante("4546","jector", new Fecha(3,02,2005),100.50));
    estudiantes [2]=   (new Estudiante("5648","lla", new Fecha(10,01,1005),645.50));

    Container<Caja<Integer>> conInt = new Container<Caja<Integer>>(5);
    Container<Caja <Figura>> conFig = new Container<Caja <Figura>>(3);
    conInt.add(creaCajar(10,"verde"));
    conInt.add(creaCajar(8,"verde"));
    conInt.add(creaCajar(12,"amarillo"));
    conInt.add(creaCajar(13,"verde"));
    conInt.add(creaCajar(20,"azul"));
    conFig.add(creaCajar(cir1,"verde"));
    conFig.add(creaCajar(rec1,"otro"));
    conFig.add(creaCajar(cua1,"verde"));
    System.out.println(conInt);
    System.out.println(conFig);
    System.out.println("el menor es");
    System.out.println(Operaciones.menorC(conFig));
    System.out.println("debio;");
    System.out.println("en menor del contenedor\n"+
	Operaciones.menorC(conInt));


    /*String [] v = {"per","yola","hola","lala"};
      Integer [] w = {24,1,2,};
      Operaciones.mostrar(figuras);
      Operaciones.mostrar(estudiantes);
      Operaciones.mostrar(v);
      Operaciones.mostrar(w);
      System.out.println("el menor esde figuras");
      System.out.println(Operaciones.menor(figuras));
      System.out.println("el menor esde estudiantes");
      System.out.println(Operaciones.menor(estudiantes));*/
  }
  public static  <T extends Comparable<T>> Caja <T> creaCajar(T item,String color){
    Caja <T> c = new Caja <T>(color);
    c.pon(item);
    return c;
  }
}
