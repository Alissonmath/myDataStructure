package tree;

public class BinaryTree<T extends Comparable<T>> {
	
	private Node<T> root;
	
	BinaryTree(){
		this.root = null;
	}
	
	public Node<T> getRoot(){
		return this.root;
	}
	
	public boolean isEmpity() {
		return root == null ? true : false;
	}
	
	private void add(Node<T> node1, Node<T> root) {
		if(this.root == null) {
			this.root = node1;
			return;
		} else if(node1.getData().compareTo(root.getData()) < 0) {
			if(root.getLeft() != null) {
				add(node1, root.getLeft());
			} else {
				root.setLeft(node1);
			}
		} else if (node1.getData().compareTo(root.getData()) > 0) {
			if(root.getRigth() != null) {
				add(node1, root.getRigth());
			} else {
				root.setRigth(node1);
			}
		}
	}
	
	public void add(T data) {
		Node<T> aux =  new Node<>(data);
		add(aux, root);
	}
	
	private void showInOrder(Node<T> node) {
		if(node != null) {
			showInOrder(node.getLeft());
			System.out.println(node.getData());
			showInOrder(node.getRigth());
		}
	}
	
	public void displayInOrder() {
		 showInOrder(root);
	}

	private void showInPosOrder(Node<T> node) {
		if(node != null) {
			showInPosOrder(node.getRigth());
			System.out.println(node.getData());
			showInPosOrder(node.getLeft());
		}
	}
	
	public void displayInPosOrder() {
		showInPosOrder(root);
	}
	
	private void showInPreOrder(Node<T> node) {
		if(node != null) {			
			System.out.println(node.getData());
			showInPreOrder(node.getLeft());
			showInPreOrder(node.getRigth());
		}
	}
	
	public void displayInPreOrder() {
		showInPreOrder(root);
	}
	
	public T search(T data) {
		Node<T> current = this.root;
		while(true) {
			if(current != null) {
				if(data.compareTo(current.getData()) == 0) {
					return current.getData();					
				} else if (data.compareTo(current.getData()) < 0) {
					current = current.getLeft();
				} else if (data.compareTo(current.getData()) > 0) {
					current = current.getRigth();
				}
			} else {
				break;
			}
		}
		return null;
	}
	

	
	public void remove(T data) {
		Node<T> current = this.root;
		Node<T> dad = null;
		Node<T> son = null;
		Node<T> temp = null;
		while(current != null && !(current.getData().compareTo(data) == 0)) {//encontrar o conteúdo
				dad = current;
				if(data.compareTo(current.getData()) == 0) {
					break;
				} else if(data.compareTo(current.getData()) < 0) {
					
					current = current.getLeft();
				} else if (data.compareTo(current.getData()) > 0) {
					current = current.getRigth();
				}			
		}
		
		if(current == null) {//Se não existir o conteúdo
			System.out.println("Data dont exist!");
			return;
		}
		if(dad == null) {// quando o nó a ser removido é a raiz
			if(current.getLeft() == null) {
				this.root = current.getRigth();
			} else if(current.getRigth() == null) {
				this.root = current.getLeft();
			} else {
				for(temp = current, son = current.getLeft(); son.getRigth() != null; temp = son, son = son.getLeft()) {
					if(son != current.getLeft()) {
						temp.setRigth(son.getLeft());
						son.setLeft(root.getLeft());
					}
				}
				son.setRigth(root.getRigth());
				root = son;
			}
		} else if (current.getRigth() == null) {// quando o nó a ser removido tem somente um filho
			if(dad.getLeft() == current) {
				dad.setLeft(current.getLeft());
			} else {
				dad.setRigth(current.getLeft());
			}
		} else if (current.getLeft() == null) {
			if(dad.getRigth() == current) {
				dad.setRigth(current.getRigth());
			} else {
				dad.setLeft(current.getRigth());
			}
		} else {
			for(temp = current, son = son.getLeft(); son.getRigth() != null; temp = son, son = son.getRigth()) {
				if(son != current.getLeft()) {
					temp.setRigth(son.getLeft());
					son.setLeft(current.getLeft());
					
				}
				son.setRigth(current.getRigth());
				if(dad.getLeft() == current) {
					dad.setLeft(son);
				} else {
					dad.setRigth(son);
				}
			}
		}
		
	}
	

	
	
	
	public Node<T> getMinNode(Node<T> root){
		while(true) {
			if(root.getLeft() != null) {
				root = root.getLeft();
			} else {
				break;
			}
		}
		return root;
	}

	
	


}
