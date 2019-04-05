import java.util.Iterator;

public class Sistema {

	public static void main(String[] args) {
		MySimpleLinkedList lista1 = new MySimpleLinkedList();
		lista1.insertFront(5);
		lista1.insertFront(8);
		lista1.insertFront(2);
		lista1.insertFront(1);
		MySimpleLinkedList lista2 = new MySimpleLinkedList();
		lista2.insertFront(4);
		lista2.insertFront(2);
		lista2.insertFront(1);
		lista2.insertFront(7);
				
		//estaOrdenado(0);
		MySimpleLinkedList dif = diferencia(lista1, lista2);
		dif.print(dif.size());
	}
	
	public static MySimpleLinkedList diferencia(MySimpleLinkedList lista1, MySimpleLinkedList lista2) {
		Iterator <Object> itlista1 = lista1.iterator();
		boolean encontrado = false;
		MySimpleLinkedList resultado = new MySimpleLinkedList();
		while(itlista1.hasNext()) {
			encontrado = false;
			Object auxlista1 = itlista1.next();
			Iterator <Object> itlista2 = lista2.iterator();
			while(itlista2.hasNext() && !encontrado) {
				Object auxlista2 = itlista2.next();			
				if(auxlista1.equals(auxlista2)) {
					encontrado = true;
				}
			}	
			if(!encontrado) {
				resultado.insertFront(auxlista1);
			}
		}
		return resultado;
	}
	
	public static boolean estaOrdenado(int i) {
		int arr[] = {1, 2, 3, 7, 9, 10};
		if(i >= arr.length-1) {
			return true;
		}else {
		if(arr[i] < arr[i+1]) 
			return estaOrdenado(i+1);
		
		else 
			return false;
		}
	}
}
