package stringChekcing;

import java.util.Stack;

public class StackValidParenthesis {

	public static void main(String[] args) {
	 String s = "({[)}]";
	 StackValidParenthesis ob = new StackValidParenthesis();
	System.out.println( ob.isValid(s));

	 
	}	 
	 
	 public boolean isValid(String s) {
		 
		 Stack<Character> stack = new Stack<>();
		 for(char ch : s.toCharArray()) {
			 if(ch == '(' || ch == '{' || ch == '[') {
				char pushchar =  stack.push(ch);
				System.out.println(pushchar);
			 } else {
				 if(stack.isEmpty()) {
					 return false;
				 }
				char top = stack.peek();
				System.out.println("top" +top);
				if((ch == ')' && top == '(') || 
						(ch == '}' && top == '{') ||
						(ch == ']' && top == '[')) {
					stack.pop();
				} else {
					return false;
				}
			 }
		 }
		 return stack.empty();
	 }
}
 