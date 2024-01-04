public class LinkedList {
//    Node head;
//
//    // insert a node in a linked list.
//    public void insert(int data) {
//        Node node = new Node();
//        node.data = data;
//        node.next = null;
//        if(head ==null) {
//            head = node;
//        }
//        else {
//            Node n = head;
//            while(n.next!=null){
//                n =n.next;
//            }
//            n.next = node;
//        }
//    }
//
//    // insert a node at the first position linked list
//    public void insertAtStart(int data) {
//        Node node = new Node();
//        node.data = data;
//        node.next = null;
//        node.next = head;
//        head = node;
//    }
//
//    // insert a node at any position in a linked list
//    public void insertAt (int index, int data) {
//        Node node = new Node();
//        node.data = data;
//        node.next = null;
//
//        if(index == 0) {
//            insertAtStart(data);
//        }
//        else
//        {
//            Node n = head;
//            for (int i = 0; i < index - 1; i++) {
//                n = n.next;
//            }
//            node.next = n.next;
//            n.next = node;
//        }
//    }
//
//    // delete a node from linked list.
//    public void deleteAt(int index){
//        if(index==0){
//            head = head.next;
//        }else{
//            Node n = head;
//            Node n1 = null;
//            for(int i=0;i<index-1;i++){
//                n=n.next;
//            }
//            n1 = n.next;
//            n.next = n1.next;
//            n1 = null;
//        }
//    }
//    public void show() {
//        Node node = head;
//        while(node.next!=null){
//            System.out.println(node.data);
//            node = node.next;
//        }
//        System.out.println(node.data);
//    }

}
