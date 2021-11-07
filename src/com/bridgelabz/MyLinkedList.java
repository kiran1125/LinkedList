
package com.bridgelabz;

/**
 * MyLinkedList class is to create the functions
 * @author - Kiran
 * @date - 7-11-2021
 */
public class MyLinkedList {
    MyNode head,tail;                   //Instance variables or class variables

    /**
     * Add method is to add the node to the Linked list
     * @param data
     */
    public void add(int data) {
        MyNode newNode = new MyNode(data);
        if (head == null){                       //when list is empty head will be null add new node
            head = tail = newNode;
        }
        else {
            tail.next = newNode;                 //when list is not empty adds new node to the next node
            tail = newNode;
        }
    }

    /**
     * insertAtStart is to add data at Head position
     * @param data
     */
    public void insertAtStart(int data){
        MyNode newNode = new MyNode(data);
        newNode.next = head;
        head = newNode;
    }
    /**
     * Append method is to add data to the last
     * @param data
     */
    public void append(int data){
        MyNode newNode = new MyNode(data);
        if (head == null){
            head = newNode;
            head.next = null;
        }
        else {
            MyNode temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            temp = newNode;
        }
    }

    /**
     * inserting the node at specified index
     * @param index
     * @param data
     */
    public void insertAt(int index,int data){
        MyNode newNode = new MyNode(data);
        MyNode temp = head;
        for (int i=0;i < index - 1;i++){             //traversing to that Index
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    /**
     * To delete the first node that is head node and changing the head to the next node
     */
    public void pop(){
        MyNode temp = head;
        head = temp.next;
    }

    /**
     * Removes the last node in the list
     */
    public void popLast(){
        MyNode temp = head;
        while ((temp.next).next != null){               //it will traverse upto last before node
            temp = temp.next;
        }
        temp.next = null;
    }

    /**
     * Its function is to get the index number of the given data which is present in the list
     * @param data
     * @return index
     */
    public int search(int data){
        MyNode temp = head;
        int index = 0;                      //initialising the index
        while(temp != null){                   //traverse through the list
            if (temp.data == data) {
                return index;
            }
            index++;
            temp = temp.next;
        }
        return index;
    }

    /**
     * MyNode is to create the node with data
     */
    class MyNode{
        int data;                            //declaring variables
        MyNode next;
        /**
         * Parameterised constructor to create a new node
         * Defined data and next
         */
        MyNode(int data){
             this.data = data;
             next = null;
        }
    }

    /**
     * print method is to print the list
     */
    void print(){
        MyNode temp = head;                      //traversing through the list
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
    }
}
