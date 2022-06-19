package sks.dsa.tree.bst.base.tree.binaryTree.searchTree;

import sks.dsa.tree.bst.base.tree.binaryTree.BinaryTree;

/**
 * A binary-search-tree is-a binary-tree which can be arranged by using its values' comparator such that all the nodes to left of a root node contain less value than that of roots' value and all the nodes to the right of root node have greater value than root node's value
 * @param <ValueType>
 */
public interface BinarySearchTree<ValueType extends Comparable<ValueType>> extends BinaryTree<ValueType> {
}
