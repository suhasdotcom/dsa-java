package sks.dsa.tree.bst.base.iterator;

import sks.dsa.tree.bst.base.node.Node;
import sks.dsa.tree.bst.base.tree.Tree;

public interface TreeIterator<T extends Tree<?>>
{
    <NodeType extends Node<?, ?>> NodeType getRoot();
    int size();
}
