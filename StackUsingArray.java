import java.util.Arrays;
class Stack{
	int[] stack = new int[5];
	int top = -1;
	
	void push(int n) {
		if(top<stack.length - 1) {
			stack[++top]=n;
		}
		else {
			System.out.println("Stack is full");
		}
	}
	
	int pop() {
		int element = 0;
		if(top>= 0 && top<stack.length) {
			element = stack[top];
			stack[top]=0;
			top--;
		}
		return element;
	}
	void display() {
		System.out.println(Arrays.toString(stack));
	}
}
public class StackUsingArray {

	public static void main(String[] args) {
		Stack stack=new Stack();
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.pop();
		stack.push(1);
		stack.push(9);
		stack.push(10);
		stack.display();
		stack.pop();
		stack.pop();
		stack.display();
		
	}

}
