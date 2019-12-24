package com.kevin.samples;

import com.google.common.collect.Lists;

public class RemoveReveredNForList
{
    public static void main(String[] args)
    {
        ListNode<Integer> headNode = NodeUtils.createListNode(Lists.newArrayList(3, 4, 8, 7, 6, 2, 5));
        NodeUtils.printListNode(headNode);

        System.out.println("After removed:");
        removeNthLast(headNode, 2);
        NodeUtils.printListNode(headNode);
    }


    private static void removeNthLast(ListNode<Integer> node, int n) {
        if (node == null || n <= 0)
        {
            return;
        }
        ListNode<Integer> slow = node;
        ListNode<Integer> quick = node;

        while( n-- > 0)
        {
           quick = quick.next;
        }

        while(quick != null)
        {
            if (quick.next == null)
            {
                break;
            }
            quick = quick.next;
            slow = slow.next;
        }

        ListNode<Integer> target = slow.next;

        slow.next = target.next;
        target.next = null;

    }
}
