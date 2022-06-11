package sks.dsa.tree.bst.base.iterator.binaryTree.ordered;

import sks.dsa.tree.bst.base.iterator.binaryTree.BinaryTreeIterator;
import sks.dsa.tree.bst.base.node.binaryTree.BinaryNode;
import sks.dsa.tree.bst.base.tree.binaryTree.BinaryTree;

public class InOrderBinaryTreeIterator <ValueType>
        implements BinaryTreeIterator<ValueType>
{

    @Override
    public BinaryNode<ValueType> getRoot() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public BinaryTree<ValueType> getTree() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public BinaryNode<ValueType> next() {
        return null;
    }
}