import java.util.Iterator;

public class MyIterator implements Iterator<Object> {
	
	private Node nodo;
	
	public MyIterator(Node nodo) {
		this.nodo = nodo;
	}
	
	public boolean hasNext() {
		return this.nodo != null;
	}
	
	public Object next() {
		Object tmp = this.nodo.getInfo();
		this.nodo = this.nodo.getNext();
		return tmp;
	}
}
