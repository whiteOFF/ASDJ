package QueuePack;

import OrdinePack.Ordine;

public class QueueNode {
    private QueueNode next, prev;
    private Ordine element;

    // COSTRUTTORE
    public QueueNode() {}
    public QueueNode(QueueNode n, QueueNode p, Ordine o) {
        this.next = n;
        this.prev = p;
        this.element = o;
    }

    // GETTER
    public QueueNode getNext() { return next; }
    public QueueNode getPrev() { return prev; }
    public Ordine getElement() { return element; }

    // SETTER
    public void setNext(QueueNode next) { this.next = next; }
    public void setPrev(QueueNode prev) { this.prev = prev; }
    public void setElement(Ordine element) { this.element = element; }
}
