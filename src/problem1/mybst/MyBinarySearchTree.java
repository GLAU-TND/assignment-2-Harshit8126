/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */

package problem1.mybst;


import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;
import problem4.myqueue.Node;


// to implement BinarySearchTree
public class MyBinarySearchTree {


    private TreeNode newnode, root, tmp;
    private static int count;
    private MyQueue pre;
    private MyQueue post;

    public MyBinarySearchTree() {
        tmp = null;
        root = null;
        MyBinarySearchTree.count = 0;
        post=new MyQueue();
        pre=new MyQueue();
    }

    //seeting root node
    public void setRoot()
    {
        newnode=new TreeNode();
        if(root==null)
        {
            root=newnode;
            tmp=root;
            newnode=null;
        }
    }
    public TreeNode getRoot()
    {
        return root;
    }
    public TreeNode getNewnode()
    {
        return newnode;
    }

    public void setNewnode(TreeNode newnode)
    {
        this.newnode = newnode;
    }

    public void setRoot(TreeNode root)
    {
        this.root = root;
    }

    public TreeNode getTmp()
    {
        return tmp;
    }

    public void setTmp(TreeNode tmp)
    {
        this.tmp = tmp;
    }

    public void setCount(int ctr)
    {
        MyBinarySearchTree.count = ctr;
    }

    public MyQueue getPre()
    {
        return pre;
    }

    public void setPre(MyQueue pre)
    {
        this.pre = pre;
    }

    public MyQueue getPost()
    {
        return post;
    }

    public void setPost(MyQueue post)
    {
        this.post = post;
    }

    public int getCount()
    {
        return count;
    }

    //setting binary tree
    public void insert(TreeNode tmproot)
    {
        if(newnode==null)
        {
            newnode=new TreeNode();
        }

        try {
                if (newnode.getData() <= tmproot.getData())
                {
                    System.out.println("left traversal...");
                    if (tmproot.getLeft() == null)
                    {
                        tmproot.setLeft(newnode);
                        System.out.println("node inserted left");
                        pre.enqueue(new Node(newnode));//only left insertion
                        newnode=null;
                        return;
                    }
                    else
                        {
                            System.out.println("left not empty changing tmproot ");
                            insert(tmproot.getLeft());
                        }
                }
            } catch(NullPointerException ignore){}


        try {
                if (newnode.getData() > tmproot.getData())
                {
                    System.out.println("Right traversal...");
                    if (tmproot.getRight() == null)
                    {
                        tmproot.setRight(newnode);
                        System.out.println("Node inserted right");
                        newnode = null;
                    }
                    else
                        {
                            System.out.println("Right not empty changing tmproot");
                            insert(tmproot.getRight());
                        }
                }
            } catch (NullPointerException ignore) {}

    }

    public void countNotLeft(TreeNode node)
    {
        if(node==null)
        {
            return;
        }
        countNotLeft(node.getLeft());
        if(node.getLeft()!=null)
        {
            ++count;
        }
        countNotLeft(node.getRight());

    }
    //preorder
    public void preOrder(TreeNode node) {
        if (node == null)
        {
            return;
        }



        preOrder(node.getLeft());
        preOrder(node.getRight());
    }

//postorder
    public void postOrder(TreeNode node)
    {
        if(node==null)
        {
            return;
        }

        postOrder(node.getLeft());
        postOrder(node.getRight());


    }

}


