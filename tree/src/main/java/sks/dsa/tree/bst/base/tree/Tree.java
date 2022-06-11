package sks.dsa.tree.bst.base.tree;

import sks.dsa.tree.bst.base.node.SelfReferentialNode;

public interface Tree<ValueType,
        NodeType extends SelfReferentialNode<ValueType>>
        extends Iterable<NodeType>
{
    NodeType getRoot();
    int getMaxTreeDepth();
    int getMaxTreeHeight();
    int getNumberOfChildren();
    int size();
}
