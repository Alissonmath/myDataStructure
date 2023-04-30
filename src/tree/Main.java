package tree;

public class Main {

	public static void main(String[] args) {
		BinaryTree<Integer> arvore = new BinaryTree<>();
		
		arvore.add(61);
		arvore.add(89);
		arvore.add(100);
		arvore.add(90);
		arvore.add(66);
		arvore.add(79);
		arvore.add(77);
		arvore.add(82);
		arvore.add(43);
		arvore.add(51);
		arvore.add(55);
		arvore.add(16);
		arvore.add(32);
		arvore.add(11);
		arvore.displayInPreOrder();
		System.out.println("");
		System.out.println("removeu!");
		System.out.println("");
		arvore.remove(89);
		arvore.displayInPreOrder();
		
		
	}
}
//14