/*
Insert data into linkedlist 
1. Insert at head position
2. Append data in last position
3. Insert after a given node 
*/
import java.util.*;

public class Main
{
   
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public void append(int new_data){
        Node new_node = new Node(new_data);
        if(head == null){
            head = new_node(new_data);
            return;
        }
        new_node.next = null;
        Node last = head;
        while(last.next !=null){
            last = last.next;
        }
        last.next=new_node;
        return;
        
    }
    public void insertAfter(Node prev_node,int new_data){
        if(prev_node == null){
            System.out.print("Node doesn't exist in LinkedList");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }
    
    public void printList(){
        Node tnode = head;
        while(tnode !=null){
            System.out.print(tnode.data);
            tnode = tnode.next;
        }
    }
    
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    LinkedList llist = new LinkedList();
	    
	    llist.append();
	    llist.push();
	    llist.push();
	    llist.append();
	    
	    llist.insertAfter(llist.head.next, 8);
 
        System.out.println("\nCreated Linked list is: ");
        llist.printList();
	}
}
