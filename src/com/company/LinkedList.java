package com.company;

import org.w3c.dom.Node;

class LinkedList {

    Node head;

    static class Node {

        int data;
        Node next_node;

        Node(int d) {
            data = d;
            next_node = null;
        }
    }

    void push(int new_data){
        Node node = new Node(new_data);
        node.next_node = head;
        head = node;
    }
    /* Reverse the linked list */
    Node reverse(Node node) {
        Node prev_node = null;
        Node current_node = node;
        Node next_node = null;
        while (current_node != null) {
            next_node = current_node.next_node;
            current_node.next_node = prev_node;
            prev_node = current_node;
            current_node = next_node;
        }
        node = prev_node;
        return node;
    }

    // Prints the elements of the double linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next_node;
        }
    }

    void RemoveDuplicate(){
        Node current = head;
        Node next_node;
        if (head == null) return;

        while (current.next_node != null){
            if (current.data == current.next_node.data){
                next_node = current.next_node.next_node;
                current.next_node = null;
                current.next_node = next_node;
            }
            else current = current.next_node;
        }



    }
}