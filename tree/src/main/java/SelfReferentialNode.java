import java.util.Objects;

/**
 * An interface which specifies having a/many next reference(s) that could point to another self-type node
 * @param <T> Type of value this node can hold
 */
public interface SelfReferentialNode<T> extends Node<T, SelfReferentialNode<T>>
{
    /**
     * Get the nth child of this self-referential data-structure
     * @param childNumber the child to be returned
     * @return self-referential child node
     */
    SelfReferentialNode<T> getChild(int childNumber);

    /**
     * As a self-referential node can have multiple children hence returning zeroth index child looks good for now
     * @return the zeroth index child
     */
    default SelfReferentialNode<T> getNext()
    {
        return getChild(0);
    }

    default boolean hasNext()
    {
        return Objects.nonNull(getNext());
    }
}
