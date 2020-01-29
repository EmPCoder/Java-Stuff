/**
 * 
 * @author Matthew Hudock This class defines the Singly Linked List that will be
 *         used in the program to sort the data passed in by the text file
 *         employee.txt.
 * @param <E>
 */

public class SLList<E extends Comparable> {

	private Node<E> head;
	private int size;

	public SLList() {

		head = null;
		size = 0;
	}

	/**
	 * This method is the add method that will be used in the singly linked list
	 * 
	 * @param item
	 */

	public void add(E item) {

		if (head == null) {

			head = new Node<E>(item, null);
			size++;
		}

		else {

			Node<E> p = head;
			while (p.next != null) {

				p = p.next;
			}

			p.next = new Node<E>(item, null);
			size++;
		}
	}

	/**
	 * This method is the get method that will be used to find data at a certain
	 * position in the singly linked list
	 * 
	 * @param index
	 * @return p.data
	 */
	public E get(int index) {

		Node<E> p = head;
		int pos = 0;

		while (pos < index) {

			p = p.next;
			pos++;
		}

		return p.data;
	}

	/**
	 * This method finds the index of target E in the Singly linked list it also
	 * compares the data to each other
	 * 
	 * @param target
	 * @return
	 */
	public int indexOf(E target) {

		Node<E> p = head;
		int index = 0;

		while (p != null) {

			if (target.compareTo(p.data) == 0) {

				return index;
			}

			p = p.next;
			index++;
		}

		return -1;

	}

	public int size() {
		return size;
	}

	private static class Node<E> {

		private E data;
		private Node<E> next;

		public Node(E data, Node<E> next) {

			this.data = data;
			this.next = next;
		}

	}

}