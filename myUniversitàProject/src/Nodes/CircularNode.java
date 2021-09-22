package Nodes;

public class CircularNode <E>{
    private E element;
    private CircularNode<E> next, prev;

    // CONSTRUCTOR
    public CircularNode(){}
    public CircularNode(E element, CircularNode<E> prev, CircularNode<E> next) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }

    // GETTER
    public E getElement() { return this.element; }
    public CircularNode<E> getNext() { return next; }
    public CircularNode<E> getPrev() { return prev; }

    // SETTER
    public void setElement(E element) { this.element = element; }
    public void setNext(CircularNode<E> next) { this.next = next; }
    public void setPrev(CircularNode<E> prev) { this.prev = prev; }

    // TO STRING

    @Override
    public String toString() {
        return "CircularNode{"+
                "element="+element+
                ", next="+next+
                ", prev="+prev+'}';
    }
}
