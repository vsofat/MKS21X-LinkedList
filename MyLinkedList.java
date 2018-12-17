public class MyLinkedList{
  private Node start, end;
  private int length;

  private MyLinkedList(){
    length = 0;
    start = new Node(null);
    end =  new Node(null);
  }

}










/*
Fields:
   Node start
   Node end
   int length

Constructor:
      MyLinkedList() - make an empty list.

Public Methods:   (This is a good order to try to implement them)
     boolean add(Integer value)
     int size()
     String toString()   //note you don't have get(index) yet, nor would you want to use it here

    Having a private method to get the nth node is very useful.
    You would use such a method in many of your other methods (hinted with a *)
    (Discussion point2. Why should getNthNode be private?)

*    Integer get(int index)
*    Integer set(int index,Integer value)

     boolean contains(Integer value)
     int indexOf(Integer value)

*    void add(int index,Integer value)
*    Integer remove(int index)
*    boolean remove(Integer value) //a private method to find a node you want could be useful here
edit: fixed typo, remove(value) returns boolean
*/
