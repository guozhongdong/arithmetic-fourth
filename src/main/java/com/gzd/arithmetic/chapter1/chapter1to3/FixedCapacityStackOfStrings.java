package com.gzd.arithmetic.chapter1.chapter1to3;

/**
 * @author gzd
 * @date 2020/7/11 下午3:13
 *
 * 定义一个存储String 类型的栈结构
 *
 */
public class FixedCapacityStackOfStrings {

    // 用数组存数据
    private String[] a;
    private int N;

    /**
     * 构造一个初始化容量
     * */
    public FixedCapacityStackOfStrings(int caps){
        a = new String[caps];
    }


    public void push(String item){
        a[N++] = item;
    }

    public String pop(){

        return a[--N];
    }

    public boolean isEmpty(){
        return N == 0;
    }

   public int size(){
        return N;
   }
}
