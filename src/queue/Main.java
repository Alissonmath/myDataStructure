package queue;

public class Main {
	
	public static void main(String[] args) {
		
		ListQueue<Double> list = new ListQueue<>();
		
		list.enQueue(1.0);
		list.enQueue(2.0);
		list.enQueue(1.0);
		list.enQueue(2.0);
		list.enQueue(1.0);
		list.enQueue(2.0);
		list.enQueue(1.0);
		list.enQueue(2.0);


		list.deQueue();
		System.out.println(list.toString());
		list.deQueue();

	}

}
