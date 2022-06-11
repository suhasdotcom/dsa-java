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

    void buildTreeFromSequence(final ValueType[] values);
    void buildTreeFromSequence(final NodeType [] nodes);
    void buildTreeFromSequence(final Collection<ValueType> values);
    void buildTreeFromSequence(final List<NodeType> nodes);
}
