package dsa;
import java.util.Stack;
public class ParenthesisMatch {
	static boolean isValidExpression(String expr) {
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0;i<expr.length();i++) {
			char symbol = expr.charAt(i);
			
			//if opening bracket is found then push
			
			if(symbol =='(' || symbol == '[' || symbol == '{') {
				stack.push(symbol);
			}
			
			// if closing bracket is found then pop and match the pair
			
			else if(symbol == ')' || symbol == ']' || symbol == '}') {
				char topSymbol = stack.pop();
				switch(symbol) {
				case ')':
					if(topSymbol != '(') return false;
						break;
				case ']':
					if(topSymbol != '[') return false;
						break;
				case '}':
					if(topSymbol != '{') return false;
						break;
				
				}
			}
		}
		return stack.isEmpty();
	}
	
	

	public static void main(String[] args) {
		String expr1 = "{[[()]]}";
		String expr2 = "([[]})";
		System.out.println(isValidExpression(expr1));
		System.out.println(isValidExpression(expr2));

	}

}
