public class Node {
  Node next; 
  Object data; 
  
  Node(Object item) {
  	next = null;
    data = item; 
  }
   
}


public class Queue {
 
  Node head, tail; 
  
  public Queue() {
    
  }
  
  public void enqueue(Object item) { 
    if(head == null) { 
    	head = new Node(item);
        tail = head; 
    } 
    else { 
        tail.next = new Node(item); 
        tail = tail.next; 
    }  
  }
  
  public Object dequeue() { 
    if(head != null) {
       Object item = head.data; 
       head = head.next; 
       return item; 
    }
    
    return null;     	
  }  
}
