package com.blz.bst;

public class MyBinaryTree<K extends Comparable<K>> {

	private MyBinaryNode<K> root;

	/* Adds element using recursion */
	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}

	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
		if (current == null)
			return new MyBinaryNode<>(key);
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0)
			return current;

		if (compareResult < 0)
			current.left = addRecursively(current.left, key);
		else if (compareResult > 0)
			current.right = addRecursively(current.right, key);
		return current;
	}

	/* get size using recursion */
	public int size() {
		return this.getSizeRecursively(root);
	}

	private int getSizeRecursively(MyBinaryNode<K> current) {
		return (current == null) ? 0 : 1 + getSizeRecursively(current.left) + getSizeRecursively(current.right);
	}

}