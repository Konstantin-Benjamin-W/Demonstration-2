public class MyLinkedListDemo {
        public static void main(String[] args) {
            MyLinkedList myLinkedList = new MyLinkedList();
            myLinkedList.add(10);
            myLinkedList.add(20);
            myLinkedList.add(50);

            System.out.println(myLinkedList);
            System.out.println(myLinkedList.get(0));
            System.out.println(myLinkedList.get(1));
            System.out.println(myLinkedList.get(2));

            myLinkedList.remove(1);
            System.out.println(myLinkedList);
        }
}