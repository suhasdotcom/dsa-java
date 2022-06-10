package sks.dsa.tree.bst.base.iterator;

import sks.dsa.tree.bst.base.node.BinaryNode;
import sks.dsa.tree.bst.base.tree.BinaryTree;

import java.util.Iterator;

public interface BinaryTreeIterator<ValueType> extends
        TreeIterator<ValueType,
                BinaryNode<ValueType>,
                BinaryTree<ValueType>>,
        Iterator<BinaryNode<ValueType>>
{

}
