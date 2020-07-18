package com.gzd.arithmetic.chapter1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author gzd
 * @date 2020/7/5 下午3:05
 */
public class LianXi {

    public static void main(String[] args) {
        //1.1.1
        System.out.println((0+15)/2);  // 7
        System.out.println((2.0e-6)*100000000.1); //200.0000002
        System.out.println(true && false || true && true); // true
        System.out.println();
        //1.1.2
        System.out.println((1+2.236)/2);  // 1.618 double
        System.out.println(1+2+3+4.0);  // 10.0 double
        System.out.println(4.1 >= 4);  // true
        System.out.println(1+2+"3");  //33
        System.out.println();
        //1.1.3
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a== b && b== c){
            StdOut.println("equals");
        }else{
            StdOut.println("not equals");
        }
        System.out.println();
    }
}
