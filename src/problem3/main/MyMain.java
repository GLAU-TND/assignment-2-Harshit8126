/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */

package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem3.node.Node;


// use problem5.student.Student class to create object of student
public class  MyMain {
    public static void main(String[] args) {
        MyPriorityQueue m = new MyPriorityQueue();
        for (int i = 0; i < 4; i++) {
           Node newNode=new Node();
            m.enqueue(newNode);
        }
        m.dequeue();


    }
}


