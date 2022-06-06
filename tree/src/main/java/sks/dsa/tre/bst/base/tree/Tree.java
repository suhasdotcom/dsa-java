package sks.dsa.tre.bst.base.tree;

public interface Tree<T> extends Iterable<T>
{
    T getRoot();
    int getMaxTreeDepth();
    int getMaxTreeHeight();
    int getNumberOfChildren();
    int size();
}
