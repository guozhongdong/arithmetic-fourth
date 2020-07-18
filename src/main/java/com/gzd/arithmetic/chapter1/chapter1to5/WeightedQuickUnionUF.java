package com.gzd.arithmetic.chapter1.chapter1to5;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gzd
 * @date 2020/7/18 下午3:13
 *
 * 加权quick-union 算法
 */
public class WeightedQuickUnionUF {

    private int[] id; //父链接数组(由触点索引)
    private int[] sz; //各个根节点所对应的分量的大小
    private int count; //连通分量的数量


    public WeightedQuickUnionUF(int N){
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            sz[i] = i;
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
        int  i = find(p);
        int  j = find(q);
        if (i == j){
            return;
        }
        //将小树的根节点，链接到大树的根节点
        if (sz[i] < sz[j]){
            id[i] = j;
            sz[j] += sz[i];
        }else {
            id[j] = i;
            sz[i] += sz[j];
        }

        // 连通量就少一个
        count--;
    }

    public static void main(String[] args) {
        int N = 10;
        WeightedQuickUnionUF uf = new WeightedQuickUnionUF(N);
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
