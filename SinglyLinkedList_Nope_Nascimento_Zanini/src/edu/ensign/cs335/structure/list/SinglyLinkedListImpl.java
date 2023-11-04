package edu.ensign.cs335.structure.list;



public class SinglyLinkedListImpl implements SinglyLinkedList<Integer> {
	private Node head;

	@Override
	public void append(Integer data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getSize() {
		int size = 1;
		Node tmp = head;
		try{
			while (tmp.getNext()!= null) {
				size++;
				tmp = tmp.getNext();
			}
		} catch (Exception e) {
			size = 0;
		}
		return size;
	}

	@Override
	public int getCount() {
		int count = 1;
		Node tmp = head;
		try {
		while (tmp.getNext()!= null) {
			if (tmp.getData()!=null) {
				count++;
			}
			tmp = tmp.getNext();
		}}catch(Exception e) {
			count = 0;
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
	public void insert(Integer data) {
		Node tmp = head;
		while (tmp.getNext()!= null) {
			tmp = tmp.getNext();
		}
		Node intemp = new Node(data);
		tmp.setNext(intemp);
	}

	@Override
	public void insertNth(Integer data, int index) {
		Node tmp = head;
		while (--index>0) {
			tmp=tmp.getNext();
		}
		Node tmp2 =tmp.getNext();
		Node intemp = new Node(data);
		tmp.setNext(intemp);
		intemp.setNext(tmp2);
	}

	@Override
	public void insertHead(Integer data) {
		Node tmp = head;
		head = new Node(data);
		head.setNext(tmp);
	}

	@Override
	public boolean search(Integer data) {
		boolean val = false;
		Node tmp = head;
		do {
			if ((Integer)tmp.getData()==data) {
				
				System.out.println(tmp.getData());
				System.out.println(data);
				val=true;
				break;
			}
			tmp=tmp.getNext();
		} while(tmp.getNext()!=null);
		return val;
	}

	@Override
	public Integer getNth(int index) {
		Node tmp = head;
		while (--index>0) {
			tmp=tmp.getNext();
		}
		return (Integer)tmp.getData();
	}

	@Override
	public boolean delete() {
		int size=getSize();
		Node tmp = head;
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
		Node tmp = head;
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
		Node tmp = head;
		String cont = "";
		int i = 0;
		while(tmp.getNext()!=null) {
			cont=cont+tmp.getData()+" -> ";
			tmp=tmp.getNext();
		}
		cont=cont+tmp.getData();
		return cont;
	}

	@Override
	public void clear() {
		head.setNext(null);
	}

}
