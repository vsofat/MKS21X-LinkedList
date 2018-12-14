public class Node{

  private Node next, prev;
  private Integer data;

  private Node (Node from, Node to, Integer value){
    next = to;
    prev = from;
    data = value;
  }

  public Node (Integer value){
    data = value;
  }

  public Node (Node from, Node to){
    next = to;
    prev = from;
  }

  public Node next(){
    return this.next;
  }

  public Node prev(){
    return this.prev;
  }

  public void setNext(Node other){
    this.next = other;
    other.prev = this;
  }

 public void setPrev(Node other){
   this.prev = other;
   other.next = this;
 }

 public Integer getData(){
   return data;
 }

 public Integer setData(Integer i){
   Integer result = this.data;
   this.data = i;
   return result;
 }

 public String toString(){
   return "" + data;
 }

}



/*

Fields:
    Node next,prev
    Integer data
Methods:
    Node next()
    Node prev()
    void setNext(Node other)
    void setPrev(Node other)
    Integer getData()
    Integer setData(Integer i)
    String toString()

    */
