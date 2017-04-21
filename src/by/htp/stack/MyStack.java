package by.htp.stack;

public class MyStack<E> {
	private int size;
	private Element<E> element;
	private Element<E> first;

	public MyStack() {
		size = 0;
		first = null;
		element = null;
	}

	public MyStack(E e) {
		this();
		if (e != null) {
			add(e);
		}
	}

	public void add(E e) {
		if (e != null) {
			Element<E> el = first;
			first = new Element<E>(e);
			first.next = el;
			size++;
		}
	}

	public E get(int number) {
		if ((number >= 0) && (number < size)) {
			Element<E> el = first;
			if (number == 0) {
				return el.e;
			}
			for (int i = 0; i < number; i++) {
				el = el.next;
			}
			return el.e;
		}
		return null;
	}

	public int size() {
		return size;
	}

	public boolean empty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	public E peek() {
		return first.e;
	}

	public E pop() {
		E e = first.e;
		if (size == 1) {
			size = 0;
			first = null;
			element = null;
		} else {
			Element<E> el = first;
			first = el.next;
			size--;
		}
		return e;
	}

	public void push(E e) {
		Element<E> el = first;
		first = new Element<E>(e);
		first.next = el;
		size++;
	}

	public int search(E e) {
		Element<E> el = first;
		for (int i = 0; i < size; i++) {
			if (e.equals(el.e)) {
				return i;
			}
			el = el.next;
		}
		return -1;
	}

	private class Element<E> {
		private E e;
		private Element<E> next;

		private Element() {
			this.e = null;
			this.next = null;
		}

		private Element(E e) {
			this.e = e;
			this.next = null;
		}

		private Element(E e, Element next) {
			this.e = e;
			this.next = next;
		}
	}
}
