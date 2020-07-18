package com.gzd.arithmetic.chapter1.chapter1to5;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gzd
 * @date 2020/7/18 下午3:10
 */
public class FindUnionUF {

    private int[] id;
    private int count;

    public FindUnionUF(int N){
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public int count(){
        return count;
    }

    public boolean connected(int p,int q){
        return find(p) == find(q);
    }
    public int find(int p){
        //找出分量的名称
        while (p != id[p]){
            p = id[p];
        }
        return p;
    }

    public void union(int p,int q){
        //将p和q的根节点统一
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot == qRoot){
            return;
        }
        id[pRoot] = qRoot;
        // 连通量就少一个
        count--;
    }

    public static void main(String[] args) {
        int N = 10;
        FindUnionUF uf = new FindUnionUF(N);
        Map<Integer,Integer> map = new HashMap<>();
        map.put(4,3);
        map.put(3,8);
        map.put(6,5);
        map.put(9,4);
        map.put(2,1);
        map.put(8,9);
        map.put(5,0);
        map.put(7,2);
        map.put(6,1);
        map.put(1,0);
        map.put(6,7);
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            int p = entry.getKey();
            int q = entry.getValue();
            if (uf.connected(p,q))
                continue;
            uf.union(p,q);
        }

        System.out.println(uf.count + " compenents" );

    }
}
