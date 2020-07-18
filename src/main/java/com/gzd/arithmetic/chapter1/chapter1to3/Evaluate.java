package com.gzd.arithmetic.chapter1.chapter1to3;

import java.util.Stack;

/**
 * @author gzd
 * @date 2020/7/11 下午2:40
 */
public class Evaluate {

    public static void main(String[] args) {

        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();
        String s1 = "(1+((2+3)*(4*5)))";

        for (int i = 0; i < s1.length(); i++) {

            String s = String.valueOf(s1.charAt(i));
            if (s.equals("("));
            else if (s.equals("+")){
                ops.add(s);
            }else if (s.equals("-")){
                ops.add(s);
            }else if (s.equals("*")){
                ops.add(s);
            }else if (s.equals("/")){
                ops.add(s);
            }else if (s.equals("sqrt")){
                ops.add(s);
            }else if (s.equals(")")){
                String op = ops.pop();
                Double v = vals.pop();
                if (op.equals("+")){
                    v = vals.pop() + v;
                }else if (op.equals("-")){
                    v = vals.pop() - v;
                }else if (op.equals("*")){
                    v = vals.pop() * v;
                }else if (op.equals("/")){
                    v = vals.pop()/v;
                }else if (op.equals("sqrt")){
                    v = Math.sqrt(v);
                }
                vals.push(v);
            }else {
                vals.push(Double.valueOf(s));
            }
        }



        System.out.println(vals.pop());

    }
}
