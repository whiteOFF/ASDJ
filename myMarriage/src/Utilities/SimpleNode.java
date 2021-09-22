package Utilities;

class SimpleNode<E> {
    private E element;
    private SimpleNode<E> next;

    public SimpleNode() {}
    public SimpleNode(E e, SimpleNode<E> n){
        element = e;
        next = n;
    }

    // GETTER
    public E getElement() { return element; }
    public SimpleNode<E> getNext() { return next; }

    // SETTER
    public void setNext(SimpleNode<E> n){
        next = n;
    }
    public void setElement(E e){
        element = e;
    }
}
