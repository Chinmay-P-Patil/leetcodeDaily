class LL {

    Node head;
    private int size;

    LL() {
        size = 0;
    }

    class Node {
        int data;
        Node next;

        // constructure
        // a constructor is a special method in a class used to
        // initialize objects. It is called automatically when an
        // object of the class is created using the new keyword.
        // Constructors have the same name as the class and do not
        // have a return type, not even void.
        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add - firsr or last
    public void addFirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }

    public void addLast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }

        Node curNode = head;

        while (curNode.next != null) {
            curNode = curNode.next;
        }

        curNode.next = newnode;
    }

    public void printlist() {
        if (head == null) {
            System.out.println("NULL");
            return;
        }

        Node curNode = head;

        while (curNode != null) {
            System.out.print(curNode.data + " -> ");
            curNode = curNode.next;
        }
        System.out.println("NULL");
    }

    // delete
    public void deletefirst() {
        if (head == null) {
            System.out.println("this list is empty");
            return;
        }

        head = head.next;
        size--;
    }

    public void deletelast() {
        // cornercases
        if (head == null) {
            System.out.println("this list is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            size--;
            return;
        }

        Node secondlast = head;
        Node lastnode = head.next;

        while (lastnode.next != null) {
            lastnode = lastnode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
        size--;

    }

    public void lengthlist(){
        System.out.println("size is " + size);
    }

    public void reverseiterate(){

        if(head == null || head.next == null){
            return;
        }
        
        Node prevNode = head;
        Node curnode = head.next;
        while(curnode != null){
            Node nexNode = curnode.next;
            curnode.next = prevNode;

            //update
            prevNode = curnode;
            curnode = nexNode;
        }
        head.next = null;
        head = prevNode;
    }

    public static void main(String[] args) {
        LL list = new LL();

        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        

        list.printlist();
        list.lengthlist();

        list.reverseiterate();
        list.printlist();

    }
}
