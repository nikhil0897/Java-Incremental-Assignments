class Node<T>{
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        this.next = null;
    }

    public String toString(){
        if(data == null){
            return "null";
        }
        else {
            return data.toString();
        }
    }
}

/*
 * Class SList is generic class which is used to create the singly linked list.
 * This class has an instance variable of type Node that stores the value of the head of the linked list.
 */

class SList<T>{
    Node<T> head = new Node<T>(null);

    public String toString(){
        if(head.next == null){
            return "List is empty.";
        }

        SListIterator<T> it = iterator();
        String S = "";
        while(it.hasNext()){
            S = S + it.next() + " -->";
        }
        return S+"END";
    }

    SListIterator<T> iterator(){
        return new SListIterator<T>(head);
    }
}

/*
 * This is an iterator class. It has two instance variable of type Node<T> one of which
 * points to the current node and other points to the head of the list.
 */

class SListIterator<T>{
    Node<T> curr;
    Node<T> head;
    public SListIterator(Node<T> head) {
        this.curr = head;
        this.head = head;
    }

    public boolean hasNext(){
        if(curr.next == null){
            return false;
        }
        else {
            return true;
        }
    }

    public Node<T> next(){
        curr = curr.next;
        return curr;
    }
    public void insert(T data) {
        System.out.println("Inserting " + data);
        curr.next = new Node<T>(data);
        curr = curr.next;
    }
    public void remove(){
        Node<T> temp = head;
        if(temp.next == null){
            System.out.println("Sorry, but you got nothing to remove as the list is empty.");
            return ;
        }
        while(temp.next.next != null){
            temp = temp.next;
        }
        curr = temp;
        System.out.println("Removing: " + temp.next.data);
        temp.next = null;
    }

}

public class SinglyLinkedList {

    public static void main(String[] args) {
        SList<Integer> list = new SList<Integer>();
        SListIterator<Integer> it = list.iterator();

        System.out.println(list); 	// printing the empty list.
        it.insert(5);   	// inserting 5 to the list.

        System.out.println(list);
        it.insert(10);	    // inserting 10 to the end of the list.

        System.out.println(list);
        it.insert(15);		// inserting 15 to the end of the list.

        System.out.println(list);
        it.remove();			// removing a node from the end of the list.

        System.out.println(list);
        it.remove();			// removing another node from the end of the list.

        System.out.println(list);
        it.insert(20);		// adding a 20 in the end of the list.

        System.out.println(list);
        it.remove();			// removing a node from the end of the list.

        System.out.println(list);
        it.remove();			// removing a node from the end of the list.

        System.out.println(list); 	// printing the empty list.

        it.remove();			// trying to remove from an empty list.
        System.out.println(list);		// printing the empty list.

    }
}
