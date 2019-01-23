/*
 * @author Nikhil Sharma
 */

class Node<typeLinkedList>{      //node structure of the linked list
    typeLinkedList data;
    Node<typeLinkedList> next;

    Node(typeLinkedList data){
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

class SList<typeLinkedList>{
    Node<typeLinkedList> head = new Node<typeLinkedList>(null);

    public String toString(){
        if(head.next == null){
            return "List is empty.";
        }

        SListIterator<typeLinkedList> it = iterator();
        String S = "";
        while(it.hasNext()){
            S = S + it.next() + " -->";
        }
        return S+"END";
    }

    SListIterator<typeLinkedList> iterator(){
        return new SListIterator<typeLinkedList>(head);
    }
}

/*
 * This is an iterator class. It has two instance variable of type Node<typeLinkedList> one of which
 * points to the current node and other points to the head of the list.
 */

class SListIterator<typeLinkedList>{     //iterating through the linked list
    Node<typeLinkedList> curr;
    Node<typeLinkedList> head;
    public SListIterator(Node<typeLinkedList> head) {
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

    public Node<typeLinkedList> next(){
        curr = curr.next;
        return curr;
    }

    /*
     * @param typeLinkedList data, basically it is the node which has to be added to the linked list
     */
    public void insert(typeLinkedList data) {    //insertion at the end
        System.out.println("Inserting " + data);
        curr.next = new Node<typeLinkedList>(data);
        curr = curr.next;
    }

    /*
     * This method is there to remove the node from the end of the linked list
     */
    public void remove(){   //deletion at the end
        Node<typeLinkedList> temp = head;
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
        System.out.println(list);	// printing the empty list.

    }
}
