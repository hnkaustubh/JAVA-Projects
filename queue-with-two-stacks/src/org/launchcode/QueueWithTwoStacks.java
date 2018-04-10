package org.launchcode;

public class QueueWithTwoStacks {
    Stack st1 = new Stack(5);
    Stack st2 = new Stack(5);

    public void enQueue(int data){
        st1.push(data);
    }

    public void showQueue(){
        if(st2.isEmpty())
            st1.show();
        else{
            while(!st2.isEmpty()){
                st1.push(st2.pop());
            }
            st1.show();
        }
    }

    public int deQueue(){
        if(!st2.isEmpty())
            return st2.pop();
        else{
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
            return st2.pop();
        }
    }

    public int peek(){
        if(!st2.isEmpty())
            return st2.pop();
        else{
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
            return st2.peek();
        }
    }
}
