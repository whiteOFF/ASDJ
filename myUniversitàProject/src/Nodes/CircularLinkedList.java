package Nodes;

public class CircularLinkedList <E> {
    private CircularNode <E> head;
    private CircularNode <E> tail;
    private int size;

    // CONSTRUCTOR
    public CircularLinkedList() {
        head = tail = null;
        size=0;
    }

    // GETTER
    public CircularNode<E> getHead() { return head; }
    public CircularNode<E> getTail() { return tail; }
    public int getSize() { return size; }

    public boolean isEmpty() {
        return size == 0;
    }

    // ADD ELEMENTS
    public void addElement(E element) { //last
        if (isEmpty()) {
            head = new CircularNode<E>(element,tail,tail);
            tail = head;
        } else {
            CircularNode<E> nuovo = new CircularNode<E> (element,tail,head);
            tail.setNext(nuovo);
            head.setPrev(nuovo);
            tail = nuovo;
        }
        size++;
    }

    // SEARCH ELEMENTS
    public boolean searchElement(E element) {
        int cont = 0;
        CircularNode<E> cursore = head;
        while (!cursore.getElement().equals(element) && cont != size) {
            cursore = cursore.getNext();
            cont++;
        }
        return (cont != size && size != 0);
    }

    // REMOVE ELEMENT
    public void removeElement(E element) {
        if (size==0) return;
        else if (size==1) head=tail=null;
        else if (element.equals(head.getElement())) {
            head = head.getNext();
            head.setPrev(tail);
            tail.setNext(head);
        }
        else {
            int cont = 0;
            CircularNode<E> cursore = head;
            while (!cursore.getElement().equals(element) && cont != size) {
                cursore = cursore.getNext();
                cont++;
            }
            if (cont != size) {
                cursore.getPrev().setNext(cursore.getNext());
                cursore.getNext().setPrev(cursore.getPrev());
            }
        }
        size--;
    }

    // PRINT
    public void printList() {
        CircularNode<E> cursore = head;
        for (int i=0; i<size; i++) {
            System.out.println(cursore.getElement());
            cursore = cursore.getNext();
        }
    }
    

}
