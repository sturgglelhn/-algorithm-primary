package class03;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * @author: 南哥
 * @date: 2023/5/1 21:30
 * @ClassName: Code05_HastMapTreeMap
 */
public class Code05_HastMapTreeMap {


    // (K V)表
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("lihaonan", "我是张三");
        System.out.println(map.containsKey("lihaonan"));
        System.out.println(map.containsKey("li"));
        System.out.println(map.get("lihaonan"));

        map.put("lihaonan", "陈吕琦");
        System.out.println(map.get("lihaonan"));

        map.remove("lihaonan");
        System.out.println(map.containsKey("lihaonan"));
        System.out.println(map.get("lihaonan"));

        System.out.println("======");

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(1234567, "我是1234567");

        Integer a = 1234567;
        Integer b = 1234567;

        System.out.println(a == b);
        System.out.println(map2.containsKey(a));
        System.out.println(map2.containsKey(b));

        System.out.println("===========");

        TreeMap<Integer, String> treeMap1 = new TreeMap<>();
        treeMap1.put(3, "我是3");
        treeMap1.put(0, "我是3");
        treeMap1.put(7, "我是3");
        treeMap1.put(2, "我是3");
        treeMap1.put(5, "我是3");
        treeMap1.put(9, "我是3");

        System.out.println(treeMap1.containsKey(7));
        System.out.println(treeMap1.containsKey(6));
        System.out.println(treeMap1.get(3));

        treeMap1.put(3, "他是3");
        System.out.println(treeMap1.get(3));

        treeMap1.remove(3);
        System.out.println(treeMap1.get(3));

        System.out.println(treeMap1.firstKey());
        System.out.println(treeMap1.lastKey());
        // <= 8 离8最近的key告诉我
        System.out.println(treeMap1.floorKey(8));
        // => 6 离6最近的key告诉我
        System.out.println(treeMap1.ceilingKey(6));
    }
}
