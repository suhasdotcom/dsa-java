import java.util.Optional;

/**
 * A node is a data structure which can store a value and a next pointer
 * @param <ValueType> Type of the value this node can store
 * @param <NextPointerDataType> Data-Type of the next-pointer
 */
public interface Node<ValueType, NextPointerDataType> {
    /**
     * Get the value stored within this node
     * @return stored value
     */
    ValueType getValue();

    /**
     * Get the next address to be looked into
     * @return next reference
     */
    NextPointerDataType getNext();

    /**
     * The next reference could/couldn't hold a value, this method gives a concrete answer whether any next element can be iterated upon
     * @return is the next reference null?
     */
    boolean hasNext();

    /**
     * Provide optional results for next operation
     * @return Optional Next-Reference
     */
    Optional<NextPointerDataType> getOptionalNext();
}
