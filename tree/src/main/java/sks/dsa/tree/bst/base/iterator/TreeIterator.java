package sks.dsa.tree.bst.base.iterator;

import sks.dsa.tree.bst.base.node.Node;
import sks.dsa.tree.bst.base.tree.Tree;

import java.util.Iterator;

public interface TreeIterator<NodeType extends Node<?, ? extends NodeType>,
        TreeType extends Tree<NodeType>>
    extends Iterator<NodeType>
{
    NodeType getRoot();
    int size();
}
