package corejava.LinkedList;

public  class  SingleLInkListDemo {
   private  ListNode head;

   static class ListNode {
       int data ;
       ListNode next;

       public ListNode(int data) {
           this.data = data;
           this.next=null;
       }
   }

    public static void main(String[] args) {
       SingleLInkListDemo listDemo =new SingleLInkListDemo();


        listDemo = insert(listDemo,10);
        listDemo = insert(listDemo,2);
        listDemo = insert(listDemo,70);
        listDemo = insert(listDemo,80);
        listDemo = insert(listDemo,50);
        listDemo = insert(listDemo,90);

        display(listDemo);
        System.out.println();






    }

    // Method to insert a new node

    public static SingleLInkListDemo insert (SingleLInkListDemo list , int data){

       ListNode node = new ListNode(data);



       // check list is empty or not
        if (list.head ==null){
            list.head=node;
        }
        else {

            // if the list has already element in it
            // then add the new node in the list and return;

            ListNode current = list.head;
            while (current.next != null){
                current=current.next;
            }
            current.next=node;

        }
        return list;
    }

    public static void display(SingleLInkListDemo linkedList ){
       if (linkedList == null){
           System.out.println("empty linkList");
       }else {
           // Traverse through the LinkedList
           ListNode current =linkedList.head;

           while (current!= null){
               System.out.println(current.data);
               current=current.next;
           }
       }
    }


    // second display met







}
