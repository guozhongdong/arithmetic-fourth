package com.gzd.arithmetic.chapter1.chapter1to2;


/**
 * @author gzd
 * @date 2020/7/5 下午6:20
 */
public class Counter {
    private final String name;
    private int count;
    public void increment(){
        count++;
    }
    public Counter(String id){
        name = id;
    }


    public int tally(){
        return  count;

    }

    @Override
    public String toString(){
        return count+" "+name;
    }
}
