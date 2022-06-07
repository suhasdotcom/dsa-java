package sks.dsa.tree.bst.base.tree;

import sks.dsa.tree.bst.base.node.BinaryNode;

/**
 * A tree with max two children per node.
 * @param <T> Type of data this tree nodes can store
 */
public interface BinaryTree<T> extends Tree<BinaryNode<T>>
{
    /**
     * @return is this a balanced binary tree
     */
    boolean isTreeBalanced();

    /**
     * @return is thi a complete binary tree
     */
    boolean isTreeComplete();
}
