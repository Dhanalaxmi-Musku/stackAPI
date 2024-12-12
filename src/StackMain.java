
public class StackMain {

	public static void main(String[] args) {
		 Stack<Integer> stack = new Stack<>();
	        stack.push(70);
	        stack.push(30);
	        stack.push(56);
	        System.out.println("Stack: " + stack);
	        System.out.println("Top element: " + stack.peek());
	        System.out.println("Stack size: " + stack.size());
	        System.out.println("Popped: " + stack.pop());
	        System.out.println("Popped: " + stack.pop());
	        System.out.println("Is stack empty? " + stack.isEmpty());

	}

}
