
class Node{
	
 int data;
 Node next;
	
 Node(int data)
 {
    this.data = data;
    this.next = null;
 }
	
}



public class LinkedListTraversal {
	
	
   Node head;
   
   public void display()
   {
    if(head == null)
    {
     System.out.println("List is Empty");
     return;
    }
    
    Node temp = head;
    
    while(temp != null)
    {
     System.out.print(temp.data+"-->");
     temp = temp.next;
    }
    System.out.println("null");
    
   }
   
   public void insertAtBeginning(int data)
   {
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
   }
   
   public void insertAtEnd(int data) {
    Node newNode = new Node(data);
    
    if(head == null)
    {
   head = newNode;
   return;
    }
    Node temp = head;
    
    while(temp.next != null)
    {
     temp = temp.next;
    }
    temp.next = newNode;
   }
	
   public void insertAtPosition(int data,int position)
   {
    if(position<0)
     
    {
     System.out.println("Invalid Position");
     return;
    }
    
    if(position == 0)
    {
     insertAtBeginning(data);
     return;
    }
    
    Node newNode = new Node(data);
    
    Node temp = head;
    
    for(int i = 0;i<position-1;i++)
    {
     if(temp == null)
     {
      System.out.println("Position out of bounds");
      return;
     }
     
     newNode.next = temp.next;
     temp.next = newNode;
    }
    
   }
   
   public void deleteAtBeginning() {
    if(head == null)
    {
     System.out.println("List is Empty");
     return;
    }
    head = head.next;
   }
	
   public void deleteAtEnd()
   {
    if(head == null)
    {
     System.out.println("List is Empty");
     return;
    }
    
    if(head.next == null)
    {
     head = null;
     return;
    }
    
    Node temp = head;
    while(temp.next.next != null)
    {
     temp = temp.next;
    }
    temp.next = null;
   }
   
   public void deleteAtPosition(int position)
   {
    if(position < 0)
    {
     System.out.println("Invalid Position");
     return;
    }
    
    if(head == null)
    {
     System.out.println("List is Empty");
     return;
    }
    if(position == 0)
    {
     deleteAtBeginning();
     return;
    }
    
    Node temp = head;
    
    for(int i=0;i<position - 1;i++)
    {
     if(temp == null || temp.next == null)
     {
      System.out.println("Position out of bounds");
      return;
     }
     
     temp = temp.next;
    }
    
    if(temp.next == null)
    {
     System.out.println("Position out of bounds");
     return;
    }
    temp.next = temp.next.next;
   }
   
   public boolean search(int value)
   {
    Node temp = head;
    
    while(temp != null)
    {
     if(temp.data == value)
     {
      return true;
     }
     temp = temp.next;
    }
    return false;
   }

 public static void main(String[] args) {
  LinkedListTraversal list = new LinkedListTraversal();
  
  list.insertAtEnd(10);
  list.insertAtEnd(20);
  list.insertAtEnd(30);
  
  System.out.println("List");
  
  list.display();
  
  list.insertAtBeginning(25);
  
  System.out.println("insert at begin");
  list.display();
  
  list.insertAtPosition(30, 2);
  System.out.println("Postion");
  list.display();
  
  list.deleteAtBeginning();
  System.out.println("delete at begin");
  list.display();
  
  
  list.deleteAtEnd();
  System.out.println("Delete at End");
  list.display();
  
  list.deleteAtPosition(1);
  System.out.println("Delete At position");
  list.display();
  
  
  
  System.out.println("Search value 30");
  
  if(list.search(45))
  {
   System.out.println("Found");
  }
  else {
   System.out.println("Not Found");
  }
  
  
 }

}