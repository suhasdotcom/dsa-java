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
}
