import Array.DynamicArray;
import LL.Node;


class Test {
    public static void main(String[] args) {
            
//         DynamicArray da = new DynamicArray(4);
//         da.Add(1);
//         da.Add(2);
//         da.Add(3);
//         da.Add(4);
//         da.Add(5);
        Node l1 = new Node(1);
        Node l2 = new Node(2);
        Node l3 = new Node(3);

        Node.head = l1;
        l1.next = l2;
        l2.next = l3;
        Node.tail = l3;

        l1.getLinkedlist();
    }
}