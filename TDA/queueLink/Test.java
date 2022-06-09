public class Test{
  public static void main(String []a){
    Queue<Integer> lint = new QueueLink<Integer>();
    try{
      //lint.dequeue();
      System.out.println(lint);
      lint.enqueue(10);
      System.out.println(lint);
      lint.enqueue(20);
      System.out.println(lint);
      lint.enqueue(21);
      System.out.println(lint);
      lint.enqueue(30);
      System.out.println(lint);
      lint.enqueue(15);
      System.out.println(lint);
      lint.enqueue(12);
      System.out.println(lint);
      lint.enqueue(06);
      System.out.println(lint);
      lint.enqueue(14);
      System.out.println(lint);
      lint.enqueue(17);
      System.out.println(lint);
      lint.enqueue(45);
      System.out.println(lint);
      lint.dequeue();
      System.out.println(lint);
      lint.dequeue();
      System.out.println(lint);
      lint.dequeue();
      System.out.println(lint);
      lint.dequeue();
      System.out.println(lint);
    }
    catch(ExceptionIsEmpty x){
      System.out.println(x.getMessage());
    }
  }
}
