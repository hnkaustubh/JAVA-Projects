package org.launchcode;

import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        QueueWithTwoStacks q2st = new QueueWithTwoStacks();

        q2st.enQueue(5);
        q2st.enQueue(10);
        q2st.enQueue(15);
        q2st.enQueue(20);
        q2st.enQueue(25);
        q2st.showQueue();

        System.out.println();
        q2st.deQueue();
        q2st.showQueue();

        System.out.println();
        System.out.println(q2st.peek());
    }
}
