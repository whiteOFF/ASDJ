package QueuePack;

import OrdinePack.Ordine;

public class myQueue {
    private QueueNode head, tail;
    private int size;

    public myQueue() {}

    // GETTER
    public QueueNode getHead() { return this.head; }
    public QueueNode getTail() { return this.tail; }
    public int getSize() { return this.size;}

    // SETTER
    public void setHead(QueueNode head) { this.head = head; }
    public void setTail(QueueNode tail) { this.tail = tail; }

    /** ADD LAST */
    public void addElement(Ordine newOrd) {
        if (this.size==0) {
            this.head = new QueueNode(tail, null, newOrd);
            tail = null;
            size++;
        }
        else if (this.size==1) {
            this.tail = new QueueNode(null, this.head, newOrd);
            head.setNext(tail);
            size++;
        }
        else {
            QueueNode nuovo = new QueueNode(null,tail,newOrd);
            tail.setNext(nuovo);
            tail = nuovo;
            size++;
        }
    }

    /** REMOVE FIRST */
    public Ordine remove() {
        if (size==0)
            return null;
        else {
            Ordine temp = head.getElement();
            head = head.getNext();
            size--;
            return temp;
        }
    }

    /** LEGGI PROSSIMO ORDINE */
    public Ordine prossimoOrdine() { return head.getElement(); }
}
