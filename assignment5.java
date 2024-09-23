public class assignment5 {
    public static void main(String[] args) {
        

        




        public class MyLinkedList<E> {
            private static class MyNode<E> {
                E item;
                MyNode<E> next;
        
                MyNode(E element) {
                    this.item = element;
                    this.next = null;
                }
            }
        
            private MyNode<E> head;
        
            public MyLinkedList() {
                head = null;
            }
        
            public void add(E element) {
                if (head == null) {
                    head = new MyNode<>(element);
                } else {
                    MyNode<E> current = head;
                    while (current.next != null) {
                        current = current.next;
                    }
                    current.next = new MyNode<>(element);
                }
            }
        
            public boolean reverse(int start, int end) throws Exception {
                if (start < 1 || end < 1 || start >= end) {
                    throw new Exception("Invalid start or end position");
                }
        
                MyNode<E> dummy = new MyNode<>(null);
                dummy.next = head;
                MyNode<E> prevStart = dummy;
        
                for (int i = 1; i < start; i++) {
                    if (prevStart.next == null) {
                        throw new Exception("Start position out of bounds");
                    }
                    prevStart = prevStart.next;
                }
        
                MyNode<E> current = prevStart.next;
                MyNode<E> prev = null;
                MyNode<E> next = null;
        
                for (int i = start; i <= end; i++) {
                    if (current == null) {
                        throw new Exception("End position out of bounds");
                    }
                    next = current.next;
                    current.next = prev;
                    prev = current;
                    current = next;
                }
        
                MyNode<E> startNode = prevStart.next; 
                prevStart.next = prev;                
                startNode.next = current;             
        
                head = dummy.next;                    
                return true;
            }
        
            public void printList() {
                MyNode<E> current = head;
                while (current != null) {
                    System.out.print(current.item + " -> ");
                    current = current.next;
                }
                System.out.println("null");
            }
        
            public static void main(String[] args) {
                try {
                    MyLinkedList<String> list = new MyLinkedList<>();
                    list.add("A");
                    list.add("B");
                    list.add("C");
                    list.add("D");
                    list.add("E");
        
                    System.out.println("Original list:");
                    list.printList();
        
                    list.reverse(2, 4); 
        
                    System.out.println("List after reversing from position 2 to 4:");
                    list.printList();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        
        

        




    }
}
