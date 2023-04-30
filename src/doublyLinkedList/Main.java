package doublyLinkedList;

public class Main {

	public static void main(String[] args) {
		
		ListDoublyLinked<Integer> list = new ListDoublyLinked<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		System.out.println(list.toStringForWard());
		
		list.removeFirst();
		System.out.println(list.toStringForWard());
		list.removeFirst();
		System.out.println(list.toStringForWard());
		int a = list.removeFirst();
		System.out.println(list.toStringForWard());

		list.addAtFirst(3);
		System.out.println(list.toStringForWard());
		list.addAtFirst(10);
		System.out.println(list.toStringForWard());
		list.addBefore(4, 1500);
		System.out.println(list.toStringForWard());
		list.addBefore(3, 2500);
		System.out.println(list.toStringForWard());
		list.addBefore(10, 8000);
		System.out.println(list.toStringForWard());
		list.addBefore(5, 4500);
		System.out.println(list.toStringForWard());
		list.addNext(4500, 500);
		System.out.println(list.toStringForWard());
		list.addNext(4500, 11500);
		System.out.println(list.toStringForWard());
		list.addNext(5, 2023);
		System.out.println(list.toStringForWard());

		list.addNext(3, 999);
		System.out.println(list.toStringForWard());
		list.addNext(8000, 69);
		System.out.println(list.toStringForWard());
		System.out.println(list.toStringBackWard());
	}
	
}
