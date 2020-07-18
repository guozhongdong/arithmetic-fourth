package com.gzd.arithmetic.chapter1.chapter1to3;


import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author gzd
 * @date 2020/7/11 下午3:33
 *
 * Iterable 迭代器统一接口
 */
public class FixedCapacityStack<Item> implements Iterable<Item>{

    // 用数组存数据
    private Item[] a;
    private int N;

    /**
     * 构造一个初始化容量
     * */
    public FixedCapacityStack(int caps){
        a = (Item[])new Object[caps];
    }

    /**
     * 添加一个元素
     * */
    public void push(Item item){
        if (N == a.length){
            resize(2*a.length);
        }
        a[N++] = item;
    }

    /**
     * 从栈顶取一个元素,如果剩余空间太大，则减半
     * */
    public Item pop(){
        Item item = a[--N];
        a[N] = null;// 防止对象游离，也就是怕回收不了，
        if (N > 0 && N < a.length/4){
            resize(a.length/2);
        }
        return item;
    }


    /**
     * 判断是否为空
     * */
    public boolean isEmpty(){
        return N == 0;
    }

    /**
     * 返回容量大小
     * */
    public int size(){
        return N;
    }

    /**
     * 扩容
     * */
    public void resize(int max){
        Item[] temp = (Item[]) new Object[10];
        for (int i = 0; i < N; i++) {
            temp[i] = a[i];
        }
        a = temp;
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
            return a[--i];
        }

        @Override
        public void remove(){
            throw new UnsupportedOperationException();
        }
    }
}
