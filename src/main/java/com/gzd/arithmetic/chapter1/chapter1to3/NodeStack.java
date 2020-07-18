package com.gzd.arithmetic.chapter1.chapter1to3;


import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author gzd
 * @date 2020/7/11 下午3:33
 *
 * Iterable 迭代器统一接口
 * 链表实现栈
 */
public class NodeStack<Item> implements Iterable<Item>{

    // 用数组存数据
    private Node first;
    private int N;

    /**
     * 构造一个初始化容量
     * */

    /**
     * 向栈顶添加一个元素
     * */
    public void push(Item item){


        Node oldFirst = first;
        first = new Node();
        first.val = item;
        first.next = oldFirst;
        N++;
    }

    /**
     * 从栈顶取一个元素,如果剩余空间太大，则减半
     * */
    public Item pop(){
        Item item = (Item) first.val;
        first = first.next;
        N--;
        return item;
    }


    /**
     * 判断是否为空
     * */
    public boolean isEmpty(){
        return first == null;
    }

    /**
     * 返回容量大小
     * */
    public int size(){
        return N;
    }


    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item>{

        private int i = N;

        @Override
        public boolean hasNext() {
            return i>0;
        }

        @Override
        public Item next() {
            if (i == 0){
                throw new NoSuchElementException();
            }
            return null;
        }

        @Override
        public void remove(){
            throw new UnsupportedOperationException();
        }
    }

    private class Node<Item>{
        Item val;
        Node next;
    }
}
