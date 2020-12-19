/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.node.Node;
import problem5.student.Student;

import java.util.Scanner;

//executable class
public class MyMain
{
    public static void main(String[] args)
    {
        MyCircularQueue m=new MyCircularQueue();
        Node node;

        for (int i = 0; i <5 ; i++)
        {
            node=new Node(new Student());
            m.enqueue(node);
        }
        m.printQueue();

        m.remove(new Scanner(System.in).next());
        m.printQueue();

        m.process(new Scanner(System.in).next());








    }
}
