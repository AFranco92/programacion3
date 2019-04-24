package tp2e6;

public class Sistema {
	
	public static void main(String[] args) {
		ArbolBinarioBusqueda nuevoarbol = new ArbolBinarioBusqueda();
		nuevoarbol.insert(2);
		nuevoarbol.insert(1);
		nuevoarbol.insert(4);
		nuevoarbol.insert(3);
		nuevoarbol.insert(5);
		
		nuevoarbol.getFrontera();
	}
}
