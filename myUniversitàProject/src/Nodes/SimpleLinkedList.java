package Nodes;

public class SimpleLinkedList <E> {
    private SimpleNode <E> header;
    private SimpleNode <E> tail;
    private int count;

    // CONSTRUCTOR
    public SimpleLinkedList () {
        tail= null;
        header= null;
        count= 0;
    }

    // GETTER - SETTER
    public int getCount() { return count; }
    public SimpleNode<E> getHeader() { return header; }
    public SimpleNode<E> getTail() { return tail; }

    public void setHeader(SimpleNode<E> newHead) { this.header=newHead; }
    public void setTail(SimpleNode<E> newTail) { this.header=newTail; }

    public void increment() { this.count++; }
    public void decrement() { this.count--; }

    // ELEMENTS ADDERS
    public void addFirst(E element) {
        header = new SimpleNode <E> (element, header);
        if (this.count==0)
            tail=header;
        increment();
    }
    public void addLast(E element) {
        tail.setNext(new SimpleNode<E> (element, null));
        tail=tail.getNext();
        if (this.count==0)
            header=tail;
        increment();
    }

    // ADDERS AFTER - BEFORE
    public void addAfter(E newElement, E afterThis) {
        if (count==0) {
            addLast(newElement);
            return;
        }
        SimpleNode<E> cursore = header;
        while (!cursore.getElement().equals(afterThis) && cursore.getNext() != null)
            cursore = cursore.getNext();
        if (cursore.getNext()==null) {
            System.out.println("Non è stato trovato l'elemento richiesto, pertanto il nuovo è stato aggiunto in coda");
            addLast(newElement);
                return;
        }
        cursore.setNext(new SimpleNode<E>(newElement,cursore.getNext()));
        increment();

    }

    public void addBefore(E newElement, E beforeThis) {
        if (count==0) {
            addFirst(newElement);
            return;
        }
        SimpleNode<E> cursore = header;
        while (!cursore.getNext().getElement().equals(beforeThis) && cursore.getNext() != null)
            cursore = cursore.getNext();
        if (cursore.getNext()==null) {
            System.out.println("Non è stato trovato l'elemento richiesto, pertanto il nuovo è stato aggiunto in testa");
            addFirst(newElement);
            return;
        }
        cursore.setNext(new SimpleNode<E>(newElement, cursore.getNext()));
        increment();
    }

    // REMOVERS
    public void removeFirst() {
        if (count==0)
            return;
        else
            header=header.getNext();
        decrement();
    }

    public void removeLast() {
        if (count==0)
            return;
        else {
            SimpleNode<E> cursore= header;
            while (cursore.getNext()!=tail)
                cursore=cursore.getNext();
            cursore.setNext(null);
            tail=cursore;
            decrement();
        }
    }

    // PRINT LIST
    public void printList() {
        if (count==0) {
            System.out.println("La lista è vuota");
            return;
        } else {
            SimpleNode<E> cursore = header;
            System.out.println(cursore.getElement());
            for (int i=1; i<count; i++) {
                cursore= cursore.getNext();
                System.out.println(cursore.getElement());
            }
        }

    }


}
