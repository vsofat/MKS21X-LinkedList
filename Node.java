public class Node{

  private Node next, prev;
  private Integer data;

  private Node (Node from, Node to, Integer value){
    next = to;
    prev = from;
    data = value;
  }

  private Node (Integer value){
    data = value;
  }

  private Node (Node from, Node to){
    next = to;
    prev = from;
  }

  private Node next(){
    return this.next;
  }

  private Node prev(){
    return this.prev;
  }

  private void setNext
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
