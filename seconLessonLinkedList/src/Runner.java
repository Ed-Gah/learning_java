public class Runner {
    public static void main(String[] args){
//        LinkedList list = new LinkedList();
        Dstack nums = new Dstack();
        Stack numb = new Stack();
        Queue q = new Queue();
        BinaryTree tree = new BinaryTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(2);
        tree.insert(5);

        tree.inOrder();
        tree.preOrder();

    }
}
