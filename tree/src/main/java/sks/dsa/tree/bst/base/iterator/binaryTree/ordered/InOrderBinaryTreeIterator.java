package sks.dsa.tree.bst.base.iterator.binaryTree.ordered;

import sks.dsa.tree.bst.base.iterator.binaryTree.AbstractBinaryTreeIterator;
import sks.dsa.tree.bst.base.iterator.binaryTree.BinaryTreeIterator;
import sks.dsa.tree.bst.base.node.SelfReferentialNode;
import sks.dsa.tree.bst.base.node.binaryTree.BinaryNode;
import sks.dsa.tree.bst.base.tree.binaryTree.BinaryTree;

import java.util.Collection;
import java.util.List;
import java.util.Stack;

public class InOrderBinaryTreeIterator <ValueType>
        extends AbstractBinaryTreeIterator<ValueType>
        implements BinaryTreeIterator<ValueType>
{
    private BinaryNode<ValueType> currentNode = getRoot();
    private int position = 0;

    private final Stack<SelfReferentialNode<ValueType>> callUnwindStack = new Stack<>();    // takes O(lg(n)) space

    public InOrderBinaryTreeIterator(BinaryTree<ValueType> tree) {
        super(tree);
    }

    @Override
    public boolean hasNext() {
        return position<size();
    }

    @Override
    public BinaryNode<ValueType> next() {
        iterateInOrder(currentNode);
        return currentNode;
    }

    private void iterateInOrder(BinaryNode<ValueType> theNode)
    {
        if(theNode == null)
            return;
        iterateInOrder(theNode.getLeftChild());
        assignCurrentNodeAndIncrementCurrentPosition(theNode);
        iterateInOrder(theNode.getRightChild());
    }

    private void assignCurrentNodeAndIncrementCurrentPosition(final BinaryNode<ValueType> theNode) {
        currentNode = theNode;
        position++;
    }


    @Override
    public void buildTreeFromSequence(final ValueType[] values) {

    }

    @Override
    public void buildTreeFromSequence(BinaryNode<ValueType>[] nodes) {

    }

    @Override
    public void buildTreeFromSequence(final Collection<ValueType> values) {

    }

    @Override
    public void buildTreeFromSequence(List<BinaryNode<ValueType>> nodes) {

    }
}
