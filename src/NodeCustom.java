public class NodeCustom {          // LinkedList(  Node(  Node next(Node next )     ) )

                                    // A( B ( D( C( E (F) ))))

                                   // A.next(B.next(C.next())))
                                   // C.prev(B.prev(A.prev))))
    String data;
    NodeCustom prev;
    NodeCustom next;


    public void add(String value) {
        this.data = value;
    }

    public NodeCustom getPrev() {
        return prev;
    }

    public NodeCustom getNext() {
        return next;
    }
}
