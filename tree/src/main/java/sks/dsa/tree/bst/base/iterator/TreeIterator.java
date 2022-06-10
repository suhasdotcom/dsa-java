package sks.dsa.tree.bst.base.iterator;

import sks.dsa.tree.bst.base.node.SelfReferentialNode;
import sks.dsa.tree.bst.base.tree.Tree;

import java.util.Iterator;

public interface TreeIterator<ValueType,
        NodeType extends SelfReferentialNode<ValueType>,
        TreeType extends Tree<ValueType, NodeType>>
    extends Iterator<NodeType>
{
    NodeType getRoot();
    int size();

    TreeType getTree();
}
