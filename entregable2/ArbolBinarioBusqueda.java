package tp2e6;

import java.util.List;
import java.util.ArrayList;

public class ArbolBinarioBusqueda {
	
	private Node root;
	
	public ArbolBinarioBusqueda(Node root) {
		this.root = root;
	}
	
	public ArbolBinarioBusqueda() {
		this.root = null;
	}
	
	public Object getRoot() {
		return this.root;
	}
	
	public void setRoot(Node r) {
		this.root = r;
	}
	
	public boolean isEmpty() {
		return this.root == null;
	}
	
	public boolean hasElem(int elem) {
		if(!this.isEmpty()) {
			if(elem == this.root.getKey()) {
				return true;
			}
			else {
				if(elem < this.root.getKey()) {
					this.root.getLeft().hasElem(elem);
				}
				else {
					this.root.getRight().hasElem(elem);
				}
			}
		}
		return false;
	}
	
	public void insert(int o) {
		if(this.isEmpty()) {
			Node n = new Node(o);
			n.setLeft(new ArbolBinarioBusqueda());
			n.setRight(new ArbolBinarioBusqueda());
			this.root = n;
		}
		else {
			if(o > this.root.getKey()) {
				this.root.getRight().insert(o);
			}
			if(o < this.root.getKey()) {
				this.root.getLeft().insert(o);
			}
		}
	}
	
	public ArbolBinarioBusqueda buscar(Object o) {
		int k = (Integer) o;
		ArbolBinarioBusqueda resultado = null;
		if(!this.isEmpty()) {
			if(o.equals(this.root.getKey())) {
				return this;
			}
			else {
				if(k < this.root.getKey()) {
					resultado = this.root.getLeft().buscar(o);
				}
				else {
					resultado = this.root.getRight().buscar(o);
				}
			}
		}
		return resultado;
	}
	
	public boolean esHoja() {
		return this.root.getLeft().isEmpty() && this.root.getRight().isEmpty();
	}
	
	public void printPreOrder() {
		if(this.root != null) {
			System.out.println("| "+this.root.getKey()+ " |");
			this.root.getLeft().printPreOrder();
			this.root.getRight().printPreOrder();
		}
	}
	
	public void printInOrder() {
		if(this.root != null) {
			this.root.getLeft().printInOrder();
			System.out.println("| "+this.root.getKey()+ " |");
			this.root.getRight().printInOrder();
		}
	}
	
	public void printPosOrder() {
		if(this.root != null) {
			this.root.getLeft().printInOrder();
			this.root.getRight().printInOrder();
			System.out.println("| "+this.root.getKey()+ " |");
		}
	}
	
	public boolean hasOneChild() {
		return (!this.root.getLeft().isEmpty() && this.root.getRight().isEmpty()) ||
				(this.root.getLeft().isEmpty() && !this.root.getRight().isEmpty());
	}
	
	public boolean hasTwoChild() {
		return !this.root.getLeft().isEmpty() && !this.root.getRight().isEmpty();
	}
	
	public List<Object> getFrontera() {
		ArrayList<Object> resultado = new ArrayList<>();
		if(!this.isEmpty() && !this.root.getLeft().isEmpty()) {
			resultado.addAll(this.root.getLeft().getFrontera());
		}
		if(!this.isEmpty() && !this.root.getRight().isEmpty()) {
			resultado.addAll(this.root.getRight().getFrontera());
		}
		if(this.esHoja()) {
			resultado.add(this);
		}
		return resultado;
	}
}
