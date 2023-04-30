package tree;

import java.util.Objects;

public class Node<T extends Comparable<T>> {

	private T data;
	private Node<T> left;
	private Node<T> rigth;
	
	
	public Node(T data) {
		this.data = data;
		this.left = null;
		this.rigth = null;
	}
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getLeft() {
		return left;
	}
	public void setLeft(Node<T> left) {
		this.left = left;
	}
	public Node<T> getRigth() {
		return rigth;
	}
	public void setRigth(Node<T> rigth) {
		this.rigth = rigth;
	}
	
	public int compareTo(T data) {
		return this.data.compareTo(data);
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, left, rigth);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		return Objects.equals(data, other.data) && Objects.equals(left, other.left)
				&& Objects.equals(rigth, other.rigth);
	}


	
	
}
