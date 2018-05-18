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

    public void deleteDups(){
        Node n = head;
        Node prev = null;
        Hashtable ht = new Hashtable();

        while(n != null){
            if(ht.containsKey(n.data)){
                prev.next = n.next;
                n = n.next;
            }
            else{
                ht.put(n.data,true);
                prev = n;
                n = n.next;
            }
        }
    }

    public void deleteDupsWithoutBuffer(){
        Node n1 = head;
        Node n2 = head.next;
        Node prev = head;

        while(n1.next != null){
            prev = n1;
            n2 = n1.next;
            while(n2 != null){
                if(n1.data == n2.data){
                    prev.next = n2.next;
                    n2 = n2.next;
                }
                else{
                    prev = n2;
                    n2 = n2.next;
                }
            }
            n1 = n1.next;
        }
    }

    public void deleteDuplicateNumbers(){
        Node n1 = head;
        Node n2 = head;
        Node prev1 = null;
        Node prev2 = null;
        Hashtable ht = new Hashtable();

        while(n1 != null){
            if(ht.containsKey(n1.data)){
                prev1.next = n1.next;
                while(n2 != null){
                    if(n1.data == n2.data){
                        prev2.next = n2.next;
                        n2 = n2.next;
                    }
                    else{
                        prev2 = n2;
                        n2 = n2.next;
                    }
                }
                n2 = head;
                n1 = n1.next;
            }
            else{
                ht.put(n1.data,true);
                prev1 = n1;
                n1 = n1.next;
            }
        }
    }
}
