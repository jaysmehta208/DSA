public class List<Item> {
    Node<Item> first;
    int size;
    public List() {
        first = null;
        size = 0;
    }
    public void insert(Node<Item> temp) {
        if (first == null) {
            first.item = temp.item;
            first.pointer = null;
            size++;
            return;
        }
        Node<Item> temp2 = first;
        while (temp2.pointer != null) {
            temp2 = temp2.pointer;
        }
        temp2.pointer = new Node<>(temp.item);
        size++;
    }
}
