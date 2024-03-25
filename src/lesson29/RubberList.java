package lesson29;

public class RubberList {

    private int size = 0;
    private Node first = null;
    private Node last = null;

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public int size() {
        return size;
    }

    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    public int indexOf(int value) {
        int index = 0;
        if (first == null) {
            return -1;
        }
        if (first == last && value == first.item) {
            return index;
        }
        if (first != last) {
            Node cursor = first;
            while (cursor.next != null) {
                cursor = cursor.next;
                index++;
                if (value == cursor.item) {
                    return index;
                }
            }
        }
        return -1;
    }

    public Integer get(int idx) {
        if (first != null) {
            if (idx == 0) {
                return first.item;
            } else {
                int index = 0;
                Node cursor = first;
                while (cursor.next != null) {
                    cursor = cursor.next;
                    index++;
                    if (idx == index) {
                        return cursor.item;
                    }
                }
            }
        }
        return null;
    }

    public void addBegin(int value) {
        if (first == null) {
            Node node = new Node(null, value, null);
            first = node;
            last = node;
        } else {
            Node node = new Node(null, value, first);
            first.prev = node;
            first = node;
        }
        size++;
    }

    public void addEnd(int value) {
        if(last == null) {
            Node node = new Node(null, value, null);
            last = node;
            first = node;
        } else {
            Node node = new Node(last, value, null);
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addIdx(int value, int idx) {
        //TODO
        if (idx == 0 && size == 0) {
            first = new Node(null, value, null);
        } if (idx == 0 && size == 1) {
            Node newFirst = new Node(null, value, first);
            first.prev = newFirst;
            first = newFirst;
        } if (idx > 0 && size == 1) {
            last = new Node(first, value, null);
            first.next = last;
        } else {
            int index = 0;
            Node cursor = first;
            while (cursor.next != null) {
                cursor = cursor.next;
                index++;
                if (idx == index) {
                    Node left = cursor.prev;
                    var node = new Node(left, value, cursor);
                    left.next = node;
                }
            }
        }
        size++;
    }

    public void remove(int idx) {
        if (idx == 0) {
           if (first == last) {
               first = null;
               last = null;
           } else {
               first = first.next;
               first.prev = null;
           }
           size--;
        } else {
            int index = 0;
            Node cursor = first;
            while (cursor.next != null) {
                cursor = cursor.next;
                index++;
                if (idx == index) {
                   Node left = cursor.prev;
                   Node right = cursor.next;
                   left.next = right;
                   if (right != null) {
                       right.prev = left;
                   }
                   cursor.prev = null;
                   cursor.next = null;
                   size--;
                   return;
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (first != null) {
            if (first == last) {
                sb.append(first.item);
            } else {
                Node cursor = first;
                while (cursor.next != null) {
                    cursor = cursor.next;
                    sb.append(", ").append(cursor.item);
                }
            }
        }
        return sb.append("]").toString();
    }

    private static class Node {
        Node prev;
        int item;
        Node next;

        public Node(Node prev, int item, Node next ) {
            this.prev = prev;
            this.item = item;
            this.next = next;
        }
    }
}
