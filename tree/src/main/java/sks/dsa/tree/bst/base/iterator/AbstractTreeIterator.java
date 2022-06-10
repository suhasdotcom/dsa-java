package sks.dsa.tree.bst.base.iterator;

import sks.dsa.tree.bst.base.node.SelfReferentialNode;
import sks.dsa.tree.bst.base.tree.Tree;

public abstract class AbstractTreeIterator <ValueType,
        NodeType extends SelfReferentialNode<ValueType>,
        TreeType extends Tree<ValueType, NodeType>>
        implements TreeIterator<ValueType, NodeType, TreeType>
{
    private final TreeType tree;

    public AbstractTreeIterator(final TreeType tree)
    {
        this.tree = tree;
    }

    @Override
    public TreeType getTree() {
        return this.tree;
    }
}
