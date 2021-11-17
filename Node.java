public class Node<T>{
		T this.data;
		Node next; 

		public Node(T data){
			this.data = data;
		}

		public void setNext(Node next){
			this.next = next;
		}

		public void setData(T data){
			this.data = data;
		}

		public Node getNext(){
			return next;
		}
		public T getData(){
			return data;
		}

		private boolean hasNext(){
			return this.next != null;
		}
	}