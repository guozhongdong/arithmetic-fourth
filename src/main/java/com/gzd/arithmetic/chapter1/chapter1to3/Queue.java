package com.gzd.arithmetic.chapter1.chapter1to3;

import java.util.Iterator;

/**
 * @author gzd
 * @date 2020/7/11 下午4:34
 *
 * 链表实现先进先出的队列
 */
public class Queue<Item> implements Iterable<Item> {

    private Node first;

    private Node last;

    private int N;

    /**
     * 队列时往栈尾添加元素
     * */
    public void enqueue(Item item){
        Node oldLast = last;
        last = new Node();
        last.val = item;
        last.next = null;
        if (isEmpty()){
            first = last;
        }else {
            oldLast.next = last;
        }
        N++;
    }
    /**
     * 出队列，栈顶出队列，是先进来的，
     * */
    public Item dequeue(){

        Item val =  first.val;
        first = first.next;
        if (isEmpty()){
            last = null;
        }
        N--;
        return val;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
        return N;
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    private class Node{
        Item val;
        Node next;
    }

    private class ListIterator implements Iterator<Item>{

        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {  //练习
            Node last = current;
            current = current.next;
            return last.val;
        }

        @Override
        public void remove(){
            throw new UnsupportedOperationException();
        }
    }
}
