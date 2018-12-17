import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.lang.IndexOutOfBoundsException;

public class MyLinkedList{
  private Node start, end;
  private int length;

  private MyLinkedList(){
    length = 0;
    start = new Node(null);
    end =  new Node(null);
  }

  private Node getNthNode (int n){
    Node current = start;
    for (int i = 0; i < n; i++){
      current = current.next(); // loop finds the node at int n by looping through the list
    }
    return current;
  }

  public int size(){
    return length;
  }

  public boolean add (Integer value){
    if (value == null) {
      throw new NullPointerException();
    }
    if (length == 0){
      Node endNode = new Node(value);
      this.start = endNode;
      this.end = endNode;
      length ++;
      return true;
    }
    else{
      Node endNode = new Node(value);
      end.setNext(endNode);
      end = endNode;
      length ++;
      return true;
    }

  }

  public void add(int index, Integer value){
    // case 1
    if(index < 0 || index > length){
      throw new IndexOutOfBoundsException();
    }
    Node newAdd = new Node(value);
    // case 2
    if(index == length){
      newAdd.setPrev(end);
      end.setNext(newAdd);
      end = newAdd;
    }
    // case 3
    else if(index == 0){
      start.setPrev(newAdd);
      newAdd.setNext(start);
      start = newAdd;
    }
    // case 4
    else{
      Node partOne = getNthNode(index);
      Node partTwo = getNthNode(index - 1);
      partTwo.setNext(newAdd);
      newAdd.setPrev(partTwo);
      newAdd.setNext(partOne);
      partOne.setPrev(newAdd);
    }
    length ++;
  }

  public Integer remove(int index) {
    if (index >= length || index < 0){
      throw new IndexOutOfBoundsException();
    }
    Integer result;
    if (index == length - 1) {
      result = end.getData();
      end = end.prev();
    }
    else if (index == 0) {
      result = start.getData();
      start = start.next();
    }
    else {
      Node atN = getNthNode(index);
      atN.prev().setNext(atN.next());
      result = atN.getData();
    }
    length --;
    return result;
  }

  public boolean contains(Integer value){
    Node lookingFor = start;
    while(lookingFor.next() != null){
      if (lookingFor.getData().equals(value)){
        return true;
      }
      lookingFor = lookingFor.next();
    }
    //checks last element, bc while loop misses it
    if(end.getData().equals(value)){
      return true;
    }
    return false;
  }

  public int indexOf(Integer value) {
    Node current = start;
    for (int x = 0; x < length; x ++) {
      if (current.getData().equals(value)) return x;
      current = current.next();
    }
    return -1; // refer to Java documentation
  }

  public boolean remove(Integer value) {
    System.out.println(contains(value));
    if (! contains(value)) return false;
    remove(indexOf(value));
    return true;
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
