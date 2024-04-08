package main.java.com.mine.ch4;

public class LinkedListSample {
  class Node {
    int data;
    Node next;
    Node(int data) {
      this.data = data;
    }
  }

  public static void main(String[] args) {
    LinkedListSample list = new LinkedListSample();
    Node head = list.new Node(1);
    head.next = list.new Node(2);
    head.next.next = list.new Node(3);
    head.next.next.next = list.new Node(4);
    head.next.next.next.next = list.new Node(5);
    head.next.next.next.next.next = list.new Node(6);
    head.next.next.next.next.next.next = list.new Node(7);
    head.next.next.next.next.next.next.next = list.new Node(8);
    head.next.next.next.next.next.next.next.next = list.new Node(9);
    head.next.next.next.next.next.next.next.next.next = list.new Node(10);
    
  }
}
