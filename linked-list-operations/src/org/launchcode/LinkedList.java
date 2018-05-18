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

    public void deleteNthToLastElement(int n) {
        Node n1 = head;
        Node n2 = head;
        Node prev = null;

        for (int i = 1; i < n; i++)
            n2 = n2.next;

        while (n2.next != null) {
            prev = n1;
            n1 = n1.next;
            n2 = n2.next;
        }
        prev.next = n1.next;
    }

    public void deleteLastElement() {
        Node n = head;
        Node prev = null;

        while (n.next != null) {
            prev = n;
            n = n.next;
        }
        prev.next = n.next;
    }

    public void deleteFirstElement() {
        head = head.next;
    }

    public void deleteMiddleElement() {
        Node n1 = head;
        Node n2 = head;
        Node prev = null;

        while (n2.next != null) {
            prev = n1;
            n1 = n1.next;
            n2 = n2.next.next;
        }
        prev.next = n1.next;
    }

    public void deleteNthFromBeginning(int n) {
        Node p = head;
        Node prev = null;
        int count = 1;

        while (p.next != null && count != n) {
            count++;
            prev = p;
            p = p.next;
        }
        prev.next = p.next;
    }
}
