package sks.dsa.tree.bst.base.iterator.binaryTree.ordered;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import sks.dsa.tree.bst.base.node.binaryTree.BinaryNode;
import sks.dsa.tree.bst.base.node.binaryTree.searchTree.BinarySearchNode;
import sks.dsa.tree.bst.base.node.binaryTree.searchTree.DefaultBinarySearchNodeImpl;
import sks.dsa.tree.bst.base.tree.binaryTree.searchTree.BinarySearchTree;
import sks.dsa.tree.bst.base.tree.binaryTree.searchTree.DefaultBinarySearchTreeImpl;

class InOrderBinaryTreeIteratorTest {
    @Nested
    class BinarySearchTreeTest
    {
        private BinarySearchTree<Integer> integerBinarySearchTree;

        private BinarySearchTree<Integer> getBinarySearchTree () {
            BinarySearchNode<Integer> rootNode = new DefaultBinarySearchNodeImpl<>(4);
            BinarySearchNode<Integer> leftNode = new DefaultBinarySearchNodeImpl<>(2);
            BinarySearchNode<Integer> leftLeftNode = new DefaultBinarySearchNodeImpl<>(1);
            BinarySearchNode<Integer> leftRightNode = new DefaultBinarySearchNodeImpl<>(3);

            rootNode.setLeftChild(leftNode);
            leftNode.setLeftChild(leftLeftNode);
            leftNode.setRightChild(leftRightNode);

            BinarySearchNode<Integer> rightNode = new DefaultBinarySearchNodeImpl<>(6);
            BinarySearchNode<Integer> rightLeftNode = new DefaultBinarySearchNodeImpl<>(5);
            BinarySearchNode<Integer> rightRightNode = new DefaultBinarySearchNodeImpl<>(7);

            rootNode.setRightChild(rightNode);
            rightNode.setLeftChild(rightLeftNode);
            rightNode.setRightChild(rightRightNode);

            return new DefaultBinarySearchTreeImpl<>(rootNode);
        }
        @BeforeEach
        void setUp() {
            integerBinarySearchTree = getBinarySearchTree();
        }

        @Test
        void testIterationOrder ()
        {
            for (BinaryNode<Integer> n : integerBinarySearchTree)
                System.out.println(n.getValue());

            integerBinarySearchTree.forEach(e -> System.out.println(e.getValue()));
        }

    }
}