package stack;

public class Main {
	
	public static void main(String[] args) {
		
		ListStack<String> stack = new ListStack<>();
		
		stack.push("Abacaxi");
		stack.push("Laranja");
		stack.push("Melão");
		stack.push("Banada");
		stack.push("Melancia");
		stack.push("Tomate");
		System.out.println(stack.toString());
		
		stack.pop();
		System.out.println(stack.toString());
		System.out.println(stack.pop());
		System.out.println(stack.toString());
		String teste = stack.pop();
		System.out.println(teste);
		System.out.println(stack.toString());
		
		System.out.println(stack.peek());
		System.out.println(stack.toString());
		System.out.println(stack.pop());
		System.out.println(stack.toString());
		System.out.println(stack.pop());
		System.out.println(stack.toString());
		System.out.println(stack.pop());
		System.out.println(stack.toString());
		
		
	}

}
