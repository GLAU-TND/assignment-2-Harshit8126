/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.node.Node;



public class MyCircularQueue {
    private Node front, tmp, end;

    public MyCircularQueue() {
        front = null;
        tmp = null;
        end = null;
    }


    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getTmp() {
        return tmp;
    }

    public void setTmp(Node tmp) {
        this.tmp = tmp;
    }

    public void enqueue(Node newNode) {
        if (front == null) {
            tmp = front = newNode;
            return;
        }
        if (tmp.getNext() == null) {
            tmp.setNext(newNode);
            newNode.setNext(tmp);
            end = newNode;
            return;
        }
        newNode.setNext(tmp.getNext());
        tmp.setNext(newNode);

    }

    public void printQueue()
    {
        tmp = front;
        try {
            do {
                System.out.println(tmp.getS().toString());
                tmp = tmp.getNext();
            }
            while (tmp != front && tmp != null);
        } catch (NullPointerException ignored) {}
    }


    public void remove(String name)
    {
        tmp = front;
        if (tmp.getS().getName().equals(name) && tmp.getS().getBacklog() == 0) {
            tmp = front = front.getNext();
        }
        while (!tmp.getNext().getS().getName().equals(name)) {
            tmp = tmp.getNext();
            if (tmp == front)
                return;
        }
        if (tmp.getS().getBacklog() == 0) {
            tmp.setNext(tmp.getNext().getNext());
        }
    }

    public void process(String name)
    {
        tmp = front;
        if (tmp.getS().getName().equals(name))
        {
            System.out.println(tmp.getS().toString());
            System.out.println(tmp.getS().getBacklog()-tmp.getS().getApperingcount());
        }
        while(!tmp.getS().getName().equals(name))
        {
            tmp=tmp.getNext();
            if(tmp==front)
                return;
        }
        System.out.println(tmp.getS().toString());
        System.out.println(tmp.getS().getBacklog()-tmp.getS().getApperingcount());
    }
}


