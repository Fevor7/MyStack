package by.htp.stack;

public class MyStack<E> {
	private int size;
	private Element<E> element;
	private Element<E> first;

	public MyStack() {
		size = 0;
		first = null;
		element = new Element<E>();
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
		if ((number>=0)&&(number<size)) {
			Element<E> el = first;
			if(number==0) {
				return el.e;
			}
			for (int i = 1; i <size; i++ ){
				el=el.next;
				return el.e;
			}
		}
		return null;
	}
	public int size(){
		return size;
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
