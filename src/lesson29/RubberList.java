package lesson29;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm # 29
 * @author Andrey Hein
 * @version 18-Mar-2024
 * @modify  30-Mar-2024
 */
public class RubberList {
    private int findIndex;
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

    public int indexOf(int value) {
        Node node = findByValue(value);
        if (node != null) {
            return findIndex;
        }
        return -1;
    }
    public boolean contains(int value) {
        return indexOf(value) != -1;
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
        if (idx >= 0 && first == null) {
            first = new Node(null, value, null);
        }
        if (first == last) {
            if (idx == 0) {
                Node newFirst = new Node(null, value, first);
                first.prev = newFirst;
                first = newFirst;
            }
            if (idx > 0) {
                last = new Node(first, value, null);
                first.next = last;
            }
        } else {
            Node findNote = findByIndex(idx);
            if (findNote == null) {
                return;
            }
            if (findNote == last) {
                Node node = new Node(last, value, null);
                last.next = node;
                last = node;
            } else {
                    Node left = findNote.prev;
                    Node node = new Node(left, value, findNote);
                    left.next = node;
            }
        }
        size++;
    }

    public void remove(int idx) {
        if (first != null) {
            if (idx == 0 && first == last) {
                first = null;
                last = null;
            }
            if (idx == 0 && first != last) {
                Node right = first.next;
                right.prev = null;
                first = right;
                if (first.next == null) {
                    last = right;
                }
            } else {
                Node findNote = findByIndex(idx);
                if (findNote == null) {
                    return;
                }
                if (findNote.next == null) {
                    Node left = findNote.prev;
                    last = left;
                    last.next = null;
                } else {
                    Node left = findNote.prev;
                    Node right = findNote.next;
                    left.next = right;
                    right.prev = left;
                    findNote.prev = null;
                    findNote.next = null;
                }
            }
            size--;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (first != null) {
            sb.append(first.item);
            if (first != last) {
                Node cursor = first;
                while (cursor.next != null) {
                    cursor = cursor.next;
                    sb.append(", ").append(cursor.item);
                }
            }
        }
        return sb.append("]").toString();
    }

    private Node findByIndex(int idx) {
        if (idx == 0 || first == last) {
            return first;
        }
        while (first != null) {
            findIndex = 0;
            Node cursor = first;
            while (cursor.next != null) {
                cursor = cursor.next;
                findIndex++;
                if (idx == findIndex) {
                    return cursor;
                }
            }
        }
        return null;
    }

    private Node findByValue(int value) {
        if (first != null) {
            if (first == last && first.item == value) {
                return first;
            }
            findIndex = 0;
            Node cursor = first;
            while (cursor.next != null) {
                if (cursor.item == value) {
                    return cursor;
                }
                cursor = cursor.next;
                findIndex++;
            }
            if (cursor.item == value) {
                return cursor;
            }
        }
        return null;
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
