package tp2e6;

public class Node {
	
	private int key, value;
	private ArbolBinarioBusqueda left, right;
	
	public Node(int key, int value) {
		this.key = key;
		this.value = value;
	}
	
	public Node(int key) {
		this.key = key;
	}
	
	public ArbolBinarioBusqueda getLeft() {
		return this.left;
	}
	
	public void setLeft(ArbolBinarioBusqueda l) {
		this.left = l;
	}
	
	public ArbolBinarioBusqueda getRight() {
		return this.right;
	}
	
	public void setRight(ArbolBinarioBusqueda r) {
		this.right = r;
	}
	
	public int getKey() {
		return this.key;
	}
	
	public void setKey(int k) {
		this.key = k;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void setValue(int v) {
		this.value = v;
	}
}
