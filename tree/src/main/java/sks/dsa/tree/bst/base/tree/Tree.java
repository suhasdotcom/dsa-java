package sks.dsa.tree.bst.base.tree;

import sks.dsa.tree.bst.base.node.Node;

public interface Tree<NodeType extends Node<?, ? extends Node<?, ?>>> extends Iterable<NodeType>
{
    NodeType getRoot();
    int getMaxTreeDepth();
    int getMaxTreeHeight();
    int getNumberOfChildren();
    int size();
}
