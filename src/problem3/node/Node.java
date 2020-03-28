/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */

package problem3.node;


import problem5.student.Student;

public class Node {


    private Student s;
    private  Node next;


    public Student getS() {
        return s;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node() {
        s=new Student();
        next=null;
    }

    public void setS(Student s) {
        this.s = s;
    }

    public Node getNext() {
        return next;
    }




}

