import java.util.Stack;
public class StringReverse {
	static String reverse(String str) {
		Stack<Character> stack = new Stack<Character>();
		for(int i= 0; i<str.length();i++) {
			stack.push(str.charAt(i));
			
		}
		StringBuffer output = new StringBuffer();
		while(!stack.isEmpty()) {
			output.append(stack.pop());
		}
		return output.toString();
	}
	public static void main(String[] args) {
	     String str = "Today is Holiday";
	     String output = reverse(str);
	     System.out.println(output);

	}

}
