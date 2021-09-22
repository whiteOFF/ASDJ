package Utilities;

public class SimplyLinkedList<E> {
    private SimpleNode<E> head;
    private SimpleNode<E> tail;
    private int size;

    public SimplyLinkedList(){
         head = null;
         tail = null;
         size = 0;
    }

    // GETTER
    public SimpleNode<E> getHead(){ return head; }
    public SimpleNode<E> getTail(){ return tail; }
    public int getSize() { return size; }

    public boolean isEmpty(){ return size == 0; }

    public void addLast(E e){
        SimpleNode<E> nuovo = new SimpleNode<E>(e,null);
        if(this.isEmpty())
            head = nuovo;
        else tail.setNext(nuovo);
        tail = nuovo;
        size++;
    }

    /** GET ELEMENT BY POSITION */
    public E getElementInPosition(int n) {
        if (n==0 && size>0)
            return this.head.getElement();
        else {
            SimpleNode <E> cursore = head;
            for (int i=1; i<n; i++)
                cursore = cursore.getNext();
            return cursore.getElement();
        }
    }

    /** VERIFICARE SE UN ELEMENTO E' PRESENTE NELLA LISTA */
    public boolean isElement(E element) {
        if (this.size>0 && element.equals(head.getElement()))
            return true;
        SimpleNode <E> cursore = head;
        for (int i=1; i<this.size; i++) {
            cursore = cursore.getNext();
            if (cursore.getElement().equals(element))
                return true;
        }
        return false;
    }

    /** TO STRING */
    public void printList() {
        SimpleNode<E> cursore = head;
        for(int i = 0; i < this.getSize(); i++) {
            System.out.println(cursore.getElement());
            cursore = cursore.getNext();
        }
    }

}
