package org.launchcode;

public class Stack {
    int maxsize;
    int top;
    int[] arr;

    public Stack(int n){
        maxsize = n;
        top = 0;
        arr = new int[maxsize];
    }

    public void push(int data){
        arr[top] = data;
        top++;
    }

    public int pop(){
        int temp = arr[top-1];
        arr[top-1] = 0;
        top--;
        return temp;
    }

    public void show(){
        for(int i=top-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public int peek(){
        return arr[top-1];
    }

}
