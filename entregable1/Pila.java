public class Pila {
	
	private MySimpleLinkedList lista;
	
	public void push(Object o) {
		lista.insertFront(o);
	}
	
	public Object pop() {
		return lista.extractFront();
	}
	
	public Object top() {
		return lista.get(0);
	}
	
	public void reverse() {
		int i = 0;
		int size = lista.size();
		MySimpleLinkedList copia = new MySimpleLinkedList();
		while(i < size) {
			copia.insertFront(lista.extractFront());
			i++;
		}
	}
}
