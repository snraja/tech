package com.snraja;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

class Node
{
	int data;
	public Node next;
	
	public Node(int data) {
		this.data = data;
	}
	
	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
}

class SingleLinkedList implements Iterable<Node>
{	
	Node head;
	public SingleLinkedList(Node head) {
		this.head = head;
	}

	@Override
	public Iterator<Node> iterator() 
	{
		return new Iterator<Node>() {
			@Override
			public boolean hasNext() {
				return head.next != null;
			}

			@Override
			public Node next() {
				if(head.next == null) {
					throw new NoSuchElementException();
				}
				head = head.next;
				return head;
			}
		};
	}
	
	@Override
	public void forEach(Consumer<? super Node> action) {
		
		Iterable.super.forEach(action);
	}
}


public class CustomIterator 
{
	public static void main(String[] args)
	{
		Node n3 = new Node(39, null);
		Node n2 = new Node(99, n3);
		Node n1 = new Node(132, n2);
		Node head = new Node(10, n1);
		SingleLinkedList linkedList = new SingleLinkedList(head);
		
		Iterator<Node> itr = linkedList.iterator();
		System.out.println("Printing Linked List elements in order using Iterator");
		while(itr.hasNext()) {
			System.out.println("Data: "+itr.next().data);
		}
		
		
	}
}
