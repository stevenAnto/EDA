public class EntryDic<C extends Comparable<C>,V> implements Comparable<EntryDic<C,V>>{
  private C key;
  private V value;

  public EntryDic(C key, V value){
    this.key = key;
    this.value = value;
  }
  public EntryDic(C key){
    this(key, null);
  }
  @SuppressWarnings("unchecked")
  public boolean equals(Object x){
    return ((EntryDic<C,V>)x).key.equals(this.key);
  }
  public int compareTo(EntryDic<C,V> x){
    return this.key.compareTo(x.key);
  }
  public String toString(){
    return "(" + this.key + ","+this.value+")";
  }
  public C getKey(){
    return key;
  }
  public void setKey(C key){
    this.key = key;
  }
  public V getValue(){
    return this.value;
  }
  //get y set devalue
}
