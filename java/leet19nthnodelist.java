class LLL{
    Node head;
    private int size;

    LLL() {
        size = 0;
    }

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
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

    //problem solution
    public void removeNthfromLast(int n){
        if(head.next == null){
            head = null;
            return;
        }

        int size = 0;
        Node curNode = head;
        while (curNode != null) {
            curNode = curNode.next;
            size++;
        }
        System.out.println(size);

        //n == size
        if(n == size){
            head = head.next;
            return;
        }

        int i = size-n;
        Node prevnode = head;
        int j=1;
        while(j < i){
            prevnode = prevnode.next;
            j++;
        }

        prevnode.next = prevnode.next.next;



    }


    public static void main(String[] args){
        LLL list = new LLL();

        list.addLast(1);
        list.addLast(2);
        // list.addLast(3);
        // list.addLast(4);
        // list.addLast(5);

        list.removeNthfromLast(2);


        list.printlist();
    }



}
