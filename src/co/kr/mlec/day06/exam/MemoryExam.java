package co.kr.mlec.day06.exam;



class Node {
    int data = 0;
    Node next = null;
}
public class MemoryExam {
    public static void main( String args[] ) {
          Node head = new Node();
          head.data = 0;
          
          Node tail = head;
        
          tail.next = new Node();
          tail.next.data = 10;
          tail = tail.next;
          
          tail.next = new Node();
          tail.next.data = 20;
          tail = tail.next;
          
          tail.next = new Node();
          tail.next.data = 30;
          tail = tail.next;
      
          Node t = head.next;

          while (t != null) {
                System.out.println(t.data);
                t = t.next;
          }
    }
}