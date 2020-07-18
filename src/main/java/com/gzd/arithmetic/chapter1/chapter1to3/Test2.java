package com.gzd.arithmetic.chapter1.chapter1to3;

/**
 * @author gzd
 * @date 2020/7/11 下午3:46
 */
public class Test2 {

    public static void main(String[] args) {
        Queue<String> fixed = new Queue();
        String str = "to be or not to - be - - that - - - is";
        String[] strs  = str.split(" ");
        for (int i = 0; i < strs.length; i++) {
            String item = strs[i];
            if (!item.equals("-")){
                fixed.enqueue(item);
            }else if (!fixed.isEmpty()){
                System.out.print(fixed.dequeue()+" ");
            }
        }
        System.out.println("==="+fixed.size());
    }
}
