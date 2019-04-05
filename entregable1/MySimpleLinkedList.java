import java.util.Iterator;

public class MySimpleLinkedList implements Iterable<Object> {
	
	protected Node first;
	
	public MySimpleLinkedList() {
		this.first = null;
	}
	
	public void insertFront(Object o) {
		Node tmp = new Node(o, null);
		tmp.setNext(first);
		this.first = tmp;
	}
	
	public Object extractFront() {
		Node aux = this.first.getNext();
		Node retorno = this.first;
		this.first = aux;
		return retorno.getInfo();
	}
	
	public void print(int n) {
		int i = 0;
		Node aux = this.first;
		while(i < n) {
			System.out.println(aux.getInfo());
			aux = aux.getNext();
			i++;
		}
	}
	
	public boolean isEmpty() {
		return this.first == null;
	}
	
	public int size() {
		int i = 0;
		Node aux = this.first;
		while(aux != null) {
			i++;
			aux = aux.getNext();
		}
		return i;
	}
	
	public Object get(int i) {
		Object info;
		Node tmp = this.first;
		for(int j = 1; j < i; j++) {
			tmp = tmp.getNext();
		}
		info = tmp.getInfo();
		return info;
	}
	
	public Iterator<Object> iterator() {
		return new MyIterator(this.first);
	}
	
	public int max() {
		int max = 0;
		Iterator<Object> itlista = this.iterator();
		while(itlista.hasNext()) {
			Integer num = (Integer) itlista.next();
			if(num > max) {
				max = num;
			}
		}
		return max;
	}
}
