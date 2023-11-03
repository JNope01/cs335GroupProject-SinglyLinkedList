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
		while (tmp.getNext()!= null) {
			System.out.print(tmp.getData()+" > ");
			size++;
			tmp = tmp.getNext();
		}
		System.out.print(tmp.getData());
		System.out.println();
		return size;
	}

	@Override
	public int getCount() {
		int count = 1;
		Node tmp = head;
		while (tmp.getNext()!= null) {
			if (tmp.getData()!=null) {
				count++;
			}
			tmp = tmp.getNext();
		}
		return count;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
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
		/*Debug*/
		System.out.print("Current head: "+data);
		try {
			if (tmp.getData()!= null) {
				System.out.println(" Former: "+tmp.getData());
			}
		} catch(Exception e) {
			System.out.println();
		}
		/*Debug*/
		head.setNext(tmp);
	}

	@Override
	public boolean search(Integer data) {
		boolean val = false;
		Node tmp = head;
		while(tmp.getNext()!=null) {
			if (tmp.getData()==data) {
				val=true;
			}
		}
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
	public void clear() {
		head.setNext(null);
	}

}
