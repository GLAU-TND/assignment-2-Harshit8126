/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;



public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree m = new MyBinarySearchTree();
        Methods mthds=new Methods();

        //setting up the root
        m.setRoot();
        System.out.println("Root set Successfully value :"+m.getRoot().getData());


        //Setting up the bst
        for (int i = 0; i <4; i++)
        {
            m.insert(m.getRoot());
        }

        // Verification of statement "root element occours first in pre-order and last in post-order  "

        mthds.verify_A(m.getRoot());

        //verification of statement "Both the traversal will give same  element at the mid position for odd number of nodes."
        System.out.println(mthds.verify_B(m.getRoot()));




    }

}
