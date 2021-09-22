package CircularList;

public class CircularLinkedList <E> {
    private CircularNode<E> head;
    private CircularNode<E> tail;
    private int size;

    // CONSTRUCTOR
    public CircularLinkedList() { size=0; }

    // GETTER
    public CircularNode<E> getHead() { return head; }
    public CircularNode<E> getTail() { return tail; }
    public int getSize() { return size; }

    public boolean isEmpty() {
        return size==0;
    }

    // ADD ELEMENTS
    public void addElement(E element) { //last
        if (isEmpty()) {
            tail = head = new CircularNode<E>(element, tail, tail);
            tail.setNext(head);
            tail.setPrev(head);
        } else {
            CircularNode<E> nuovo = new CircularNode<E>(element,tail,head);
            tail.setNext(nuovo);
            head.setPrev(nuovo);
            tail=nuovo;
        }
        size++;
    }

    // SEARCH ELEMENTS O(n)
    public boolean searchElement(E element) {
        CircularNode<E> cursore = this.head;
        for (int i=0; i<size; i++)
            if (cursore.getElement().equals(element))
                return true;
            else
                cursore=cursore.getNext();
        return false;
    }

    // REMOVE ELEMENT
    public void remove(E element) {
        if (size==0) return;
        int cont = 0;
        CircularNode<E> cursore = this.head;
        while (!cursore.getElement().equals(element) && cont!=size) {
            cursore = cursore.getNext();
            cont++;
        }
        if (cont!=size) {
            cursore.getPrev().setNext(cursore.getNext());
            cursore.getNext().setPrev(cursore.getPrev());
        }
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
