package doublyLinkedList;



public class ListDoublyLinked<T> {
	
	private  Node<T> lastNode;

	public ListDoublyLinked() {
		this.lastNode = null;
	}
	
	public boolean isEmpity() {
		return lastNode == null ? true : false;
	}
	
	public void add(T data) {
		Node<T> aux = new Node<>(data);
		if(lastNode == null) {
			lastNode = aux;
			return;
		} else {
			
			aux.setBefore(lastNode);
			lastNode.setNext(aux); 
			lastNode = aux;
		}
	}
	
	public void addAtFirst(T data) {
		Node<T> aux2 = lastNode;
		Node<T> aux = new Node<>(data);
		while(true) {
			if(aux2.getBefore() != null) {
				aux2 = aux2.getBefore();
			} else {
				aux2.setBefore(aux);
				aux.setNext(aux2);
				break;
			}
		}
	}
	
	public void addBefore(T index, T newData) {
		Node<T> aux = new Node<>(newData);
		Node<T> aux2 = lastNode;
		while(true) {
			if(lastNode.getData().equals(index)) {
				lastNode.setNext(aux);
				aux.setBefore(lastNode);
				lastNode = aux;
				return;
			}
			if(aux2.getData().equals(index)) {
				aux.setBefore(aux2);
				aux.setNext(aux2.getNext());
				aux2.getNext().setBefore(aux);
				aux2.setNext(aux);
				break;
			} else {
				aux2 = aux2.getBefore();
			}
		}
	}
	
	public void addNext(T index, T newData) {
		Node<T> aux = new Node<>(newData);
		Node<T> aux2 = lastNode;
		while(true) {
			if(lastNode.getData().equals(index)) {
				aux.setBefore(lastNode.getBefore());
				aux.setNext(lastNode);
				lastNode.getBefore().setNext(aux);
				lastNode.setBefore(aux);
				return;
			}
			if(aux2.getData().equals(index)) {
				aux.setBefore(aux2.getBefore());
				aux.setNext(aux2);
				aux2.getBefore().setNext(aux);
				aux2.setBefore(aux);
				break;
			} else {
				aux2 = aux2.getBefore();
			}
		}
	}
	
	public T removeLast() {
		Node<T> aux = lastNode;
		lastNode = lastNode.getBefore();
		return aux.getData();
	}
	
	public T removeFirst() {
		Node<T> aux = lastNode;
		Node<T> aux2 = null;
		while(true) {
			if(aux.getBefore() != null) {
				aux = aux.getBefore();
			} else {
				aux2 = aux;
				aux.getNext().setBefore(null);
				break;
			}
		}
		return aux2.getData();
	}
	
	public T delete(T data) {
		Node<T> aux = lastNode;
		if(lastNode.getData().equals(data)) {
			aux = lastNode;
			lastNode = lastNode.getBefore();
			return aux.getData();
		}
		while(true) {
			if(aux != null) {				
				if(aux.getData().equals(data)) {
					aux.getNext().setBefore(aux.getBefore());
					break;
				} else {
					aux = aux.getBefore();
				}
			} else {
				return null;
			}
		}
		return aux.getData();
	}
	
	public String toStringForWard() {
		Node<T> aux = lastNode;
		String str = "";
		while(true) {
			if(aux != null) {
				str += "[" + aux.getData() + "]";
				aux = aux.getBefore();
			} else {
				break;
			}
		}
		return str;
	}

	public String toStringBackWard() {
		Node<T> aux = lastNode;
		String str = "";
		while(true) {
			if(aux.getBefore() != null) {
				aux = aux.getBefore();
			} else {
				while(true) {
					if(aux != null ) {
						str += "[" + aux.getData() + "]";
						aux = aux.getNext();
					} else {
						break;
					}
				}
				break;
			}
		}
		return str;
	}
	

}
