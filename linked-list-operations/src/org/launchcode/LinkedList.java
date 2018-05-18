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

    public void insertDataAtPosition(int data,int pos){
        Node node = new Node();
        node.data = data;

        Node n = head;
        Node prev = null;
        int count = 1;

        while(n.next != null && count != pos){
            count++;
            n = n.next;
        }
        Node next = n.next;
        n.next = node;
        node.next = next;
    }

    public int searchData(int data) {
        Node n = head;
        int count = 0;

        while (n.next != null && n.data != data) {
            count++;
            n = n.next;
        }
        return count;
    }

    public void rotateList(int N){
        for(int i=0; i<N; i++){
            Node n = head;
            Node prev = n;

            while(n.next != null){
                prev = n;
                n = n.next;
            }
            n.next = head;
            head = n;
            prev.next = null;
        }
    }

    public int length() {
        Node n = head;
        int count = 0;

        while (n != null) {
            count++;
            n = n.next;
        }
        return count;
    }

    public void partition(int x) {
        Node node = new Node();
        node.data = x;
        Node n = head;
        Node prev = null;
        LinkedList greaterThanX = new LinkedList();

        while(n != null){
            if(n.data > x){
                greaterThanX.insert(n.data);
                prev.next = n.next;
                n = n.next;
            }
            else if(n.data < x){
                prev = n;
                n = n.next;
            }
            else if(n.data == x){
                prev.next = n.next;
                n = n.next;
            }
        }

        n = head;
        while(n.next != null){
            n = n.next;
        }
        n.next = node;
        node.next = greaterThanX.head;
    }

    public void exchangePositions(int pos1,int pos2){
        Node n1 = head;
        Node n2 = head;
        Node prev1 = null;
        Node prev2 = null;
        int count1 = 1,count2 = 1;

        if(pos1 == 1){
            while(n2.next != null && count2 != pos2){
                count2++;
                prev2 = n2;
                n2 = n2.next;
            }

            Node next2 = n2.next;
            head = n2;
            n2.next = n1.next;
            prev2.next = n1;
            n1.next = next2;
        }
        else{
            while(n1.next != null && count1 != pos1){
                count1++;
                prev1 = n1;
                n1 = n1.next;
            }

            while(n2.next != null && count2 != pos2){
                count2++;
                prev2 = n2;
                n2 = n2.next;
            }

            Node next2 = n2.next;
            prev1.next = n2;
            n2.next = n1.next;
            prev2.next = n1;
            n1.next = next2;
        }
    }

    public void deleteValuesLessThanN(int num) {
        Node n = head;
        Node prev = null;

        while (n.next != null) {
            if (n.data >= num) {
                prev = n;
                n = n.next;
            } else {
                if (n == head) {
                    head = head.next;
                    prev = head;
                    n = n.next;
                } else {
                    prev.next = n.next;
                }
            }
        }
    }
    
    public void deleteNLastElements(int N){
        Node n1 = head;
        Node prev = null;
        Node n2 = head;

        for(int i=0; i<N; i++)
            n2 = n2.next;

        while(n2 != null){
            prev = n1;
            n1 = n1.next;
            n2 = n2.next;
        }

        while(n1 != null){
            prev.next = n1.next;
            n1 = n1.next;
        }
    }

    public void deleteNFirstElements(int num) {
        Node n = head;
        Node prev = null;
        int count = 0;

        while (n.next != null && count != num) {
            count++;
            head = head.next;
        }
    }
}
