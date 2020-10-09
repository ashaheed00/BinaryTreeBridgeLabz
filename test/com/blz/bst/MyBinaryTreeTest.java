package com.blz.bst;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyBinaryTreeTest {

	@Test
	public void given3NumbersWhenAddedToBinaryTreeShouldReturnSizeThree() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);

		assertEquals(3, myBinaryTree.size());
	}

}
