/*
 * 
 *  Binary search tree
 *  2016
 *
 */

package btree;

import java.util.*;

public class Btree <AnyType extends Comparable<AnyType>>
{    
    public static void main(String[] args) {}
    
    private Node<AnyType> root;
    
    private class Node<AnyType>
    {
        private AnyType data;
        
        private Node<AnyType> left, right;
        
        public Node(AnyType data)
        {
            left = right = null;
            this.data = data;
        }
    }
    public Iterator<AnyType> iterator()
    {
        return new PreOrderIterator();
    }
    private class PreOrderIterator implements Iterator<AnyType>
    {
        
    }
}
