package com.gzd.arithmetic.chapter2.primary;

/**
 * @author gzd
 * @date 2020/7/18 下午3:50
 *
 * 排序算法的测试框架
 */
public class Example {

    public static void sort(Comparable[] a){


    }

    private static boolean less(Comparable v,Comparable w){

        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[]a,int i,int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
            System.out.println();
        }
    }

    public static boolean isSorted(Comparable[] a){
        //测试数据元素是否有序
        for (int i = 1; i < a.length; i++) {
            if (less(a[i],a[i-1])){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String[] a = {"bed","bug","dad","yes","zoo"};
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
