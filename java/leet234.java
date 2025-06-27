class ll {

    Node head;
    private int size;

    ll() {
        size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = next;
            size++;
        }
    }

    public void addLast(int data) {
        Node newnNode = new Node(data);
        if (head == null) {
            head = newnNode;
            return;
        }
        Node curNode = head;

        while (curNode.next != null) {
            curNode = curNode.next;
        }

        curNode.next = newnNode;
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
    public void size() {
        System.out.println(size);
    }

    public boolean ispalindrome() {
        if (head.next == null) {
            return true;
        }

        int size = 0;
        Node curNode = head;
        while (curNode != null) {
            curNode = curNode.next; 
            size++;
        }
        System.out.println(size);

        int i = 0, j = size-1;

        Node firstNode = head;
        

        while (i < j) {
            Node secNode = head;
            int y = 0;
            while (y < j) {
                secNode = secNode.next;
                y++;
            }
            if(firstNode.data == secNode.data){
                j--;
                i++;
                firstNode = firstNode.next;
            }else{
                return false;
            }
        }


        return true;
    }

    //without TLE//////////////////////////////////////
    public boolean ispalindromefast(){
        
        if(head == null || head.next == null){
            return true;
        }

        Node middle = findmiddle();
        Node secondhalfstart = reverse(middle.next);

        Node firsthalfstart = head;
        while(secondhalfstart != null){
            if(firsthalfstart.data != secondhalfstart.data){
                return false;
            }
            firsthalfstart = firsthalfstart.next;
            secondhalfstart = secondhalfstart.next;
        }
        return true;
    }

    public Node findmiddle(){
        //turtule and rabit approach
        Node hare = head;
        Node turtle = head;

        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }

        return turtle;
    }

    public Node reverse(Node head){

        Node prev = null;
        Node curr = head;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    

    public static void main(String[] args) {
        ll list = new ll();

        list.addLast(1);
        list.addLast(2);

        list.printlist();
        list.size();
        System.out.println(list.ispalindrome());
        System.out.println(list.ispalindromefast());
    }
}
