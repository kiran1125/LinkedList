package com.bridgelabz;

public class SortedLinkedList extends MyLinkedList {

    public void add(int data){
        MyNode newNode = new MyNode(data);
        if (head == null){
            head = newNode;
            head.next = null;
        }
        else if(head.data > data){
            MyNode temp = head;
            newNode.next = temp;
            head = newNode;
        }else{
            MyNode temp = head;
            while(temp.next != null){
                if (temp.next.data > data){
                    MyNode tempOne = temp.next;
                    temp.next = newNode;
                    newNode.next = tempOne;
                    return;
                }
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
}
