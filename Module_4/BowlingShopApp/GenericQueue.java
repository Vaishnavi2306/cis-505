package BowlingShopApp;

import java.util.LinkedList;

/**
 * Generic class representing a list of type T.
 * @param <T>
 */
public class GenericQueue<T> {
	private LinkedList<T> list = new LinkedList<T>();
	
	/**
	 * Adds the item of type T to list.
	 * @param item
	 */
	public void enqueue(T item) {
		list.addFirst(item);
	}
	
	/**
	 * Removes the first items and returns from Linked List.
	 * @return T
	 */
	public T dequeue() {
		return list.removeFirst();
	}
	
	/**
	 * Returns the size of the list.
	 * @return int
	 */
	public int size() {
		return list.size();
	}
}
