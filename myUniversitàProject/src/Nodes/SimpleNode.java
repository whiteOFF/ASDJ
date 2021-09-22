package Nodes;

public class SimpleNode <E> {
    private E element;
    private SimpleNode<E> next;

    // COSTRUTTORE
    public SimpleNode() {}
    public SimpleNode(E element, SimpleNode<E> next) {
        this.element=element;
        this.next=next;
    }

    // GETTER
    public SimpleNode<E> getNext() { return this.next; }
    public E getElement() { return this.element; }

    // SETTER
    public void setElement(E newElement) { this.element=newElement; }
    public void setNext(SimpleNode<E> newNext) { this.next=newNext; }

}
