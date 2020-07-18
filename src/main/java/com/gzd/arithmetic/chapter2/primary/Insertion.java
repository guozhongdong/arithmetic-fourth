package com.gzd.arithmetic.chapter2.primary;

/**
 * @author gzd
 * @date 2020/7/18 下午4:34
 *
 * 插入排序，对标选择排序，这个算法在效率上有所提高，选择是对有序序列排序时，时间还是平方级
 * 插入排序对有序序列排序时 是常数级
 */
public class Insertion {

    public static void sort(Comparable[] a){
        int N = a.length;
        for (int i = 0; i < N ; i++) {

            for (int j = i;j>0 && less(a[j],a[j-1])  ; j--) {

                exch(a,j,j-1);
            }
        }

    }

    private static boolean less(Comparable v,Comparable w){

        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[]a,int i,int j){
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

    private static boolean isSorted(Comparable[] a){
        //测试数据元素是否有序
        for (int i = 1; i < a.length; i++) {
            if (less(a[i],a[i-1])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] a = {"myh","bed","bug","dad","yes","zoo"};
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
