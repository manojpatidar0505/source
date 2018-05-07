package in.co.collection;


import java.util.Stack;

public class StackPeek {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.add("3");
		stack.add("2");
		stack.add("1");
		Object o;
		Stack stack1 = new Stack();
		Stack stack3 = new Stack();
		
		int count = stack.size();
		for (int i = 0; i <= count + 1; i++) {
			stack1.push(stack.peek());
			o=stack.pop();
			stack3.push(o);
			count--;
		}
		stack=stack3;
	System.out.println("stack"+stack);
		System.out.println("stack1"+stack1);
	}

}
