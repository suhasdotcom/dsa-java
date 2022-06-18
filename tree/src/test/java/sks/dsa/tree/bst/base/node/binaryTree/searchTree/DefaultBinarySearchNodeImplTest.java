package sks.dsa.tree.bst.base.node.binaryTree.searchTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefaultBinarySearchNodeImplTest
{
    @Test
    public void testForBaseCorrectness()
    {
        BinarySearchNode<Integer> rootNode = new DefaultBinarySearchNodeImpl<>(4);
        assertEquals(4, rootNode.getValue());
        assertEquals(1, rootNode.getHeight());
        assertEquals(0, rootNode.numberOfNonNullImmediateChildren());
        assertEquals(0, rootNode.numberOfChildren());
        assertNull(rootNode.getLeftChild());
        assertNull(rootNode.getRightChild());
    }
}