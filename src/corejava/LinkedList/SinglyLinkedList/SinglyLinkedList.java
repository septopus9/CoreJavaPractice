package corejava.LinkedList;

public class  SinglyLinkedList {

    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next=null;
        }
    }



    public static void main(String[] args) {
        SinglyLinkedList ssl = new SinglyLinkedList();
        ssl.head=new ListNode(10);


        ListNode first =ssl.head;
        ListNode second = new ListNode(10);
        ListNode third = new ListNode(11);
        ListNode forth = new ListNode(12);
        ListNode fifth = new ListNode(13);
        ListNode sixth = new ListNode(13);

        // now we will form a chain to connect

        first.next=second;
        second.next=third;
        third.next=forth;
        forth.next=fifth;
        fifth.next=sixth;

//        ListNode head  = new ListNode(10);







//        ssl.insertFirst(202);
//        ssl.insertFirst(2);
//        ssl.insertFirst(98);
//
//        ssl.insertLast(5454);
//
////
//
//
//
//
//
//
//
//
//
//        ssl.display();
//        System.out.println();
//        System.out.println("Length of the Linked List Is "+ ssl.length());
//
//        System.out.println();
//        ssl.insert(9898,4);
//        ssl.display();
//        System.out.println();
//
//        ssl.deleteFirstNode();
//        ssl.display();
//
//        System.out.println();
//        System.out.println("Last node deleted   "+ssl.deleteLastNode().data);
//        ssl.display();
//        System.out.println();
//
//        System.out.println(" node deleted   "+ssl.deleteNode(7).data);
//
//
//
//
//        ssl.display(first);

//        ListNode middle = ssl.getMiddle();
//        System.out.println();
//        System.out.println(middle.data);
//        System.out.println();
//
//
//        ssl.display(first);
//
//        ssl.deleteDuplicateElement();
//        System.out.println();

       ssl.deleteDuplicateElement();
       ssl.printlinked();


























        ;















    }
    public void insertLast(int value){

       ListNode newNode = new ListNode(value);

       if (head==null){
           head=newNode;
           return;
       }
       ListNode current = head;
       while (null != current.next){
           current=current.next;
       }
        current.next=newNode;

    }

    public void  insertFirst(int value ){
        ListNode newNode = new ListNode(value);
        newNode.next=head;
        head=newNode;

    }
    public  void display(ListNode n){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.print("null");

    }

    public void printlinked (){
        if (head==null){
            System.out.println("empty  linked list ");
        }
        else {
            ListNode current = head;
            while (current != null){
                System.out.print("-- "+current.data);
                current=current.next;
            }
        }
    }



    public int length(){
        if (head==null){
            return 0;
        }
        int count =0;
        ListNode current  = head;
        while (current != null){
            count++;
            current=current.next;

        }
        return count;
    }

    public void insert(int data , int position){
        ListNode node = new ListNode(data);
        if (position==1){
            node.next=head;
            head=node;
        }
        else {
            ListNode previous = head;
            int count =1;
            while (count < position-1){
                previous = previous.next;
                count++;
            }

            node.next=previous.next;
            // Optional Code
//            ListNode current =previous.next;
//            node.next=current;
            //Optional Code

            previous.next=node;
        }

    }

    public ListNode deleteFirstNode(){
        if (head == null){
            return null;
        }
        ListNode temp = head;
        head= head.next;
        temp.next=null;

        return temp;
    }

    public ListNode deleteLastNode(){
        if (head==null || head.next== null){

            return head;

        }
        ListNode previous =null;
        ListNode current = head;

        while (current.next != null){
            previous= current;
            current=current.next;
        }
        previous.next=null;
        return current;

    }


    public ListNode deleteNode(int position){
        if (head == null || head.next==null){
            return head;
        }
        if (position==1) {
            ListNode temp = head;
            head = head.next;
            temp.next = null;
        }

            int count =1;
            ListNode previous = null;
            ListNode current = head;
            while (count != position){
                count++;
                previous=current;
                current=current.next;
            }
            previous.next=current.next;




        return current;

    }

    public boolean findElement(int searchedElement){
//        ListNode current = head;
//        int count =1;
//        while (current.next != null){
//
//
//            if (current.data == data){
//                return count;
//            }
//            current=current.next;
//            count++;
//        }
//        return count;

        ListNode current = head;

        while ( current != null){
            if (current.data == searchedElement){
                return  true;

            }
            current=current.next;
        }
        return false;






    }

    public ListNode getMiddle(){
        if (head == null){
            return null ;
        }
        ListNode sloPt = head;
        ListNode fastPt = head;

        while ( fastPt != null && fastPt.next != null){
            sloPt= sloPt.next;
            fastPt=fastPt.next.next;
        }
        return sloPt;
    }

    public ListNode reverse (ListNode head ){
        if (head == null){
            return null;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while ( current != null){
            next= current.next;
            current.next= previous;
            previous= current;
            current= next;
        }
        return previous;
    }



    public void deleteDuplicateElement(){
        if (head == null ){
            return;
        }
        ListNode current = head;
        while (current != null && current.next != null){
            if (current.data == current.next.data){
                current = current.next.next;
            }
            else {
                current= current.next;
            }
        }
    }









}
