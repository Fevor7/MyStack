package by.htp.stack;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		workWithMyStack();
	}
	private static void workWithMyStack(){
		Person person = new Person();
		MyStack<Person> stack = new MyStack<Person> ();
		stack.add(new Person("Petya", 21));
		stack.add(new Person("Sasha", 27));
		stack.add(new Person("Vasya", 18));
		stack.push(new Person("Sveta", 20));
		for (int i = 0; i<stack.size(); i++){
			System.out.println(stack.get(i));
		}
		Stack<Person> st = new Stack<Person> ();
		
	}
}
