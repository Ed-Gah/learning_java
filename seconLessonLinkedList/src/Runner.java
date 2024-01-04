public class Runner {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        Dstack nums = new Dstack();
        Stack numb = new Stack();
        Queue q = new Queue();

//        q.enQueue(5);
//        q.enQueue(2);
//        q.enQueue(4);
//        q.enQueue(7);

        q.deQueue();
//        q.deQueue();


        System.out.println("Size :" + q.size());
        System.out.println("Is empty :"+ q.isEmpty());
        q.show();



    }
}
