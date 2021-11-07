

package com.bridgelabz;
public class LinkedListMain {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(56);
        list.add(30);
        list.add(70);

        list.print();
        System.out.println("\n Index number : " + list.search(56));
    }
}
