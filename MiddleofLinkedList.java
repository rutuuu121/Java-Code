package LinkedLists;

public class MiddleofLinkedList {

	// Take two pointers(slow(t1) and fast(t2)
	// increment slow by 1
	// increment fast by 2
	// if slow == fast that means there is a loop
	
	static int findMiddle(Node head) {
		Node t1 = head;       //slow pointer (it jumps by 1)
		Node t2 = head;       // fast Pointer (it jumps by 2) 
		
		while(t2.next != null && t2.next.next != null) {
			t1 = t1.next;
			t2 = t2.next;
			
		}
		return t1.data;
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(new Node(1));
		list.add(new Node(2));
		list.add(new Node(3));
		list.add(new Node(4));
		//list.add(new Node(5));
		int element = findMiddle(list.getHead());
		System.out.println("Middle element is"+element);
	}

}
