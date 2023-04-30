package queue;

import stack.Node;

public class ListQueue<T> {
	
	private Node<T> lastNode;

	public ListQueue() {
		this.lastNode = null;
	}
	
	public boolean isEmpity() {
		return lastNode == null ? true : false;
	}
	
	public void enQueue(T data) {
		Node<T> aux = new Node<>(data);
		aux.setNext(lastNode);
		lastNode = aux;
	}
	
	public T deQueue() {
		Node<T> aux = lastNode;
		Node<T> before = null;
		if(isEmpity()) {
			return null;
		}
		while(true) {
			
			if(aux.getNext() != null) {
				before = aux;
				aux = aux.getNext();
			} else {
				before.setNext(null);	
				break;
			}
		}
		return aux.getData();
	}
	
	public String toString() {
		Node<T> aux = lastNode;
		String str = "";
		while(true) {
			if(aux != null) {
				str += "[" + aux.getData() + "]";
				aux = aux.getNext();
			} else {
				break;
			}
		}
		return str;
	}

}
