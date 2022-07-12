public interface Dictionary<C,V>{
  void insert(C key, V val)throws ItemDuplicated;
  void remove(C key) throws ItemNoFound;
  V search(C key) throws ItemNoFound;
}
