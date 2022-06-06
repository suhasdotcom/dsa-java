package sks.dsa.tre.bst.base.node;

/**
 * A self-referential node which can contain max two children
 * @param <T> Type of value this tree stores
 */
public interface BinaryNode <T> extends SelfReferentialNode<T>
{
    /**
     * Get the right chile of this binary node
     * @return right child
     */
    BinaryNode<T> getRightChild();

    /**
     * Get the left child of this binary node
     * @return left child
     */
    BinaryNode<T> getLeftChild();

    /**
     * Get the total number of children this tree can store
     * @return total number of children
     */
    int numberOfChildren();

    /**
     * Total number of non-null children
     * @return all present children
     */
    int numberOfNonNullChildren();

    /**
     * Get height of this particular node in the tree
     * @return height of htis node in the tree
     */
    int getHeight();
}
