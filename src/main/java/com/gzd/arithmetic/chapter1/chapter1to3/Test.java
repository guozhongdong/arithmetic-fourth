package com.gzd.arithmetic.chapter1.chapter1to3;

/**
 * @author gzd
 * @date 2020/7/11 下午3:11
 */
public class Test {

    public static void main(String[] args) {
        FixedCapacityStack<String> fixed = new FixedCapacityStack(100);
        String str = "to be or not to - be - - that - - - is";
        String[] strs  = str.split(" ");
        for (int i = 0; i < strs.length; i++) {
            String item = strs[i];
            if (!item.equals("-")){
                fixed.push(item);
            }else if (!fixed.isEmpty()){
                System.out.print(fixed.pop()+" ");
            }
        }
        System.out.println("==="+fixed.size());
    }
}
