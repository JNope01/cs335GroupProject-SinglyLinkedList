package edu.ensign.cs335.structure.list;


/**
 * By: Jonathan Nope & Yuri Zanini
 * SinglyLinkedListImpl class.
 * Functional Backbone of the SinglyLinkedList class
 * implementing all the functions.
 * @param <T>
 */
public class SinglyLinkedListImpl<T> implements SinglyLinkedList<T> {
	private Node<T> head;

	@Override
	public void append(T data) {
		Node<T> tmp = head;
		while (tmp.getNext()!= null) {
			tmp = tmp.getNext();
		}
		Node<T> inTemp = new Node<T>(data);
		tmp.setNext(inTemp);
	}

	@Override
	public int getSize() {
		int size = 0;
		Node<T> tmp = head;
		while (tmp!= null) {
				size++;
				tmp = tmp.getNext();
		}
		return size;
	}

	@Override
	public int getCount() {
		int count = 0;
		Node<T> tmp = head;
		
		while (tmp!= null) {
			if (tmp.getData()!=null) {
				count++;
			}
			tmp = tmp.getNext();
		}
		return count;
	}

	@Override
	public boolean isEmpty() {
		boolean test= false;
		try{
			head.getNext();
		}catch(Exception e) {
			test = true;
		}
		return test;
	}

	@Override
	public void insert(T data) {
		Node<T> tmp = head;
		while (tmp.getNext()!= null) {
			tmp = tmp.getNext();
		}
		Node<T> intemp = new Node<T>(data);
		tmp.setNext(intemp);
	}

	@Override
	public void insertNth(T data, int index) {
		Node<T> tmp = head;
		while (--index>0) {
			tmp=tmp.getNext();
		}
		Node<T> tmp2 =tmp.getNext();
		Node<T> intemp = new Node<T>(data);
		tmp.setNext(intemp);
		intemp.setNext(tmp2);
	}

	@Override
	public void insertHead(T data) {
		Node<T> tmp = head;
		head = new Node<T>(data);
		head.setNext(tmp);
	}

	@Override
	public boolean search(T data) {
		boolean val = false;
		Node<T> tmp = head;
		while(tmp!=null) {
			if ((Integer)tmp.getData()==data) {
				val=true;
				break;
			}
			tmp=tmp.getNext();
		}
		return val;
	}

	@Override
	public T getNth(int index) {
		Node<T> tmp = head;
		while (index>0) {
			tmp=tmp.getNext();
			index--;
		}
		return (T)tmp.getData();
	}

	@Override
	public boolean delete() {
		int size=getSize();
		Node<T> tmp = head;
		while (--size>1) {
			tmp=tmp.getNext();
		}
		tmp.setNext(null);
		return false;
	}

	@Override
	public boolean deleteHead() {
		head=head.getNext();
		return false;
	}

	@Override
	public boolean deleteNth(int index) {
		Node<T> tmp = head;
		while (--index>1) {
			tmp=tmp.getNext();
		}
		if(tmp.getNext().getNext()==null) {
			tmp.setNext(null);
		}
		tmp.setNext(tmp.getNext().getNext());
		return false;
	}
	
	@Override
	public String toString() {
		Node<T> tmp = head;
		String cont = "";
		while(tmp.getNext()!=null) {
			cont=cont+tmp.getData()+" -> ";
			tmp=tmp.getNext();
		}
		cont = cont + tmp.getData();
		return cont;
	}

	@Override
	public void clear() {
		head=null;
	}

}
