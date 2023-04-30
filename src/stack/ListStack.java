package stack;

public class ListStack<T> {
	
	private Node<T> lastNode;

	public ListStack() {
		this.lastNode = null;
	}
	
	
	public boolean isEmpity() {
		return lastNode == null ? true : false;
	}
	
	public void push(T data) {
		Node<T> aux = new Node<>(data);
		aux.setNext(lastNode);
		lastNode = aux;
	}
	
	public T pop() {
		Node<T> aux = new Node<>(lastNode.getData());
		lastNode = lastNode.getNext();
		return aux.getData();
	}
	
	public T peek() {
		return lastNode.getData();
	}
	
	public String toString() {
		Node<T> aux = lastNode;
		String str = "";
		while(true) {
			if(aux != null) {
				str += "[" + aux.getData() + "]\n";
				aux = aux.getNext();
			} else {
				break;
			}
		}
		return str;
	}

}
