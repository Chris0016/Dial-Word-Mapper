public class LinkedList<T>{

	Node head;
	Node current;
	Byte length;

	public LinkedList(Node head){
		this.head = head;
		this.current = current;
		length = 1; 
	}

	public void addNode(Node newNode){
		current.setNext(newNode);
		current = current.getNext();
		length++;
	}

	public void deleteFirst(){
		if (!isEmpty())
			return;

		Node holder = head.getNext();
		head.setNext(null);
		head = holder;
		length--;
	}

	public void removeNode(int idx){
		if (idx < 0 || idx >= length)
			return;

		else if(idx == 0){
			deleteFirst();
			return;
		}

		Node holder = head; 
		for(int i = 0; i < length -1 ; i++){
			holder = holder.getNext();
		}

		holder.setNext(holder.getNext().getNext());

		length--;

	}

	public boolean isEmpty(){
		return head.getNext() == null;
	}


	public void printList(){
		Node holder = head;
		for(int i = 0; i < size; i++){
			System.out.print.(holder.getData() + " ");
			holder = holder.getNext();
		}
	}



	

	
}