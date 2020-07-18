package com.gzd.arithmetic.chapter2.primary;

/**
 * @author gzd
 * @date 2020/7/18 下午5:35
 *
 * 希尔排序，改进了插入排序，排序的时间达不到平方级
 */
public class Shell {

    public static void sort(Comparable[] a){
        int N = a.length;
        // 这个h很重，是一个递增因子
        int h =1;
        while (h < N/3) {
            h = 3*h + 1;
        }
        //最终排序的时候，在递减回来
        while (h >= 1){
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j],a[j-h]) ; j-=h) {
                    exch(a,j,j-h);
                }
            }
            h = h/3;
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
        String[] a = {"s","h","e","l","l","s","o","r","t","e","x","a","m","p","l","e"};
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
