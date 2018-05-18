package org.launchcode;

import java.util.Hashtable;

public class LinkedList {
    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;

        if (head == null)
            head = node;
        else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show() {
        Node n = head;

        while (n != null) {
            System.out.print(n.data + "\t");
            n = n.next;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void deleteValue(int value) {
        Node n = head;
        Node prev = null;

        while (n.next != null && n.data != value) {
            prev = n;
            n = n.next;
        }
        prev.next = n.next;
    }

    
}
