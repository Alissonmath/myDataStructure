package linkedList;



public class ListLinked<T> {

	private Node<T> lastNode;
	
	public ListLinked() {
		this.lastNode = null;
	}

	public Node<T> getLastNode() {
		return lastNode;
	}

	public void setLastNode(Node<T> lastNode) {
		this.lastNode = lastNode;
	}
	
	public void add(T data) {
		Node<T> aux = new Node<>(data);
		aux.setNext(lastNode);
		lastNode = aux;
	}
	
	public boolean isEmpity() {
		return lastNode == null ? true : false;
	}
	
	public void remove(T data) {
		Node<T> aux = lastNode;
		Node<T> before = null;
		if(lastNode.getData().equals(data)) {
			lastNode = lastNode.getNext();
			return;
		}
		while(true) {
			if(aux != null) {
				if(aux.getData().equals(data)) {
					before.setNext(aux.getNext());
					break;
				} else {
					before = aux;
					aux = aux.getNext();
				}
			}
		}
	}
	
	public T search(T data) {
		Node<T> aux = lastNode;
		while(true) {
			if(aux != null) {
				if(aux.getData().equals(data)) {
					return data;
				} else {
					aux = aux.getNext();
				} 
					
				
			} else {
				break;
			}
		}
		return null;
	}
	
	public String toString() {
		String str = "";
		Node<T> aux = lastNode;
		while(true) {
			if(aux != null) {
				str += "[" + aux.getData() + "]->";
				aux = aux.getNext();
			} else {
				break;
			}
		}
		return str;
	}


}
