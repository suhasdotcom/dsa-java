public interface BinaryNode <T>
{
    /**
     * Get the value stored withing this binary node
     * @return stored value
     */
    T getValue();

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
