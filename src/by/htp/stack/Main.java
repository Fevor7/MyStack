package by.htp.stack;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		workWithMyStack();
	}
	private static void workWithMyStack(){
		Person person = new Person("Vasya", 18);
		MyStack<Person> stack = new MyStack<Person> (person);
		stack.add(new Person("Petya", 21));
		stack.add(new Person("Vitya", 27));
		for (int i =0; i<stack.size(); i++){
			System.out.println(stack.get(i));
		}
		Stack<Person> st = new Stack<Person> ();
	}
}
