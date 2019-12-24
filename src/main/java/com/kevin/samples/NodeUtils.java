package com.kevin.samples;

import java.util.Iterator;
import java.util.List;

public class NodeUtils
{
    public static <T> ListNode<T> createListNode(List<T> newArrayList)
    {
        ListNode<T> head = null;
        ListNode<T> pre = head;
        for(Iterator<T> it = newArrayList.iterator(); it.hasNext(); )
        {
            T ele = it.next();

            ListNode<T> node = new ListNode<>(ele);

            if (head == null)
            {
                head = node;
            }
            if (pre != null)
            {
                pre.next = node;
            }
            pre = node;
        }

        return head;
    }

    public static <T> void printListNode(ListNode<T> node)
    {
        System.out.print("ListNode:");

        while (node != null)
        {
            System.out.print(node.value);
            System.out.print(" ");
            node = node.next;
        }
        System.out.println("");
    }

}
