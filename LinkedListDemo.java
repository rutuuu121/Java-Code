package LinkedLists;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = next;
	}
}

class LinkedList{
	static Node head = null;
	//Traversing LinkedList
	static public void displayList() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}	
	
	// Searching node in the list
	
	static boolean search(int d) {
		Node temp = head;
		while(temp != null) {
			if(temp.data==d) {
				return true;	
				
			}
			temp =temp.next;
		}
		   return false;
		
	}
	
	// Delete node
	static void delete(int d) {
		if(search(d)==true) {
			if(head.data==d) {
				head=head.next;
			}
			else {
				Node temp=head;
				while(temp.next.data!=d) {
					temp = temp.next;
				}
				temp.next = temp.next.next;
				
			}
	
			}
		else {
			System.out.println("Invalid element");
		}
	}

static public void add(Node n) {
	if(head == null) {
		head = n;
		
	}
	else {
		Node temp=head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next=n;
	}
}
// get head
public Node getHead() {
	
	return head;
}
}
public class LinkedListDemo {

	public static void main(String[] args) {
		//Node obj1 = new Node(1);
		//LinkedList.add(obj1);
		LinkedList.add(new Node(1));
		LinkedList.add(new Node(8));
		LinkedList.add(new Node(5));
		LinkedList.add(new Node(16));
		
		LinkedList.displayList();
		System.out.println(LinkedList.search(4)); //Return false
	      
		 LinkedList.delete(4);
         
	}
}
