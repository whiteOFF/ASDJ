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

    public SimpleNode<E> getHead(){ return head; }
    public int getSize(){ return size; }
    public boolean isEmpty(){
        if(size == 0)
            return true;
        return false;
    }
    public E getFirst(){
        if(this.isEmpty())
            return null;
        return head.getElement();
    }
    public E getLast(){
        if(this.isEmpty())
            return null;
        return tail.getElement();
    }

    public void addLast(E e){
        SimpleNode<E> nuovo = new SimpleNode<E>(e,null);
        if(this.isEmpty())
            head = nuovo;
        else
            tail.setNext(nuovo);
        tail = nuovo;
        size++;
    }

    public E removeLast(){
        SimpleNode<E> cursore;
        if(this.isEmpty())
            return null;

        else if (this.size==1) {
            head=null;
            size--;
            return null;
        }

        else{
            E elemento = tail.getElement();

            cursore = head;

            while (cursore.getNext()!= tail)
                cursore = cursore.getNext();

            tail = cursore;
            tail.setNext(null);
            size--;
            return elemento;
        }
    }

    public int getPosition(E e){
        SimpleNode<E> cursore;
        int index;

        if(this.isEmpty())
            return 0;
        cursore = head;
        index = 1;
        while(cursore.getNext().getElement()!= e && cursore.getNext() != null) {
            cursore = cursore.getNext();
            index++;
        }
        if(cursore.getNext() == null)
            return 0;
        return index;
    }

    public void printList(){
        SimpleNode<E> cursore = head;
        for(int i = 0; i < this.getSize(); i++){
            System.out.println(cursore.getElement());
            cursore = cursore.getNext();
        }

    }

}
