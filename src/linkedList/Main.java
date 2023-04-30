package linkedList;

public class Main {
	
	public static void main(String[] args) {
		
		ListLinked<Object> teste = new ListLinked<>();
		teste.add("abelha");
		teste.add("Elefante");
		teste.add("Leão");
		
		System.out.println(teste.toString());
		System.out.println(teste.isEmpity());
		
		teste.remove("abelha");
		System.out.println(teste.toString());
		teste.add(1);
		System.out.println(teste.search(1));
		System.out.println(teste.toString());
	}

}
