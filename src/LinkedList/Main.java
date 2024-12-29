package LinkedList;
//TODO Вторая задача
public class Main {
	public static void main(String[] args) {
        NumLinkedList linkedList = new NumLinkedList();
		System.out.println("Список   до  замены: " + linkedList.getNums());
		System.out.println("Список после замены: " + linkedList.swapNums());
	}
}
