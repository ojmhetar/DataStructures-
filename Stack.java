public class Node 
{
  Node next; 
  Object data; 
  
  Node(Object item) {
  	next = null;
    data = item; 
  }
   
}

public class Stack 
{
  private Node top; 
  
  public Stack() {
  	 
  }
  
  public void push(Object item) { 
  	Node newNode = new Node(item); 
    newNode.next = top; 
    top = newNode; 
  }
  
  public Object peek() {
     return top.data;
  }
  
  public Object pop() { 
    if(top == null) { 
     	return null;  
    }
    else { 
    	Object item = top.data; 
      	top = top.next; 
      	return item; 
    }
  } 
  
}
