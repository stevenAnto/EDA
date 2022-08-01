import java.util.ArrayList;


public class BNode<E>{
  protected ArrayList<E> keys;
  protected ArrayList<BNode<E>>childs;
  protected int count;

  public BNode(int count){
    this.keys = new ArrayList<E>(count);
    this.childs = new ArrayList<BNode<E>>(count);
    this.count=0;
    for(int i =0; i <count; i++){
      this.keys.add(null);
      this.childs.add(null);
    }
  }
  public boolean nodeFull(int nEle){
    return this.count == nEle;
  }
  public boolean nodeEmpty(int nEle){
    return this.count <(nEle/2);
  }
  public String toString(){
    String s = "(";
    for(int i =0 ; i< this.count ; i++){
      s += this.keys.get(i);
      if(i < this.count-1) s+= ", ";
      else s += ")";
    }
    return s;
  }
}

