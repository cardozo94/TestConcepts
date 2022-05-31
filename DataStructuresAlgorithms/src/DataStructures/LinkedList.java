package DataStructures;

import java.util.NoSuchElementException;

public class LinkedList {

	private class Node {

		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
		}
	}

	private Node first;
	private Node last;
	private int index = 0;

	public void addLast(int item) {
		Node node = new Node(item);
		if (first == null) {
			first = last = node;
		} else {
			last.next = node;
			last = node;
		}
		index++;
	}

	public void addFirst(int item) {
		Node node = new Node(item);
		if (first == null) {
			last = node;
		} else {
			node.next = first;
		}
		first = node;
		index++;
	}

	public int indexOf(int value) {
		if (first.value == value) {
			return 0;
		} else if (last.value == value) {
			return this.index;
		} else {
			int index = 1;
			Node next = first.next;
			while (next != null) {
				if (next.value == value) {
					return index;
				}
				index++;
				next = next.next;
			}
		}
		return -1;
	}

	public boolean contains(int value) {

		return indexOf(value) != -1;
	}

	public int size() {
		return index;
	}

	public int[] toArray() {
		int[] array = new int[index];
		Node next = null;
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				array[i] = first.value;
				next = first.next;
			} else {
				array[i] = next.value;
				next = next.next;
			}
		}
		return array;
	}

	public void removeFirst() {
		if (first != null) {
			if (first.next != null) {
				Node next = first.next;
				first.next = null;
				first = next;
			}else {
				first = last = null;
			}
			index--;
		}else
			throw new NoSuchElementException();
	}
	public void removeLast() {
		if(last != null) {
			if (first.next != null) {
				Node next = first;
				while (next.next != last) {
					next = next.next;
				}
				last = next;
				last.next = null;
			}else {
				first = last = null;
			}
			index--;
		}else
			throw new NoSuchElementException();
	}

	public String toString() {
		StringBuilder sbuilder = new StringBuilder("[");
		try {
			sbuilder.append(first.value + ", ");
			Node next = first.next;
			while (next != null) {
				sbuilder.append(next.value + ", ");
				next = next.next;
			}
			sbuilder.replace(sbuilder.length() - 2, sbuilder.length(), "]");
		} catch (NullPointerException e) {
			sbuilder.append("]");
		}

		return sbuilder.toString();
	}

}
